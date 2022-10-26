package com.boancionut.eyetester.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiseaseEntityTest {

    @Test
    void getDiseaseId() {
        DiseaseEntity disease = new DiseaseEntity();
        disease.setDiseaseId(0);
        assertEquals(0,disease.getDiseaseId());
    }

    @Test
    void getDiseaseName() {
        DiseaseEntity disease = new DiseaseEntity();
        disease.setDiseaseName("Colorblind");
        assertEquals("Colorblind", disease.getDiseaseName());
    }

    @Test
    void getDescription() {
        DiseaseEntity disease = new DiseaseEntity();
        disease.setDescription("Your eyes can't really see most colors");
        assertEquals("Your eyes can't really see most colors", disease.getDescription());
    }
}