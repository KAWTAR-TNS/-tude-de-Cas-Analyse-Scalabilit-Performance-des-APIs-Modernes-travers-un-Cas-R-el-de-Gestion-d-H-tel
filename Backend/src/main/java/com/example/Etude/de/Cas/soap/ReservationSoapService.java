package com.example.Etude.de.Cas.soap;

import com.example.Etude.de.Cas.entities.Reservation;
import com.example.Etude.de.Cas.services.ReservationService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@WebService
@Component
public class ReservationSoapService {

    @Autowired
    private ReservationService service;

    @WebMethod
    public Reservation getReservation(Long id) {
        return service.getById(id);
    }
}
