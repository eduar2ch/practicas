package com.mx.api.practica.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.api.practica.models.entity.Job;
import com.mx.api.practica.repository.JobRepository;
import com.mx.api.practica.service.JobSrv;

@Service
public class JobServiceImpl implements JobSrv {
	
	@Autowired
	private JobRepository jobRepository;

	@Override
	public Optional<Job> findById(Long id) {
		
		return jobRepository.findByJob(id);
	}

	@Override
	public Job save(Job job) {
		
		return jobRepository.save(job);
	}

	@Override
	public boolean existsByJob(Long id) {
		
		return false;
	}

	@Override
	public boolean existByName(String name) {
		
		return false;
	}

	
}
