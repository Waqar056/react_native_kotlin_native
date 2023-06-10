package com.kotlinreactdemo2

import android.view.View
import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.ReactShadowNode
import com.facebook.react.uimanager.ViewManager
import java.util.Collections

class MyModule():ReactPackage {
    override fun createNativeModules(reactContext: ReactApplicationContext): List<NativeModule> {
        val modules = ArrayList<NativeModule>()
        modules.add(KotlinDemo(reactContext))
        return modules
    }

    override fun createViewManagers(reactContext: ReactApplicationContext): List<ViewManager<*, *>> {
        return Collections.emptyList<ViewManager<*, *>>()

    }
//    override fun createNativeModules(reactContext: ReactApplicationContext): List<NativeModule> {
//        val modules = ArrayList<NativeModule>()
//        modules.add(KotlinDemo(reactContext))
//        return modules
//    }
//
//    override fun createViewManagers(reactContext: ReactApplicationContext): List<ViewManager<*, *>> {
//        return Collections.emptyList<ViewManager<*, *>>()
//    }
}