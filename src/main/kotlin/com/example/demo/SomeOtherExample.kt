package com.example.demo

import org.springframework.stereotype.Component

@Component
class SomeOtherExample : HealthDependency("other") {
    override fun provideHealthStatus(): Pair<Alive, Details> = false to "nooo"
}