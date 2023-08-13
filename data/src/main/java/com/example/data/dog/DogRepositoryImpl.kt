package com.example.data.dog

import DogRepository
import com.example.domain.model.Dog
import javax.inject.Inject

class DogRepositoryImpl @Inject constructor(
    private val dogDataSource: DogDataSource,
    private val dataToDomainMapper: DataToDomainMapper
): DogRepository {
    override suspend fun getRandom(): Dog {
        return try {
            val dogImage = dogDataSource.getRandomDogImage()
            dataToDomainMapper.toDomain(dogImage)
        } catch (e: Throwable) {
            dataToDomainMapper.toDomain(e)
        }
    }
}