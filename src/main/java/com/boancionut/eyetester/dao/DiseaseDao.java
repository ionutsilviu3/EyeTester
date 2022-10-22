package com.boancionut.eyetester.dao;

import com.boancionut.eyetester.entities.DiseaseEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;
import java.util.List;

public class DiseaseDao extends GenericDao<DiseaseEntity> {

    private EntityManagerFactory factory;

    public DiseaseDao(EntityManagerFactory factory) {
        super(DiseaseEntity.class);
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


    // for login
    public List<DiseaseEntity> find(String name) {
        EntityManager em = getEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<DiseaseEntity> q = cb.createQuery(DiseaseEntity.class);

        Root<DiseaseEntity> c = q.from(DiseaseEntity.class);
        ParameterExpression<String> paramName = cb.parameter(String.class);
        q.select(c).where(cb.equal(c.get("diseaseName"), paramName));
        TypedQuery<DiseaseEntity> query = em.createQuery(q);
        query.setParameter(paramName, name);

        List<DiseaseEntity> results = query.getResultList();
        return results;
    }
}
