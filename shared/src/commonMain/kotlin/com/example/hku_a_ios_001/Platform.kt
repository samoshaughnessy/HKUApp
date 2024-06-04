package com.example.hku_a_ios_001

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform