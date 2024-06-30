package com.abaferas.domain.usecase

import com.abaferas.domain.model.DomainModel
import com.abaferas.domain.repository.DomainRepository

class DomainSomethingUseCase(
    private val domainRepository: DomainRepository
) {

    suspend operator fun invoke(customer: String): DomainModel{
        val value = domainRepository.getSomething()
        return value
    }
}