package chainblock.dataservice.service;

import java.util.List;

import chainblock.dataservice.domain.Block;
import chainblock.dataservice.domain.Purchaser;

interface ChainService {
	
	Block generate(Purchaser purchaser);
	
	Boolean isChainValid(List<Block> blockchain);
}
