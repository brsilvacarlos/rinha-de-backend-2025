package br.com.brsilvacarlos.rinhadebackend2025.restclient;

import br.com.brsilvacarlos.rinhadebackend2025.vo.PaymentVO;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.util.Set;

/**
 * @author carlos
 */
@Path("/payments")
@RegisterRestClient
public interface PaymentProcessorClient {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
//    Set<String> payments(String jsonPayload);
    Response payments(PaymentVO payload);
}
