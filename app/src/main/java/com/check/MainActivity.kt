package com.check

import android.os.Bundle

class MainActivity : AppBase() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /* You can perform your tasks based on internet connection just comment the super.onNetworkChanged method so it doesn't inherit the parent(abstracted) logic */
    override fun onNetworkChanged(isConnected: Boolean) {
//        super.onNetworkChanged(isConnected)
    }
}