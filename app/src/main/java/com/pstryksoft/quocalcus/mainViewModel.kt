package com.pstryksoft.quocalcus

import android.app.Application
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.AndroidViewModel

class mainViewModel (application: Application): AndroidViewModel(application) {
    var departure by mutableStateOf("")
    var destination by mutableStateOf("")
    var result by mutableStateOf("")

}