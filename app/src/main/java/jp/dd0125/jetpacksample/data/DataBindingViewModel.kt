package jp.dd0125.jetpacksample.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class DataBindingViewModel : ViewModel() {
    private val _flag = MutableLiveData<Boolean>().apply {
        value = false
    }

    val flag: LiveData<Boolean>
        get() = _flag

    fun toggle() {
        _flag.postValue(!(flag.value ?: false))
    }
}