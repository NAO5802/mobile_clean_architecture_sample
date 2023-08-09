package com.example.domain

import com.example.domain.model.Dog
import kotlinx.coroutines.flow.Flow

interface GetRandomDogUseCase {
    suspend operator fun invoke(): Flow<Dog>
}