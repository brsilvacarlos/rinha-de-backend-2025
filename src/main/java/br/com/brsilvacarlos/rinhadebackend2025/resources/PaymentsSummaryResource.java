package br.com.brsilvacarlos.rinhadebackend2025.resources;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.jboss.resteasy.reactive.RestQuery;

import java.time.ZonedDateTime;

/**
 * @author carlos
 */
@Path("/payments-summary")
public class PaymentsSummaryResource {

    @GET
    public int payments(@RestQuery ZonedDateTime from, @RestQuery ZonedDateTime to) {

        // TODO
//        Qualquer resposta na faixa 2XX (200, 201, 202, etc) é válida. O corpo da resposta não será validado – pode ser qualquer coisa ou até vazio.
        return 201;
    }
}
