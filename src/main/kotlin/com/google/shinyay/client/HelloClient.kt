package com.google.shinyay.client

import org.springframework.http.MediaType
import org.springframework.web.reactive.function.client.WebClient


class HelloClient(val client: WebClient = WebClient.create("http://localhost:8080")) {
    var result = client.get()
            .uri("/hello")
            .accept(MediaType.APPLICATION_JSON)
            .exchange()
}