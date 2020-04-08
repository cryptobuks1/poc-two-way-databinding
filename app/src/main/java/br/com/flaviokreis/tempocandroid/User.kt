package br.com.flaviokreis.tempocandroid

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class User: BaseObservable() {

    @get:Bindable
    var name: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.name)
            visible = email.isNotEmpty() && name.isNotEmpty()
        }

    @get:Bindable
    var email: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.email)
            visible = email.isNotEmpty() && name.isNotEmpty()
        }

    @get:Bindable
    var visible: Boolean = false
        set(value) {
            field = value
            notifyPropertyChanged(BR.visible)
        }
}