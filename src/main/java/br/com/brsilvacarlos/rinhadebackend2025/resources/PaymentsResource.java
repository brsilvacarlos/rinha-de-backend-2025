package br.com.brsilvacarlos.rinhadebackend2025.resources;

import br.com.brsilvacarlos.rinhadebackend2025.restclient.PaymentProcessorClient;
import br.com.brsilvacarlos.rinhadebackend2025.vo.PaymentVO;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

/**
 * @author carlos
 */
@Path("/payments")
public class PaymentsResource {

    @Inject
    PaymentProcessorClient paymentProcessorClient;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public int payments(PaymentVO payload) {
        try (final Response response = paymentProcessorClient.payments(payload);){
            System.out.println(response);
            return response.getStatus();
        }

//        Qualquer resposta na faixa 2XX (200, 201, 202, etc) é válida. O corpo da resposta não será validado – pode ser qualquer coisa ou até vazio.
//        return 201;
    }
}
