package chainblock.dataservice.service;

import java.util.List;
import java.util.logging.Logger;

import javax.inject.Singleton;

import com.google.gson.GsonBuilder;

import chainblock.dataservice.domain.Block;
import chainblock.dataservice.domain.Purchaser;

@Singleton
public class IChainService implements ChainService {
	
	Logger logger = Logger.getLogger(getClass().getName());
	public static int difficulty = 4;

	@Override
	public Block generate(Purchaser purchaser) {
		logger.info("generate: ".concat(purchaser.getVenda().toString()));
		String purchaserJson = new GsonBuilder().setPrettyPrinting().create().toJson(purchaser);
		Block block = new Block(purchaserJson, purchaser.getPreviousHash());
		block.mineBlock(difficulty);
		return block;
	}

	@Override
	public Boolean isChainValid(List<Block> blockchain) {
		Block currentBlock; //bloco corrente
		Block previousBlock; //bloco anterior
		String hashTarget = new String(new char[difficulty]).replace('\0', '0');
		
		//loop through blockchain to check hashes:
		for(int i=1; i < blockchain.size(); i++) {
			currentBlock = blockchain.get(i);
			previousBlock = blockchain.get(i-1);
			
			//compare registered hash and calculated hash:
			if(!currentBlock.hash.equals(currentBlock.calculateHash()) ){
				logger.info("isChainValid: ".concat("Current Hashes not equal"));	
				return false;
			}
			
			//compare previous hash and registered previous hash
			if(!previousBlock.hash.equals(currentBlock.previousHash) ) {
				logger.info("isChainValid: ".concat("Previous Hashes not equal"));
				return false;
			}
			
			//check if hash is solved
			if(!currentBlock.hash.substring( 0, difficulty).equals(hashTarget)) {
				logger.info("isChainValid: ".concat("This block hasn't been mined"));
				return false;
			}
		}
		return true;
	}

}
