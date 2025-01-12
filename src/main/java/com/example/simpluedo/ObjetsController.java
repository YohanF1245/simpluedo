package com.example.simpluedo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class ObjetsController {
	@Autowired
	private ObjetsRepository objetsRepo;
	
	@GetMapping("/objets")
	public List<Salles> getAllSalles(){
		return objetsRepo.findAll();
	}
}
