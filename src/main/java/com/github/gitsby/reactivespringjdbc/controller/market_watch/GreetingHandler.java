package com.github.gitsby.reactivespringjdbc.controller.market_watch;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class GreetingHandler {

	@ApiOperation(value="get customer",response=String.class)
	@ApiResponses(value={
			@ApiResponse(code=200,message="Customer Details Retrieved",response=String.class),
			@ApiResponse(code=500,message="Internal Server Error"),
			@ApiResponse(code=404,message="Customer not found")
	})
	public Mono<ServerResponse> hello(ServerRequest request) {
		return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
			.body(BodyInserters.fromObject("Hello, Spring!"));
	}
}
