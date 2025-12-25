package com.example.Etude.de.Cas.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
   @Id @GeneratedValue
   Long id ;

   @ManyToOne
   Client client ;

    @ManyToOne
    Chambre chambre;

   Date dateDebut ;
    Date dateFin ;
   String  preferences;
}
