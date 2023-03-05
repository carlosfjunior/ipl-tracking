package com.tonnie.ipl.xpto.tracking.vehicle.client.config;

import org.openapitools.client.ApiClient;
import org.openapitools.client.api.DriverApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DriverIntegrationConfig {

    @Value("${client.integration.tracking.driver.base-path}")
    private String basePath;

    @Bean
    public DriverApi driverApi() {
        var apiClient = new ApiClient();
        apiClient.setBasePath(basePath);

        return new DriverApi(apiClient);
    }
}
