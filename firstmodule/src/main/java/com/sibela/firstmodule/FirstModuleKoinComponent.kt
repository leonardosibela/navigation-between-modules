package com.sibela.firstmodule

import org.koin.core.Koin
import org.koin.core.component.KoinComponent

internal interface FirstModuleKoinComponent : KoinComponent {
    override fun getKoin(): Koin = FirstModuleKoinContext.koinApp?.koin
        ?: throw IllegalStateException("Koin has not been started")
}