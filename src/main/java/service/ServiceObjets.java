package service;

import java.util.List;

import org.springframework.stereotype.Service;

import entity.EntityObjets;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import repository.RepositoryObjets;


@Service
@RequiredArgsConstructor
@Slf4j
public class ServiceObjets {
	private final RepositoryObjets objetsRepo;
	public List<EntityObjets> getAllObjets(){
		return objetsRepo.findAll();
	}
}
