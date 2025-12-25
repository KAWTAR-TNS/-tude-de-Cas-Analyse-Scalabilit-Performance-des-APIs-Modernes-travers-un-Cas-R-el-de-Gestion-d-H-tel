package com.example.Etude.de.Cas.repositories;

import com.example.Etude.de.Cas.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientReository extends JpaRepository<Client,Long> {
}
