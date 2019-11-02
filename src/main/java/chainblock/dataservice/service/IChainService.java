package chainblock.dataservice.service;

import javax.inject.Singleton;

import com.google.gson.GsonBuilder;

import chainblock.dataservice.domain.Block;
import chainblock.dataservice.domain.Purchaser;

@Singleton
public class IChainService implements ChainService {

	@Override
	public Block generate(Purchaser purchaser) {
		String purchaserJson = new GsonBuilder().setPrettyPrinting().create().toJson(purchaser);
		Block block = new Block(purchaserJson, purchaser.getPreviousHash());
		return block;
	}

}
