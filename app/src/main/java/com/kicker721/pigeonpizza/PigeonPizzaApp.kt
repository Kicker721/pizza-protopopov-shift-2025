package com.kicker721.pigeonpizza

import android.app.Application
import com.kicker721.pigeonpizza.pizza.di.pizzaModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class PigeonPizzaApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@PigeonPizzaApp)
            modules(
                pizzaModule
            )
        }
    }
}