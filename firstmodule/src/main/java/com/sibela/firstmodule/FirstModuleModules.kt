package com.sibela.firstmodule

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

object FirstModuleModules {
    private val viewModels = module {
        viewModel { MainViewModel() }
    }

    val modules = viewModels
}