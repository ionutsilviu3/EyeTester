package com.boancionut.eyetester.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ishiharaplate", schema = "eyetesterdatabase")
public class IshiharaplateEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "plateID")
    private int plateId;
    @Basic
    @Column(name = "correctAns")
    private int correctAns;
    @Basic
    @Column(name = "wrongAns")
    private int wrongAns;

    public int getPlateId() {
        return plateId;
    }

    public void setPlateId(int plateId) {
        this.plateId = plateId;
    }

    public int getCorrectAns() {
        return correctAns;
    }

    public void setCorrectAns(int correctAns) {
        this.correctAns = correctAns;
    }

    public int getWrongAns() {
        return wrongAns;
    }

    public void setWrongAns(int wrongAns) {
        this.wrongAns = wrongAns;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IshiharaplateEntity that = (IshiharaplateEntity) o;
        return plateId == that.plateId && correctAns == that.correctAns && wrongAns == that.wrongAns;
    }

    @Override
    public int hashCode() {
        return Objects.hash(plateId, correctAns, wrongAns);
    }
}
