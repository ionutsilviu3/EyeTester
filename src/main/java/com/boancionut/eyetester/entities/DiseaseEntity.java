package com.boancionut.eyetester.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "disease", schema = "eyetesterdatabase")
public class DiseaseEntity {
    @Basic
    @Column(name = "diseaseID")
    private int diseaseId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "diseaseName")
    private String diseaseName;
    @Basic
    @Column(name = "description")
    private String description;

    public int getDiseaseId() {
        return diseaseId;
    }

    public void setDiseaseId(int diseaseId) {
        this.diseaseId = diseaseId;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DiseaseEntity that = (DiseaseEntity) o;
        return diseaseId == that.diseaseId && Objects.equals(diseaseName, that.diseaseName) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(diseaseId, diseaseName, description);
    }
}
