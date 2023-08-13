package com.example.my_sample_module.navigator

import android.app.Activity
import com.example.feature.dog.navigation.MainNavigator
import javax.inject.Inject

class MainNavigatorImpl @Inject constructor(
    private val activity: Activity
): MainNavigator {
    override fun toLicence() {
        TODO("Not yet implemented")
    }
}