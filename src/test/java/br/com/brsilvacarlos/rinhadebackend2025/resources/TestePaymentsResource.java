package br.com.brsilvacarlos.rinhadebackend2025.resources;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

/**
 * @author carlos
 */
@QuarkusTest
class TestePaymentsResource {

    @Test
    void testPayments() {
        String body = """
                {
                    "correlationId": "4a7901b8-7d26-4d9d-aa19-4dc1c7cf60b3",
                    "amount": 19.90
                }
                """;
        given()
                .contentType(ContentType.JSON)
                .body(body)
                .when().post("/payments")
                .then()
                .statusCode(200);
    }
}