package com.abaferas.presentation.ui.screen.greet

data class GreetUiState (
    val text: String = "",
    val isLoading: Boolean = true,
    val isError: Boolean = true,
    val errorMsg: String = ""
)