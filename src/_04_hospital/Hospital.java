package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	private ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	private ArrayList<Patient> patients = new ArrayList<Patient>();
	public Hospital() {
		
	}
	public void addDoctor(Doctor d) {
		doctors.add(d);
	}
	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}
	public void addPatient(Patient p) {
		patients.add(p);
	}
	public ArrayList<Patient> getPatients() {
		return patients;
	}
	public void assignPatientsToDoctors() {
		int j = 0;
		for(int i=0;i<doctors.size();i++) {
			try {
				doctors.get(i).assignPatient(patients.get(j));
				j++;
				i--;
			} catch (Exception e) {
				
			}
		}
	}
	
	
}
