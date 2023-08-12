package com.example.feature.dog.viewmodel

import com.example.domain.GetRandomDogUseCase
import com.example.feature.architecture.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getRandomDogUseCase: GetRandomDogUseCase,
) : ViewModel<MainViewModelState, MainViewModelEvent>(){
    override fun initialState(): MainViewModelState {
        TODO("Not yet implemented")
    }

}