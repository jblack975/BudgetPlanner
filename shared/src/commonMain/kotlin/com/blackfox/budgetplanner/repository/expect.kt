package com.blackfox.budgetplanner.repository

import org.koin.core.module.Module

expect fun platformModule(): Module

expect fun getApplicationFilesDirectoryPath(): String