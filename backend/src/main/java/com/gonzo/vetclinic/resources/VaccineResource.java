package com.gonzo.vetclinic.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gonzo.vetclinic.dto.VaccineDTO;
import com.gonzo.vetclinic.services.VaccineService;

@RestController
@RequestMapping(value = "/vaccines")
public class VaccineResource {
	
	@Autowired
	private VaccineService service;
	
	@GetMapping
	public ResponseEntity<List<VaccineDTO>> findAll(){
		List<VaccineDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
