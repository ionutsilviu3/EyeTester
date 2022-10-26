package com.boancionut.eyetester.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "patient", schema = "eyetesterdatabase")
public class PatientEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "patientId")
    private int patientId;
    @Basic
    @Column(name = "patientName")
    private String patientName;
    @Basic
    @Column(name = "password")
    private String password;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "patientDisease")
    private String patientDisease;

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPatientDisease() {
        return patientDisease;
    }

    public void setPatientDisease(String patientDisease) {
        this.patientDisease = patientDisease;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PatientEntity that = (PatientEntity) o;
        return patientId == that.patientId && Objects.equals(patientName, that.patientName) && Objects.equals(password, that.password) && Objects.equals(email, that.email) && Objects.equals(patientDisease, that.patientDisease);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patientId, patientName, password, email, patientDisease);
    }
}
