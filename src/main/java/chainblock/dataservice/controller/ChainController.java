package chainblock.dataservice.controller;

import java.util.List;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.validation.Valid;


import chainblock.dataservice.domain.Block;
import chainblock.dataservice.domain.Purchaser;
import chainblock.dataservice.service.IChainService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;

@Controller("/chain")
public class ChainController {
	
	Logger logger = Logger.getLogger(getClass().getName());
	
	@Inject
    protected IChainService chainService;
	
	@Post(produces = MediaType.APPLICATION_JSON)
    public HttpResponse<Block> save(@Body @Valid Purchaser purchaser){
		logger.info("/chain");
        return HttpResponse
                .created(chainService.generate(purchaser)).status(HttpStatus.OK);
    }
	
	@Post(uri = "/valid", produces = MediaType.APPLICATION_JSON)
    public HttpResponse<Boolean> isChainValid(@Body @Valid List<Block> list){
		logger.info("/valid");
        return HttpResponse
                .created(chainService.isChainValid(list)).status(HttpStatus.OK);
    }
}
