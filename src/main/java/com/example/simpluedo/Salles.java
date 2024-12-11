package com.example.simpluedo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
/**
 * This class defines the data structure for the room entity
 * @param id_salle The integer primary key that defines the row
 * @param nom_salle a string to store the room name
 */
@Entity
@Table(name = "salles")
public class Salles {
	@Id
	private int id_salle;
	
	@Column
	private String nom_salle;

	public int getId_salle() {
		return id_salle;
	}

	public void setId_salle(int id_salle) {
		this.id_salle = id_salle;
	}

	public String getNom_salle() {
		return nom_salle;
	}

	public void setNom_salle(String nom_salle) {
		this.nom_salle = nom_salle;
	}

	@Override
	public String toString() {
		return "Salles [id_salle=" + id_salle + ", nom_salle=" + nom_salle + "]";
	}

	
	
}
