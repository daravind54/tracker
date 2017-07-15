package io.egen.repository;

import io.egen.entity.Alert;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by darav on 6/29/2017.
 */
@Repository
public class AlertRepositoryImplementation implements AlertRepository {

    @PersistenceContext
    EntityManager entityManager;

    public Alert create(Alert alert) {
        //System.out.println("Alert Repository");
        entityManager.persist(alert);
        return alert;
    }
}
