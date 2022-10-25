package com.sibela.navigationbetweenmodules

import android.app.Application
import com.sibela.firstmodule.FirstModuleKoinContext
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.ERROR)
            androidContext(this@MyApplication)
            modules(AppModules.modules)
            FirstModuleKoinContext.koinApp = this
        }
    }
}