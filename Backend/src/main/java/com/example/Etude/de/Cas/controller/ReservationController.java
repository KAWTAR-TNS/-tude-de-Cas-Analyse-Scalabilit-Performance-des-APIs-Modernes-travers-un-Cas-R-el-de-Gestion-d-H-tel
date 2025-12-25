package com.example.Etude.de.Cas.controller;

import com.example.Etude.de.Cas.entities.Reservation;
import com.example.Etude.de.Cas.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

    @Autowired
    private ReservationService service;

    @PostMapping
    public Reservation create(@RequestBody Reservation r) {
        return service.create(r);
    }

    @GetMapping("/{id}")
    public Reservation get(@PathVariable Long id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public Reservation update(@PathVariable Long id, @RequestBody Reservation r) {
        return service.update(id, r);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
