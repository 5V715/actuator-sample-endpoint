package com.example.demo

typealias Alive = Boolean
typealias Details = String

abstract class HealthDependency(private val name: String) {

    fun health() = render { provideHealthStatus() }

    abstract fun provideHealthStatus(): Pair<Alive, Details>

    private fun render(check: () -> Pair<Alive, Details>) =
        check().let { (alive, details) ->
            ServiceStatus(name, alive, details)
        }
}
