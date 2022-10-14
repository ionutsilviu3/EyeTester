/*
package com.boancionut.eyetester.dao;

import com.boancionut.eyetester.entities.IshiharaplateEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.ParameterExpression;
import jakarta.persistence.criteria.Root;

import java.util.List;

public class IshiharaPlateDao extends GenericDao<IshiharaplateEntity> {

    private EntityManagerFactory factory;

    public IshiharaPlateDao(EntityManagerFactory factory) {
        super(IshiharaplateEntity.class);
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



    public List<IshiharaplateEntity> find(String id) {
        EntityManager em = getEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<IshiharaplateEntity> q = cb.createQuery(IshiharaplateEntity.class);

        Root<IshiharaplateEntity> c = q.from(IshiharaplateEntity.class);
        ParameterExpression<String> paramId = cb.parameter(String.class);
        q.select(c).where(cb.equal(c.get("plateID"), paramId));
        TypedQuery<IshiharaplateEntity> query = em.createQuery(q);
        query.setParameter(paramId, id);

        List<IshiharaplateEntity> results = query.getResultList();
        return results;
    }
}
*/
