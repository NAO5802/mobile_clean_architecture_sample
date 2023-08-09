package com.example.domain.model

sealed class Dog {
    data class Success(val image: String) : Dog()
    object Failure: Dog()
}