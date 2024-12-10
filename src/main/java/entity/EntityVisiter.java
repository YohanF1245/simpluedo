package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "visiter")
public class EntityVisiter {

    private LocalDateTime heure_arrivee;
    private LocalDateTime heure_depart;
    private Integer id_salle;
    private Integer id_perso;

}
