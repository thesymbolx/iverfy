package com.job.jobApplication

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.job.mylibrary.ApiKeys
import com.job.network.API_KEY
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainActivityVM @Inject constructor(
    private val apiKeys: ApiKeys
) : ViewModel() {

    var mainActivityScreenState by mutableStateOf(MainActivityScreenState(false))
        private set

    init {
        apiKeys.getApiKey {
            API_KEY = it
            mainActivityScreenState = mainActivityScreenState.copy(
                hasApiKey = true
            )
        }
    }
}