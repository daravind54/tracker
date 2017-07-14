package io.egen.repository;

import io.egen.entity.Reading;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by darav on 6/28/2017.
 */

@Repository
public class ReadingRepositoryImplementation implements ReadingRepository {

    @PersistenceContext
    EntityManager entityManager;
    public Reading create(Reading reading){
        //System.out.println("Reading Repository......");
        entityManager.persist(reading);
        return reading;
    }
}
