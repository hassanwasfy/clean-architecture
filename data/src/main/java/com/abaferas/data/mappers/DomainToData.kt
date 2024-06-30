package com.abaferas.data.mappers

import com.abaferas.data.models.DataModel
import com.abaferas.domain.model.DomainModel


fun toDataModel(domainModel: DomainModel): DataModel {
    return DataModel(
        domainModel.id,
        domainModel.name,
        "",
        true
    )
}

fun toDomainModel(domainModel: DataModel): DomainModel {
    return DomainModel(
        domainModel.id,
        domainModel.name,
    )
}