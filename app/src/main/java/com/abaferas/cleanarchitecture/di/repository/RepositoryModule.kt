package com.abaferas.cleanarchitecture.di.repository

import com.abaferas.data.repository.DomainRepositoryImpl
import com.abaferas.domain.repository.DomainRepository
import com.google.android.datatransport.runtime.dagger.Provides
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    fun provideDomainRepository(domainRepositoryImpl: DomainRepositoryImpl): DomainRepository = domainRepositoryImpl
}