package com.abaferas.data.repository

import com.abaferas.data.source.LocalDataSource
import com.abaferas.data.source.RemoteDataSource
import com.abaferas.domain.repository.DomainRepository
import javax.inject.Inject

class DomainRepositoryImpl @Inject constructor(
    private val remoteDataSource: RemoteDataSource,
    private val localDataSource: LocalDataSource
): DomainRepository {

    override fun getSomething() {

    }
}