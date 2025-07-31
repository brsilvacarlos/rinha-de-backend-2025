package br.com.brsilvacarlos.rinhadebackend2025.restclient;

/**
 * @author carlos
 */
public enum PaymentProcessorTarget {

    DEFAULT("http://localhost:8001"),
    FALLBACK("http://localhost:8002")
    ;

    private final String baseURI;

    PaymentProcessorTarget(String baseURI) {
        this.baseURI = baseURI;
    }

    public String getBaseURI() {
        return baseURI;
    }
}
