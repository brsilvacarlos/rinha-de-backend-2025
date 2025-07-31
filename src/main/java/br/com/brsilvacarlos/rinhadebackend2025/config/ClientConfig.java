package br.com.brsilvacarlos.rinhadebackend2025.config;

import br.com.brsilvacarlos.rinhadebackend2025.restclient.PaymentProcessorClient;
import io.quarkus.rest.client.reactive.QuarkusRestClientBuilder;
import jakarta.inject.Named;
import jakarta.inject.Singleton;
import jakarta.ws.rs.Produces;

import java.net.URI;

/**
 * @author carlos
 */
@Singleton
public class ClientConfig {

    @Produces
    @Named("default")
    public PaymentProcessorClient clientDefault() {
        return buildClient("8001");
    }

//    @Produces
//    @Named("fallback")
//    public PaymentProcessorClient clientFallback() {
//        return buildClient("8002");
//    }

    private static PaymentProcessorClient buildClient(String port) {
        return QuarkusRestClientBuilder.newBuilder()
                .baseUri(URI.create("http://localhost:"+ port))
                .build(PaymentProcessorClient.class);
    }
}
