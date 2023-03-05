package com.tonnie.ipl.xpto.tracking.vehicle.client.config;

import org.openapitools.client.ApiClient;
import org.openapitools.client.api.CustomerApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerIntegrationConfig {

    @Value("${client.integration.tracking.customer.base-path}")
    private String basePath;

    @Bean
    public CustomerApi customerApi() {
        var apiClient = new ApiClient();
        apiClient.setBasePath(basePath);

        return new CustomerApi(apiClient);
    }
}
