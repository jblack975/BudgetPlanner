package com.blackfox.budgetplanner.repository

import android.content.Context
import co.touchlab.kermit.LogcatLogger
import co.touchlab.kermit.Logger
import org.koin.dsl.module

lateinit var appContext: Context

actual fun getApplicationFilesDirectoryPath(): String =
    appContext.filesDir.absolutePath

actual fun platformModule() = module {
    single<Logger>{ LogcatLogger() }
}