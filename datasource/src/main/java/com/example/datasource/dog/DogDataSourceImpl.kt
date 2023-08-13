package com.example.datasource.dog

import ApiClient
import com.example.data.dog.DogDataSource
import javax.inject.Inject

class DogDataSourceImpl @Inject constructor(
    private val apiClient : ApiClient
) : DogDataSource{
    override suspend fun getRandomDogImage(): String {
        TODO("Not yet implemented")
    }
}