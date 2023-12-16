package com.check

import android.app.Application
import android.widget.Toast

class CheckInternetApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        NetworkUtil.registerConnectivityReceiver(this)
//        NetworkUtil.setConnectivityChangeListener(this)
    }

//    override fun onNetworkChanged(isConnected: Boolean) {
//        if (isConnected) {
//            Toast.makeText(this, "Internet Connection is Available Now", Toast.LENGTH_SHORT).show()
//        } else {
//            Toast.makeText(this, "No Internet Connection", Toast.LENGTH_SHORT).show()
//        }
//    }
}