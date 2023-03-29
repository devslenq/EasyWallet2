package com.easywallet

import android.app.Application
import com.easywallet.di.application
import com.easywallet.di.dataBase
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class WalletApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@WalletApplication)
            modules(
                application, dataBase
            )
        }
    }
}