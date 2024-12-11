package com.example.simpluedo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import com.example.simpluedo.entity.*;
import com.example.simpluedo.repository.RepositoryObjets;
import com.example.simpluedo.*;

@Service
@RequiredArgsConstructor
@Slf4j
public class ServiceObjets {
	private final RepositoryObjets objetsRepo;
	public List<EntityObjets> getAllObjets(){
		return objetsRepo.findAll();
	}
}
