package com.job.mylibrary

import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import javax.inject.Inject

class ApiKeys @Inject constructor() {
    fun getApiKey(successListener: (String) -> Unit) {
        val database = Firebase.database
        val myRef = database.getReference("apiKey")

        myRef.get().addOnSuccessListener {
            successListener(it.value.toString())
        }
    }
}