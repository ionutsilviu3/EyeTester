/*
package com.boancionut.eyetester.service;

import com.boancionut.eyetester.dao.DiseaseDao;
import com.boancionut.eyetester.entities.DiseaseEntity;
import jakarta.persistence.Persistence;

import java.util.List;

public class DiseaseService {
    private DiseaseDao diseaseDao;

    public DiseaseService() {
        try {
            diseaseDao = new DiseaseDao(Persistence.createEntityManagerFactory("EyeTester"));
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void addDisease(DiseaseEntity newDisease) {
        diseaseDao.create(newDisease);
    }

    public void updatePatient(DiseaseEntity updatedDisease) {
        diseaseDao.update(updatedDisease);
    }

    public List<DiseaseEntity> getAllDiseases() {
        return diseaseDao.findAll();
    }


    public DiseaseEntity findDisease(String disease) throws Exception {
        String name = disease;
        List<DiseaseEntity> Diseases = diseaseDao.find(name);
        if (Diseases.size() == 0) {
            throw new Exception("Disease not found!");
        }
        DiseaseEntity u = Diseases.get(0);

        return u;
    }
}
*/
