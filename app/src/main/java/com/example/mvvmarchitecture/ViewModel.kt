package com.example.mvvmarchitecture

import android.util.Patterns
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class LoginViewModel : BaseObservable() {
    private val model : Model = Model("", "")

    //Getter and setter methods for toast message
    @get:Bindable
    var toastMessage: String? = null
        private set(value) {
            field = value
            notifyPropertyChanged(BR.toastMessage)
        }

    //Getter and setter methods for email variable
    @get:Bindable
    var userEmail: String?
        get() = model.email
        set(value) {
            model.email = value
            notifyPropertyChanged(BR.userEmail)
        }

    //Getter and setter methods for password variable
    @get:Bindable
    var userPassword: String?
        get() = model.password
        set(value) {
            model.password = value
            notifyPropertyChanged(BR.userPassword)
        }

    fun onButtonClicked() {
        toastMessage = if (!userEmail.isNullOrEmpty() &&
            Patterns.EMAIL_ADDRESS.matcher(userEmail!!).matches() &&
            !userPassword.isNullOrEmpty() &&
            userPassword!!.length > 5
        ) {
            "Login Successful"
        } else {
            "Email or Password is not valid"
        }
    }

}