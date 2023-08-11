package com.example.domain.impl

import DogRepository
import com.example.domain.GetRandomDogUseCase
import com.example.domain.model.Dog
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import javax.inject.Inject

class GetRandomDogUseCaseImpl @Inject constructor(
    private val dogRepository: DogRepository
)
    : GetRandomDogUseCase{
    override suspend fun invoke(): Flow<Dog> {
        return flowOf(dogRepository.getRandom())
    }
}