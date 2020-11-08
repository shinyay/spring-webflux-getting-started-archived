package com.google.shinyay.client

import org.springframework.web.reactive.function.client.WebClient

class HelloClient(val client: WebClient = WebClient.create("http://localhost:8080")) {

}