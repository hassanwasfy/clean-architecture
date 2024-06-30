package com.abaferas.presentation.ui.screen.greet

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.abaferas.domain.usecase.DomainSomethingUseCase
import com.abaferas.presentation.ui.error.UserPasswordHacking
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GreetViewModel @Inject constructor(
    private val greetUseCase: DomainSomethingUseCase
) : ViewModel() {

    private val state = MutableStateFlow(GreetUiState())

    val uiState = state.asStateFlow()


    init {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val useCaseValue = greetUseCase("Hassan").toUiStateModel()
                state.update {
                    it.copy(
                        text = useCaseValue.name,
                        isLoading = false
                    )
                }
            }catch (e: Exception){
                state.update {
                    it.copy(
                        isLoading = false,
                        isError = true,
                        errorMsg = e.message ?: ""
                    )
                }
            }catch (e: NullPointerException){
                throw  UserPasswordHacking()
            }
        }
    }
}