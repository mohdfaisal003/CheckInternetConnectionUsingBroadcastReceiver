package com.check

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

abstract class AppBase: AppCompatActivity(),NetworkUtil.ConnectivityChangeListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        NetworkUtil.setConnectivityChangeListener(this)
    }

    override fun onNetworkChanged(isConnected: Boolean) {
        if (isConnected) {
            showSnackBar("Internet is Available Now")
        } else {
            showSnackBar("No Internet")
        }
    }

    open fun showSnackBar(message: String?) {
        val rootView = findViewById<View>(android.R.id.content)
        Snackbar.make(rootView,message!!, Snackbar.LENGTH_LONG).show()
    }
}