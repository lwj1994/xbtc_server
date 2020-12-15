package com.lwjlol

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*
import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.html.*
import kotlinx.html.*
import kotlinx.css.*
import io.ktor.gson.*
import io.ktor.features.*
import io.ktor.client.*
import io.ktor.http.content.*

fun main(args: Array<String>): Unit = io.ktor.server.tomcat.EngineMain.main(args)

@Suppress("unused") // Referenced in application.conf
fun Application.module() {
    install(ContentNegotiation) {
        gson {
        }
    }
    routing {

        get("/xbtc/privacy-policy") {
            val resolveResource = call.resolveResource("xbtc_privacy_policy.html", "web")
            resolveResource?.let {
                call.respond(it)
            }
        }
        get("/xbtc/user-policy") {
            val resolveResource = call.resolveResource("xbtc_user_policy.html", "web")
            resolveResource?.let {
                call.respond(it)
            }
        }

    }
}

