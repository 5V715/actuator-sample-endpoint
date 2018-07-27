package com.example.demo

import org.springframework.boot.actuate.endpoint.annotation.Endpoint
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation
import org.springframework.stereotype.Component

@Component
@Endpoint(id = "healthcheck")
class HealthCheck(val healthDependencies: Collection<HealthDependency>) {

    @ReadOperation
    fun healthCheck() =
        mapOf("services" to healthDependencies.map { it.health() })
}