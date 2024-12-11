package com.example.simpluedo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class SallesController {
	@Autowired
	private SallesRepository sallesRepo;
	
	@GetMapping("/salles")
	public List<Salles> getAllSalles(){
		return sallesRepo.findAll();
	}
	
	@PostMapping("/salles")
	public Salles createSalles(@RequestBody Salles salle) {
		return sallesRepo.save(salle);
	}
	
	@PutMapping("/salles/{id}")
	public ResponseEntity<Salles> updateSalles(@PathVariable int id, @RequestBody Salles salleInfos){
		Salles salle = sallesRepo.findById(id)
				.orElseThrow(()-> new RuntimeException("Error encountered!"));
		salle.setId_salle(salleInfos.getId_salle());
		salle.setNom_salle(salleInfos.getNom_salle());
		Salles updatedSalles = sallesRepo.save(salle);
		return ResponseEntity.ok(updatedSalles);
}
	}
