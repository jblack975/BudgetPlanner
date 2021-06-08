package com.blackfox.budgetplanner.android

import android.app.Application
import co.touchlab.kermit.Kermit
import com.blackfox.budgetplanner.android.di.appModule
import com.blackfox.budgetplanner.di.initKoin
import com.blackfox.budgetplanner.repository.appContext
import org.koin.android.ext.koin.androidContext
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.koin.android.ext.koin.androidLogger

class BudgetPlannerApplication : Application(), KoinComponent {
    private val logger: Kermit by inject()

    override fun onCreate() {
        super.onCreate()

        appContext = this

        initKoin {
            androidLogger()
            androidContext(this@BudgetPlannerApplication)
            modules(appModule)
        }

        logger.d { "ECApplication" }
    }
}