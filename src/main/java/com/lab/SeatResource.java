package com.lab.seat;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/seats")
public class SeatResource {

    @ConfigProperty(name = "seat.capacity", defaultValue = "180")
    int capacity;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public SeatInfo seats() {
        return new SeatInfo("LAB101", capacity, "v1");
    }

    public record SeatInfo(String flight, int capacity, String version) {}
}