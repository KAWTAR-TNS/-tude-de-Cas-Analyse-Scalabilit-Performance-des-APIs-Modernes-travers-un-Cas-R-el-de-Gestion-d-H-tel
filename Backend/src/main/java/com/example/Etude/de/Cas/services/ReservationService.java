package com.example.Etude.de.Cas.services;

import com.example.Etude.de.Cas.entities.Reservation;

public interface ReservationService {

    Reservation create(Reservation r);
    Reservation getById(Long id);
    Reservation update(Long id, Reservation r);
    void delete(Long id);
}
