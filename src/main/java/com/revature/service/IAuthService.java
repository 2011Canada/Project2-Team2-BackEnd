package com.revature.service;

import java.util.List;

import com.revature.pojo.Doctor;
import com.revature.pojo.Patient;
import com.revature.pojo.User;

public interface IAuthService {
	
	Doctor registerDoctorService(Doctor doctor);
	
	Patient registerPatientService(Patient patient);
	
	Doctor loginDoctorService(User user);
	
	Patient loginPatientService(User user);

	List<Patient> getPatients();

	List<Doctor> getDoctors();
	

}
