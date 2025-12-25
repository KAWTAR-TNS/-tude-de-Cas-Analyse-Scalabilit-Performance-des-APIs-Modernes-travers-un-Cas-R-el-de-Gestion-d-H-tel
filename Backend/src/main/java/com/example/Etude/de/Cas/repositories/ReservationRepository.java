package com.example.Etude.de.Cas.repositories;

import com.example.Etude.de.Cas.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
