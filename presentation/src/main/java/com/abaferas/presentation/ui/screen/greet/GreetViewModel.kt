package com.abaferas.presentation.ui.screen.greet

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class GreetViewModel @Inject constructor()
    : ViewModel() {
    val greeting = "Hello, World!"

    fun greet() = greeting

}