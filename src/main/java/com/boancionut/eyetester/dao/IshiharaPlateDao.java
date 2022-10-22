
package com.boancionut.eyetester.dao;

import com.boancionut.eyetester.entities.IshiharaplateEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;
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
