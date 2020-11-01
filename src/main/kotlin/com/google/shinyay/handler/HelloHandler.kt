package com.google.shinyay.handler

import org.springframework.http.MediaType
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Component
class HelloHandler {

    fun hello(request: ServerRequest): Mono<ServerResponse> {
        val json = """
                |{
                |    "message" : "Hello"
                |}
        """.trimMargin()
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(Flux.just(json), String::class.java)
    }
}