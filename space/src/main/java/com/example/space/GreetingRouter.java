package com.example.space;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Controller
public class GreetingRouter {
    @Bean
    public RouterFunction<ServerResponse> route(GreetingHandler greetingHandler) {
  
      return RouterFunctions
        .route(GET("/hello").and(accept(MediaType.APPLICATION_JSON)), greetingHandler::hello);
    }
}
