package com.boancionut.eyetester.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IshiharaplateEntityTest {

    @Test
    void getPlateId() {
        IshiharaplateEntity ishiharaPlate = new IshiharaplateEntity();
        ishiharaPlate.setPlateId(1);
        assertEquals(1,ishiharaPlate.getPlateId());
    }

    @Test
    void getCorrectAns() {
        IshiharaplateEntity ishiharaPlate = new IshiharaplateEntity();
        ishiharaPlate.setCorrectAns(15);
        assertEquals(15,ishiharaPlate.getCorrectAns());
    }

    @Test
    void getWrongAns() {
        IshiharaplateEntity ishiharaPlate = new IshiharaplateEntity();
        ishiharaPlate.setWrongAns(28);
        assertEquals(28,ishiharaPlate.getWrongAns());
    }
}