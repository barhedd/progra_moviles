package com.barahona.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    var query = MutableLiveData<String>("")
    var result = Transformations.map(query) { textQuery ->
        if ( textQuery.isEmpty() )
            "Ingrese un valor para la búsqueda"
        else
             "El resultado para la query $textQuery es este"
    }

    @Deprecated("Please use livedata subscription")
    fun onSearch() {
        // val textQuery = query.value
        // result.value = "El resultado para la query $textQuery es este"
    }
}