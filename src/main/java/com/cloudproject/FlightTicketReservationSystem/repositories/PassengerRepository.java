package com.cloudproject.FlightTicketReservationSystem.repositories;

import com.cloudproject.FlightTicketReservationSystem.domains.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger,Long> {
}
