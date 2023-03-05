package com.tonnie.ipl.xpto.tracking.vehicle.client.config;

import org.openapitools.client.ApiClient;
import org.openapitools.client.api.TelemetryProfileApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TelemetryProfileIntegrationConfig {

    @Value("${client.integration.tracking.telemetry-profile.base-path}")
    private String basePath;

    @Bean
    public TelemetryProfileApi telemetryProfileApi() {
        var apiClient = new ApiClient();
        apiClient.setBasePath(basePath);

        return new TelemetryProfileApi(apiClient);
    }
}
