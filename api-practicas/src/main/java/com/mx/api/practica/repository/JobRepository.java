package com.mx.api.practica.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mx.api.practica.models.entity.Job;

@Repository
public interface JobRepository extends JpaRepository<Job, Long>{
	
	Optional<Job> findByJob(Long id);
	
	public boolean existsByJob(Long id);
	
	public boolean existByName(String name);

}
