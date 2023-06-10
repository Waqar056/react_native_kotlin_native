package com.kotlinreactdemo2

import android.view.Gravity
import android.widget.Toast
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

class KotlinDemo(private val reactContext:ReactApplicationContext):ReactContextBaseJavaModule(reactContext) {

    override fun getName(): String {
        return "LogModule"
    }
    @ReactMethod
    fun showToast(message:String){
        // show toast
        val toast = Toast.makeText(reactContext, message, Toast.LENGTH_LONG)
        toast.show()
        // show in console log
        println(message)
    }
}