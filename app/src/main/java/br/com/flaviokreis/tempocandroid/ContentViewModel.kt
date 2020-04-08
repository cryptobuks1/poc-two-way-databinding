package br.com.flaviokreis.tempocandroid

import android.net.Uri
import android.view.View
import androidx.databinding.ObservableField
import androidx.fragment.app.Fragment
import androidx.fragment.app.findFragment
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController

class ContentViewModel : ViewModel(), UserInterface {

    override fun onClickButton() {

    }

    override fun onClickNextButton(view: View) {
        view.findNavController().navigate(Uri.parse("app://page/user"))
    }
}