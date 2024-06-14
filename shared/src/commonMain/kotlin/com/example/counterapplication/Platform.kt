package com.example.counterapplication

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform