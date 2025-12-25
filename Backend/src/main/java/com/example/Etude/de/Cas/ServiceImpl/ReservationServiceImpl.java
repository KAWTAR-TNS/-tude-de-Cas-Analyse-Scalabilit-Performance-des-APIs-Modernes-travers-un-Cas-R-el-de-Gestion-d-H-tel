package com.example.Etude.de.Cas.ServiceImpl;

import com.example.Etude.de.Cas.entities.Reservation;
import com.example.Etude.de.Cas.repositories.ReservationRepository;
import com.example.Etude.de.Cas.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private ReservationRepository repository;

    public Reservation create(Reservation r) {
        return repository.save(r);
    }

    public Reservation getById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public Reservation update(Long id, Reservation r) {
        r.setId(id);
        return repository.save(r);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
