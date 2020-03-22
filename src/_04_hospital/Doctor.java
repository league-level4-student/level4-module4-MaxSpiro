package _04_hospital;

import java.util.ArrayList;

public class Doctor {
	private ArrayList<Patient> patients = new ArrayList<Patient>();
	public Doctor() {
		
	}
	public boolean performsSurgery() {
		return false;
	}
	public boolean makesHouseCalls() {
		return false;
	}
	public void assignPatient(Patient p) throws Exception {
		if(patients.size()<3)
			patients.add(p);
		else
			throw new Exception();
	}
	public ArrayList<Patient> getPatients() {
		return patients;
	}
	public void doMedicine() {
		for(Patient p : patients)
			p.checkPulse();
		
	}
}
