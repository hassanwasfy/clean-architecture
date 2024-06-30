package com.abaferas.presentation.ui.screen.greet

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle


@Composable
fun Greeting(viewModel: GreetViewModel = hiltViewModel()) {
    val state = viewModel.uiState.collectAsStateWithLifecycle()
    GreetingContent(state.value)
}

@Composable
fun GreetingContent(state: GreetUiState) {
    TextField(
        value = state.text,
        onValueChange = { /*TODO*/ },
        label = { Text("Name") },
        isError = state.isError
    )
}
