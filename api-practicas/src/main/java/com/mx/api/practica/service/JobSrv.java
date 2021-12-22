package com.mx.api.practica.service;

import java.util.Optional;

import com.mx.api.practica.models.entity.Job;

public interface JobSrv {
	
	public Optional<Job> findById(Long id);
	
	public Job save(Job job);
	
	boolean existsByJob(Long id);
	
	boolean existByName(String name);

}
