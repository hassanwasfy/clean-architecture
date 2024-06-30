package com.abaferas.data.mappers

import com.abaferas.data.models.DataModel
import com.abaferas.domain.model.DomainModel


fun DomainModel.toDataModel(): DataModel {
    return DataModel(
        this.id,
        this.name,
        "",
        true
    )
}

fun DataModel.toDomainModel(): DomainModel {
    return DomainModel(
        this.id,
        this.name,
    )
}