package br.com.brsilvacarlos.rinhadebackend2025;

import java.util.UUID;

/**
 * @author carlos
 */
public record PaymentVO(UUID correlationId, Float amount) {}
