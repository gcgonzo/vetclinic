package com.gonzo.vetclinic.dto;

import com.gonzo.vetclinic.entities.Vaccine;

public class VaccineDTO {

	private Long id;
	private String name;
	private Long amount;
	
	public VaccineDTO() {
		
	}

	public VaccineDTO(Long id, String name, Long amount) {
		this.id = id;
		this.name = name;
		this.amount = amount;
	}
	
	public VaccineDTO(Vaccine entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.amount = entity.getAmount();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}
	
	
	
	
	
}
