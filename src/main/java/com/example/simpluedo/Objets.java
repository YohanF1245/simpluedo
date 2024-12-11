package com.example.simpluedo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "objets")
public class Objets {
	@Id
	private int id_objet;
	
	@Column
	private String nom_objet;
	
	@Column
	private int id_salle;
}
