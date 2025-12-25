package com.example.Etude.de.Cas.repositories;

import com.example.Etude.de.Cas.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
