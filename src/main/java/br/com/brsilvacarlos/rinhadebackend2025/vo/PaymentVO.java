package br.com.brsilvacarlos.rinhadebackend2025.vo;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.UUID;

/**
 * @author carlos
 */
public record PaymentVO(UUID correlationId, Float amount, ZonedDateTime requestedAt) {

    public PaymentVO {
        if (requestedAt == null)
            requestedAt = ZonedDateTime.now();
    }
}
