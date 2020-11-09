package com.gonzo.vetclinic.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gonzo.vetclinic.entities.Vaccine;

@RestController
@RequestMapping(value = "/vaccines")
public class VaccineResource {
	
	@GetMapping
	public ResponseEntity<List<Vaccine>> findAll(){
		List<Vaccine> list = new ArrayList<>();
		list.add(new Vaccine(1L, "Raiva", 10L));
		list.add(new Vaccine(2L, "Giardíase", 20L));
		list.add(new Vaccine(3L, "V8", 30L));
		return ResponseEntity.ok().body(list);
	}

}
