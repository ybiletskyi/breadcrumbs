package com.breadcrumbs

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform