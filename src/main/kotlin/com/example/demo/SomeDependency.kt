package com.example.demo

import org.springframework.stereotype.Component

@Component
class SomeDependency : HealthDependency("some") {
    override fun provideHealthStatus(): Pair<Alive, Details> = true to "you"
}