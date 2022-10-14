/*
package com.boancionut.eyetester.service;


import com.boancionut.eyetester.dao.PatientDao;
import com.boancionut.eyetester.entities.DiseaseEntity;
import com.boancionut.eyetester.entities.PatientEntity;
import jakarta.persistence.Persistence;

import java.util.List;

public class PatientService {
    private PatientDao patientDao;

    public PatientService() {
        try {
            patientDao = new PatientDao(Persistence.createEntityManagerFactory("EyeTester"));
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void addPatient(PatientEntity newPatient) {
        patientDao.create(newPatient);
    }

    public void updatePatient(PatientEntity updatedPatient) {
        patientDao.update(updatedPatient);
    }

    public void updateDisease(DiseaseEntity disease, int id) {
        patientDao.updateDisease(disease, id);
    }

    public List<PatientEntity> getAllPatients() {
        return patientDao.findAll();
    }

    public PatientEntity findPatientID(String id) throws Exception {
        List<PatientEntity> patients = patientDao.findPatientID(id);
        if (patients.size() == 0) {
            throw new Exception("User not found!");
        }
        PatientEntity u = patients.get(0);

        return u;
    }

    public PatientEntity findPatient(String patient, String pass) throws Exception {
        List<PatientEntity> patients = patientDao.find(patient);
        if (patients.size() == 0) {
            throw new Exception("User not found!");
        }
        PatientEntity u = patients.get(0);

        if (pass.compareTo(u.getPassword()) != 0) {
            throw new Exception("Password does not match");
        }
        return u;
    }

    public void deletePatient(PatientEntity p) {
        patientDao.deletePatient(p.getPatientId());

    }
}
*/
