package com.blackfox.budgetplanner.repository

import co.touchlab.kermit.Logger
import co.touchlab.kermit.NSLogLogger
import org.koin.dsl.module
import platform.Foundation.NSDocumentDirectory
import platform.Foundation.NSSearchPathForDirectoriesInDomains
import platform.Foundation.NSUserDomainMask

actual fun getApplicationFilesDirectoryPath(): String =
    NSSearchPathForDirectoriesInDomains(NSDocumentDirectory, NSUserDomainMask, true)[0] as String

actual fun platformModule() = module {
    single<Logger>{ NSLogLogger() }
}
