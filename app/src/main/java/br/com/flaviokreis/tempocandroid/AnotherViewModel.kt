package br.com.flaviokreis.tempocandroid

import android.net.Uri
import android.view.View
import androidx.databinding.ObservableField
import androidx.fragment.app.Fragment
import androidx.fragment.app.findFragment
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.NavDeepLinkBuilder
import androidx.navigation.findNavController
import androidx.navigation.fragment.FragmentNavigatorExtras

class AnotherViewModel : ViewModel(), UserInterface {

    override fun onClickButton() { }

    override fun onClickNextButton(view: View) {
        val deeplink = NavDeepLinkBuilder(view.context)
        view.findNavController().navigate(Uri.parse("app://page/content/?code={code}"))
    }
}