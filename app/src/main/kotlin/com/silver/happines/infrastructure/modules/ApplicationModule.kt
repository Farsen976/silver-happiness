package com.silver.happines.infrastructure.modules

import io.ktor.server.application.*
import io.ktor.features.*
import org.koin.core.parameter.parametersOf
import org.koin.ktor.ext.Koin
import org.koin.ktor.ext.inject
import com.example.plugins.*

fun Application.module() {
    configureRouting()

    install(Koin) {
        modules(appModule)
    }
}