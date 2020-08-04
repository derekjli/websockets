package com.keitakishima.websocketproject;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

//Defines methods for configuring message handling with simple
//messaging protocols (e.g. STOMP) from WebSocket clients.

//Add this annotation to an @Configuration class to enable
//broker-backed messaging over WebSocket using a higher-level messaging sub-protocol.
@Configuration
@EnableWebSocketMessageBroker
public class WebPageConfiguration implements WebSocketMessageBrokerConfigurer {
    //enable an in-memory message broker to carry the messages
    //back to the client on destinations prefixed with “/topic”.
    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        config.enableSimpleBroker("/topic");
        config.setApplicationDestinationPrefixes("/app");
    }

    //come
    //Register STOMP endpoints mapping each to a specific URL
    //and (optionally) enabling and configuring SockJS fallback options.
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/chat");
        registry.addEndpoint("/chat").withSockJS();
    }
}