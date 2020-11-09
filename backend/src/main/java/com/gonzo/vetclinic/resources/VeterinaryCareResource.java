package com.gonzo.vetclinic.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gonzo.vetclinic.entities.veterinaryCare;

@RestController
@RequestMapping(value = "/veterinaryCare")
public class VeterinaryCareResource {
	
	@GetMapping
	public ResponseEntity<List<veterinaryCare>> findAll(){
		List<veterinaryCare> list = new ArrayList<>();
		list.add(new veterinaryCare(1L, "Paciente com problemas renais", "Vomitando", "Domindo muito", "Vacinar e tomar remédio", "dorfelx"));
		list.add(new veterinaryCare(1L, "Paciente queda do pelo", "Queda", "Lambendo", "Tomar remédio", "calcitran"));
		list.add(new veterinaryCare(1L, "Paciente estomacais", "Vomitando", "Domindo muito", "Tomar remédio", "Dorment"));
		
		return ResponseEntity.ok().body(list);
	}

}
