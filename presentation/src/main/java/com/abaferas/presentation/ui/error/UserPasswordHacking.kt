package com.abaferas.presentation.ui.error

class UserPasswordHacking: Exception() {
    override val message: String
        get() = "User password hacking detected!"
}