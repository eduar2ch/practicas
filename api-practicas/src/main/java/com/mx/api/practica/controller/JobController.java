package com.mx.api.practica.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mx.api.practica.models.entity.Job;
import com.mx.api.practica.models.entity.Mensaje;
import com.mx.api.practica.service.JobSrv;

@RestController
public class JobController {
	
	@Autowired
	private JobSrv jobSrv;
	
	@GetMapping(path = "api/job/")
	public ResponseEntity<?> findByJob(@PathVariable Long id){
		Optional<Job> job = jobSrv.findById(id);
		if(job.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(job.get());
		
	}
	
	@PostMapping(path = "api/save/job/")
	public ResponseEntity<?> saveJob(@RequestBody Job job, @PathVariable String nombre, BindingResult bindingResult){
		boolean dato = jobSrv.existByName(nombre);
		
		if(dato) {
			if(job != null && job.getName() != null) {
				Job jobs = jobSrv.save(job);
				return ResponseEntity.status(HttpStatus.CREATED).body(jobs);
			}
			
		}else {
			return new ResponseEntity(new Mensaje("El nombre del trabajo ya existe! "), HttpStatus.BAD_REQUEST);
		}		
		return ResponseEntity.notFound().build();
	}

}
