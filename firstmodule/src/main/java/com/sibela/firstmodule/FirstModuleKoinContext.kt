package com.sibela.firstmodule

import org.koin.core.KoinApplication
import org.koin.dsl.koinApplication

object FirstModuleKoinContext {
    var koinApp: KoinApplication? = null
}

fun startFirstModule() {
    FirstModuleKoinContext.koinApp = FirstModuleKoinContext.koinApp ?: koinApplication {
        modules(FirstModuleModules.modules)
    }
}