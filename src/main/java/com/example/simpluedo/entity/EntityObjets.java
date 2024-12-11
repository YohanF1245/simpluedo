package com.example.simpluedo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "objets")
public class EntityObjets { 
    @Id
    private Integer id_objet;
    private String nom_objet;
    private Integer id_salle;
}
