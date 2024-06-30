package com.abaferas.domain.usecase

import com.abaferas.domain.repository.DomainRepository

class DomainSomethingUseCase(
    private val domainRepository: DomainRepository
) {

    suspend operator fun invoke(){
        domainRepository.getSomething()
    }
}