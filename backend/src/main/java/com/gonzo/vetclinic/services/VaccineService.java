package com.gonzo.vetclinic.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gonzo.vetclinic.entities.Vaccine;
import com.gonzo.vetclinic.repositories.VaccineRepository;

@Service
public class VaccineService {
	
	@Autowired
	private VaccineRepository repository;
	
	
	public List<Vaccine> findAll(){
		return repository.findAll();
	}
}
