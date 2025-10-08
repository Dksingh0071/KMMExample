package com.deepak.android.kmmexample

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform