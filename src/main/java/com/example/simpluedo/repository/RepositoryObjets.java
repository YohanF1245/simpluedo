package com.example.simpluedo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.simpluedo.entity.EntityObjets;



@Repository
public interface RepositoryObjets extends JpaRepository<EntityObjets, Integer> {
	
}
