package com.steve.spring.springcore.dependencycheck;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

public class Prescription {

	private int id;
	private String patientName;
	private List<String> medicines;

	public int getId() {
		return id;
	}

	/*
	 * If used @Requied , the initialization for this field should be  done given in config file else
	 * Exception will be thrown
	 * 
	 * */
	@Required
	public void setId(int id) {
		this.id = id;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public List<String> getMedicines() {
		return medicines;
	}

	public void setMedicines(List<String> medicines) {
		this.medicines = medicines;
	}

	@Override
	public String toString() {
		return "Prescription [id=" + id + ", patientName=" + patientName + ", medicines=" + medicines + "]";
	}

}
