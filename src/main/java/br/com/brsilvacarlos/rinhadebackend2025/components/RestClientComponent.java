package br.com.brsilvacarlos.rinhadebackend2025.components;

import br.com.brsilvacarlos.rinhadebackend2025.repository.RepositoryInMemory;
import br.com.brsilvacarlos.rinhadebackend2025.restclient.PaymentProcessorClient;
import br.com.brsilvacarlos.rinhadebackend2025.restclient.PaymentProcessorTarget;
import br.com.brsilvacarlos.rinhadebackend2025.vo.PaymentVO;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.inject.RestClient;

/**
 * Esse componente é responsável por gerenciar
 * @author carlos
 */
@Singleton
public class RestClientComponent {

    @RestClient
    PaymentProcessorClient client;

    @Inject
    RepositoryInMemory repository;

    /**
     * Delega o pagamento para o payment processor.
     *
     * @param payment payload de pagamento recebido
     * @return status code que o controller deve retornar
     */
    public int delegatePayment(PaymentVO payment){

        try (final Response res = client.payments(PaymentProcessorTarget.DEFAULT.getBaseURI(), payment)){
            if (res.getStatusInfo().getFamily() == Response.Status.Family.SUCCESSFUL){
                repository.registerPayment(PaymentProcessorTarget.DEFAULT, payment);
                return 201;
            } else {
                try (final Response resFall = client.payments(PaymentProcessorTarget.FALLBACK.getBaseURI(), payment)){
                    if (res.getStatusInfo().getFamily() == Response.Status.Family.SUCCESSFUL){
                        repository.registerPayment(PaymentProcessorTarget.FALLBACK, payment);
                        return 201;
                    }
                }
            }
        }

        return 503;
    }

    private PaymentProcessorTarget getTarget() {
        // melhorar isso
        return PaymentProcessorTarget.DEFAULT;
    }


}
