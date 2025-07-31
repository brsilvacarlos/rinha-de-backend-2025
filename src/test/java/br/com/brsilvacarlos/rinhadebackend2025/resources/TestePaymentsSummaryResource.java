package br.com.brsilvacarlos.rinhadebackend2025.resources;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

/**
 * @author carlos
 */
@QuarkusTest
class TestePaymentsSummaryResource {


    @Test
    void testPayments() {
        given()
                .when().get("/payments-summary?from=2025-07-31T01:27:49.248Z&to=2025-07-31T01:28:02.748Z")
                .then()
                .statusCode(200);
    }
}