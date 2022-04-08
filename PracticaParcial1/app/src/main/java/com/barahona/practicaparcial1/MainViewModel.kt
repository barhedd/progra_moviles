package com.barahona.practicaparcial1

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    var scoreTeamA = MutableLiveData(0)
    var scoreTeamB = MutableLiveData(0)
}