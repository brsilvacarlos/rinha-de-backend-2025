package br.com.brsilvacarlos.rinhadebackend2025;

import jakarta.json.JsonObject;
import jakarta.ws.rs.BeanParam;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import org.jboss.resteasy.reactive.RestPath;
import org.jboss.resteasy.reactive.RestQuery;

import java.util.UUID;

/**
 * @author carlos
 */
@Path("/payments")
public class PaymentsResource {

    @POST
    @Consumes("application/json")
    public short payments(PaymentVO payload) {

        // TODO
//        Qualquer resposta na faixa 2XX (200, 201, 202, etc) é válida. O corpo da resposta não será validado – pode ser qualquer coisa ou até vazio.
        return 201;
    }
}
