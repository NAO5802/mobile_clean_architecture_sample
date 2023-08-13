package com.example.data.dog

import com.example.domain.model.Dog
import javax.inject.Inject

class DataToDomainMapper @Inject constructor(){
    fun toDomain(string: String) : Dog {
        return Dog.Success(string)
    }

    fun toDomain(throwable: Throwable): Dog {
        return Dog.Failure
    }
}