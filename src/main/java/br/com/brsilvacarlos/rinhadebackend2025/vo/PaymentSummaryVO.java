package br.com.brsilvacarlos.rinhadebackend2025.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author carlos
 */
public record PaymentSummaryVO( @JsonProperty("default") ServiceSummaryVO _default, @JsonProperty("fallback") ServiceSummaryVO _fallback) {}
