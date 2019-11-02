package chainblock.dataservice.service;

import chainblock.dataservice.domain.Block;
import chainblock.dataservice.domain.Purchaser;

interface ChainService {
	
	Block generate(Purchaser purchaser);
}
