package com.abaferas.domain.error

class DomainError: Exception() {
    override val message: String
        get() = "Domain error"

}