package com.sibela.navigationbetweenmodules

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

private val viewModels = module {
    viewModel { MainViewModel() }
}

object AppModules {
    val modules = viewModels
}