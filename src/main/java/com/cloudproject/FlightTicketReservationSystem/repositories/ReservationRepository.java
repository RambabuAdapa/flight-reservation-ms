package com.cloudproject.FlightTicketReservationSystem.repositories;

import com.cloudproject.FlightTicketReservationSystem.domains.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation,Long>{
}
