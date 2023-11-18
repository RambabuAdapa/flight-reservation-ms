package com.cloudproject.FlightTicketReservationSystem.services;


import com.cloudproject.FlightTicketReservationSystem.domains.Reservation;
import com.cloudproject.FlightTicketReservationSystem.dto.ReservationRequest;
import org.springframework.stereotype.Service;

@Service
public interface ReservationService {
    public Reservation bookFlight(ReservationRequest reservationRequest);
}
