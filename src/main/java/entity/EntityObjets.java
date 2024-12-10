package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class EntityObjets {
	@NoArgsConstructor
	@AllArgsConstructor
	@Data
	@Entity
	@Table(name = "employee")
	public class Employee {

	    @Id
	    private Integer id_objet;
	    private String nom_objet;
	    private Integer id_salle;
	 
	}
}
