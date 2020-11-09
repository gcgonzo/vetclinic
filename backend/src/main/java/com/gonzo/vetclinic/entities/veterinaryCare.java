package com.gonzo.vetclinic.entities;

public class veterinaryCare {

	private Long id;
	private String patientHistory;
	private String symptoms;
	private String behavior;
	private String procedures;
	private String prescription;
	
	public veterinaryCare() {
		
	}

	public veterinaryCare(Long id, String patientHistory, String symptoms, String behavior, String procedures,
			String prescription) {
		super();
		this.id = id;
		this.patientHistory = patientHistory;
		this.symptoms = symptoms;
		this.behavior = behavior;
		this.procedures = procedures;
		this.prescription = prescription;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPatientHistory() {
		return patientHistory;
	}

	public void setPatientHistory(String patientHistory) {
		this.patientHistory = patientHistory;
	}

	public String getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}

	public String getBehavior() {
		return behavior;
	}

	public void setBehavior(String behavior) {
		this.behavior = behavior;
	}

	public String getProcedures() {
		return procedures;
	}

	public void setProcedures(String procedures) {
		this.procedures = procedures;
	}

	public String getPrescription() {
		return prescription;
	}

	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		veterinaryCare other = (veterinaryCare) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
}
