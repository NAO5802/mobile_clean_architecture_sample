package com.example.data.dog

interface DogDataSource {
    suspend fun getRandomDogImage(): String
}