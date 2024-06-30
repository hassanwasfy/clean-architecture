package com.abaferas.domain.repository

import com.abaferas.domain.model.DomainModel

interface DomainRepository {
    fun getSomething(): DomainModel
    fun getDocstors()
    fun setDoctors()
    fun patients()
    fun setPatients()
    fun facilities()
}