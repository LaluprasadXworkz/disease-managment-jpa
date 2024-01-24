package com.xworkz.disease.repository.impl;

import com.xworkz.disease.entity.DiseaseEntity;
import com.xworkz.disease.repository.DiseaseRepository;

import javax.persistence.*;

public class DiseaseRepositoryImpl implements DiseaseRepository {

    private EntityManagerFactory emf= Persistence.createEntityManagerFactory("fertilizer");
    @Override
    public Integer save(DiseaseEntity disease) {
        System.out.println("Starting save of DiseaseEntity :"+disease);
       EntityManager em = emf.createEntityManager();
       EntityTransaction et =em.getTransaction();
       try {
           et.begin();
           System.out.println("Begin..!");
           em.persist(disease);
           System.out.println("Data inserted");
           et.commit();

       }catch (PersistenceException pe){

           System.err.println("PersistenceException in save method of disease "+pe.getMessage());
           et.rollback();
       }finally {
           System.out.println("Persistence closing");
       }
        return null;
    }
}
