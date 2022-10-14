/*
package com.boancionut.eyetester.dao;

import com.boancionut.eyetester.entities.DiseaseEntity;
import com.boancionut.eyetester.entities.PatientEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.ParameterExpression;
import jakarta.persistence.criteria.Root;

import java.util.List;

public class PatientDao extends GenericDao<PatientEntity> {

    private EntityManagerFactory factory;

    public PatientDao(EntityManagerFactory factory) {
        super(PatientEntity.class);
        this.factory = factory;
    }

    @Override
    public EntityManager getEntityManager() {
        try {
            return factory.createEntityManager();
        } catch (Exception ex) {
            System.out.println("The entity manager cannot be created!");
            return null;
        }
    }

    public void updateDisease(DiseaseEntity disease, int id) {
        EntityManager em = getEntityManager();
        PatientEntity patient = em.find(PatientEntity.class, id);
        em.getTransaction().begin();
        patient.setPatientDisease(disease.getDiseaseName());
        em.getTransaction().commit();
        em.close();
    }

    public void deletePatient(int id)
    {
        EntityManager em = getEntityManager();
        PatientEntity patient = em.find(PatientEntity.class, id);
        em.getTransaction().begin();
        em.remove(patient);
        em.getTransaction().commit();
        em.close();
    }

    public List<PatientEntity> findPatientID(String id) {
        EntityManager em = getEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<PatientEntity> q = cb.createQuery(PatientEntity.class);

        Root<PatientEntity> c = q.from(PatientEntity.class);
        ParameterExpression<String> paramID = cb.parameter(String.class);
        q.select(c).where(cb.equal(c.get("patientID"), paramID));
        TypedQuery<PatientEntity> query = em.createQuery(q);
        query.setParameter(paramID, id);

        List<PatientEntity> results = query.getResultList();
        return results;
    }

    // for login
    public List<PatientEntity> find(String name) {
        EntityManager em = getEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<PatientEntity> q = cb.createQuery(PatientEntity.class);

        Root<PatientEntity> c = q.from(PatientEntity.class);
        ParameterExpression<String> paramName = cb.parameter(String.class);
        q.select(c).where(cb.equal(c.get("patientName"), paramName));
        TypedQuery<PatientEntity> query = em.createQuery(q);
        query.setParameter(paramName, name);

        List<PatientEntity> results = query.getResultList();
        return results;
    }
}*/
