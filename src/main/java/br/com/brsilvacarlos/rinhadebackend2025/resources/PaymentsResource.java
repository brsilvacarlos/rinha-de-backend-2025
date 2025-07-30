package br.com.brsilvacarlos.rinhadebackend2025.resources;

import br.com.brsilvacarlos.rinhadebackend2025.vo.PaymentVO;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

/**
 * @author carlos
 */
@Path("/payments")
public class PaymentsResource {

    @POST
    @Consumes("application/json")
    public short payments(PaymentVO payload) {


        System.out.println(payload);
        // TODO
//        Qualquer resposta na faixa 2XX (200, 201, 202, etc) é válida. O corpo da resposta não será validado – pode ser qualquer coisa ou até vazio.
        return 201;
    }
}
