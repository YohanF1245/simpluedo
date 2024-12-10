package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.EntityObjets;

public interface RepositoryObjets extends JpaRepository<EntityObjets, Integer> {
	
}
