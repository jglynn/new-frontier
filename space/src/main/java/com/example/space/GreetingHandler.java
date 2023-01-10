package com.example.space;

import java.util.HashMap;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;

@Component
public class GreetingHandler {
    
  public Mono<ServerResponse> hello(ServerRequest request) {
    return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
      .body(BodyInserters.fromValue(new Greeting("Welcome to Codespaces.")));
  }
 
  public Mono<ServerResponse> index(ServerRequest request) {
    return ServerResponse.ok().render("index", new HashMap<String,String>());
  }

}
