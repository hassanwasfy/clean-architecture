package com.abaferas.data.source

import com.abaferas.data.models.DataModel
import com.abaferas.domain.model.DomainModel

interface RemoteDataSource {
    fun getSomething(): DataModel
}