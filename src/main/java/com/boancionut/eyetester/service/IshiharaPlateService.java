package com.boancionut.eyetester.service;

import com.boancionut.eyetester.dao.IshiharaPlateDao;
import com.boancionut.eyetester.entities.IshiharaplateEntity;

import javax.persistence.Persistence;
import java.util.List;

public class IshiharaPlateService {
    private IshiharaPlateDao ishiharaPlateDao;

    public IshiharaPlateService() {
        try {
            ishiharaPlateDao = new IshiharaPlateDao(Persistence.createEntityManagerFactory("EyeTester"));
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void addIshiharaPlate(IshiharaplateEntity newIshiharaPlate) {
        ishiharaPlateDao.create(newIshiharaPlate);
    }

    public void updatePatient(IshiharaplateEntity updatedIshiharaPlate) {
        ishiharaPlateDao.update(updatedIshiharaPlate);
    }

    public List<IshiharaplateEntity> getAllIshiharaPlates() {
        return ishiharaPlateDao.findAll();
    }


    public IshiharaplateEntity findIshiharaPlate(int ishiharaPlate) throws Exception {
        String id = ((Integer)ishiharaPlate).toString();
        List<IshiharaplateEntity> ishiharaPlates = ishiharaPlateDao.find(id);
        if (ishiharaPlates.size() == 0) {
            throw new Exception("Ishihara Plate not found!");
        }
        IshiharaplateEntity u = ishiharaPlates.get(0);

        return u;
    }
}
