package com.example.simpluedo;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interface SallesRepository<br>
 * 
 * This interface extends {@link JpaRepository} and gives CRUD operations functionality<br>
 * 
 * Usable methods : 
 * <ul>
 * 		<li>{@code save(S entity)}: create or update an entity</li>
 * 		<li>{@code findById(int id)}: finds an entity by his id</li>
 * 		<li>{@code findAll()}: finds all entities</li>
 * 		<li>{@code deleteById(int id)}: delete an entity by his id</li>
 * 		<li>{@code existsById(int id)}: check if an entity exist with this id</li>
 * </ul>
 * 
 * @see JpaRepository
 * @see Salles
 */

public interface SallesRepository extends JpaRepository<Salles, Integer>{

}
