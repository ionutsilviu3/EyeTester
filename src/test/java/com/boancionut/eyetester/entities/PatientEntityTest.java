package com.boancionut.eyetester.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatientEntityTest {

    @Test
    void getPatientId() {
        PatientEntity patientEntity = new PatientEntity();
        patientEntity.setPatientId(1);
        assertEquals(1,patientEntity.getPatientId());
    }


    @Test
    void getPatientName() {
        PatientEntity patientEntity = new PatientEntity();
        patientEntity.setPatientName("John");
        assertEquals("John", patientEntity.getPatientName());
    }

    @Test
    void getPassword() {
        PatientEntity patientEntity = new PatientEntity();
        patientEntity.setPassword("SecretePass1");
        assertEquals("SecretePass1", patientEntity.getPassword());
    }


    @Test
    void getEmail() {
        PatientEntity patientEntity = new PatientEntity();
        patientEntity.setEmail("user@mail.com");
        assertEquals("user@mail.com",patientEntity.getEmail());
    }


    @Test
    void getPatientDisease() {
        PatientEntity patientEntity = new PatientEntity();
        patientEntity.setPatientDisease("Colorblind");
        assertEquals("Colorblind", patientEntity.getPatientDisease());
    }

}