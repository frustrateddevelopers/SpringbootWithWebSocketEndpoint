package com.example.websocket;

import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * Created by qasim on 4/2/16.
 */
@ConditionalOnWebApplication
@Configuration
public class WebSocketConfigurator {

    @Bean
    public MyEndpoint serverEndpoint() {
        return new MyEndpoint();
    }

    @Bean
    public CitySuburbEndpoint citySuburbEndpoint() {
        return new CitySuburbEndpoint();
    }

    @Bean
    public CityLandmarkEndpoint cityLandmarkEndpoint() {
        return new CityLandmarkEndpoint();
    }

    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }
}
