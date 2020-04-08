package br.com.flaviokreis.tempocandroid

import android.net.Uri
import android.view.View
import androidx.databinding.ObservableField
import androidx.fragment.app.Fragment
import androidx.fragment.app.findFragment
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController

class UserViewModel : ViewModel(), UserInterface {
    val user = User()
    val result = ObservableField<String>()
    val resultLiveData = MutableLiveData<String>()

    override fun onClickButton() {
        result.set("${user.name}, ${user.email}")
        result.notifyChange()

        resultLiveData.value = "${user.name}, ${user.email}"
    }

    override fun onClickNextButton(view: View) {
        val uri = Uri.parse("app://page/another")
        view.findNavController().navigate(uri)
    }
}