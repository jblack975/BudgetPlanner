package com.blackfox.budgetplanner.di

import co.touchlab.kermit.Kermit
import com.blackfox.budgetplanner.repository.platformModule
import kotlinx.serialization.json.Json
import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.module

fun initKoin(enableNetworkLogs: Boolean = false, appDeclaration: KoinAppDeclaration = {}) =
    startKoin {
        appDeclaration()
        modules(commonModule(enableNetworkLogs = enableNetworkLogs), platformModule())
    }

// called by iOS etc
fun initKoin() = initKoin(enableNetworkLogs = false) {}

fun commonModule(enableNetworkLogs: Boolean) = module {
    single { createJson() }
    single { Kermit(logger = get()) }
}

fun createJson() = Json { isLenient = true; ignoreUnknownKeys = true }

