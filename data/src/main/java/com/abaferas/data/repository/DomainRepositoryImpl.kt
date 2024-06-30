package com.abaferas.data.repository

import com.abaferas.data.mappers.toDomainModel
import com.abaferas.data.source.LocalDataSource
import com.abaferas.data.source.RemoteDataSource
import com.abaferas.domain.model.DomainModel
import com.abaferas.domain.repository.DomainRepository
import com.google.gson.annotations.SerializedName
import javax.inject.Inject

class DomainRepositoryImpl @Inject constructor(
    private val remoteDataSource: RemoteDataSource,
    private val localDataSource: LocalDataSource
): DomainRepository {

    override fun getSomething(): DomainModel {
        return remoteDataSource.getSomething().toDomainModel()
    }

    override fun getDocstors() {

    }

    override fun patients() {
        TODO("Not yet implemented")
    }

    override fun facilities() {
        TODO("Not yet implemented")
    }

    override fun setDoctors() {
        TODO("Not yet implemented")
    }

    override fun setPatients() {
        TODO("Not yet implemented")
    }
}