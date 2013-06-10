/**
 *  Copyright 2013 Society for Health Information Systems Programmes, India (HISP India)
 *
 *  This file is part of Hospital-core module.
 *
 *  Hospital-core module is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.

 *  Hospital-core module is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with Hospital-core module.  If not, see <http://www.gnu.org/licenses/>.
 *
 *  author: ghanshyam
 *  date: 10-june-2013
 *  issue no: #1847
 **/

package org.openmrs.module.hospitalcore.model;

import org.openmrs.Patient;

public class IpdPatientVitalStatistics {
	
	private Integer id;
	private Patient patient;
	private IpdPatientAdmissionLog ipdPatientAdmissionLog;
	//vitalSatatistics Form
	private String systolic;
	private String diastolic;
	private String pulse;
	private String temperature;
	private String dietAdvised;
	private String note;
	private Integer creator;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public IpdPatientAdmissionLog getIpdPatientAdmissionLog() {
		return ipdPatientAdmissionLog;
	}
	public void setIpdPatientAdmissionLog(
			IpdPatientAdmissionLog ipdPatientAdmissionLog) {
		this.ipdPatientAdmissionLog = ipdPatientAdmissionLog;
	}
	public String getSystolic() {
		return systolic;
	}
	public void setSystolic(String systolic) {
		this.systolic = systolic;
	}
	public String getDiastolic() {
		return diastolic;
	}
	public void setDiastolic(String diastolic) {
		this.diastolic = diastolic;
	}
	public String getPulse() {
		return pulse;
	}
	public void setPulse(String pulse) {
		this.pulse = pulse;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getDietAdvised() {
		return dietAdvised;
	}
	public void setDietAdvised(String dietAdvised) {
		this.dietAdvised = dietAdvised;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Integer getCreator() {
		return creator;
	}
	public void setCreator(Integer creator) {
		this.creator = creator;
	}

}
