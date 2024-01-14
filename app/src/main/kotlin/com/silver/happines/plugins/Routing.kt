package com.example.plugins

import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello World!")
        }
        post("/add") {
            val requestBody = call.receiveParameters()
            val value  = requestBody["username"].toString()
            
            call.respondText("Player ${value} stored correctly ", status = HttpStatusCode.Created)
        }
    }
}