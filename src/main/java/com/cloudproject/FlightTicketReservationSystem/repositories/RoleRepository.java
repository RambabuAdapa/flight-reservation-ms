package com.cloudproject.FlightTicketReservationSystem.repositories;

import com.cloudproject.FlightTicketReservationSystem.domains.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
}
