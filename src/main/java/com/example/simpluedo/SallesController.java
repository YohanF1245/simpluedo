package com.example.simpluedo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	
}
