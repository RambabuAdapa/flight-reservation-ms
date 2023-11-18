package com.cloudproject.FlightTicketReservationSystem.exceptions;

public class TicketNotFound extends RuntimeException {
    public TicketNotFound(String message) {
        super(message);
    }
}
