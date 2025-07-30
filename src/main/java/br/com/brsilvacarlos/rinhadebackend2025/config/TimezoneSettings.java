package br.com.brsilvacarlos.rinhadebackend2025.config;

import io.quarkus.runtime.StartupEvent;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Singleton;

import java.util.TimeZone;

@Singleton
public class TimezoneSettings {

    public void setTimezone(@Observes StartupEvent startupEvent) {
        System.setProperty("user.timezone", "UTC");
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
    }
}