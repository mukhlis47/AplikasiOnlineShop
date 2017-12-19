/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mukhlis.Dao;

import com.mukhlis.entity.Tablecustomers;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author user
 */
@Repository
@Transactional
public class CustomerService {
    static final Logger logger = Logger.getLogger(CustomerService.class.getName());
    
    @PersistenceUnit
    EntityManagerFactory emf;
    
    private EntityManager em;

    public CustomerService() {
    }

    public CustomerService(EntityManagerFactory emf, EntityManager em) {
        this.emf = emf;
        this.em = em;
    }

    /**
     * @return the em
     */
    public EntityManager getEm() {
        return em;
    }

    /**
     * @param em the em to set
     */
    public void setEm(EntityManager em) {
        this.em = em;
    }
    
    @Transactional
    public void addCustomer(Tablecustomers cus){
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(cus);
        em.getTransaction().commit();
//        em.close();
    }
    
    public List<Tablecustomers> findAll(){
        List<Tablecustomers> prod;
        prod = this.em.createNamedQuery("CustomerService.findAll").getResultList();
        return prod;
    }
    
    public Tablecustomers findById(Integer id){
        return em.find(Tablecustomers.class, id);
    }
    
    public Tablecustomers findByUsername(String username) {
        Tablecustomers user = new Tablecustomers();
        try {
            em = emf.createEntityManager();
            Query query = em.createNamedQuery("Tablecustomers.findByUsername");
            query.setParameter("username", username);
            user = (Tablecustomers) query.getSingleResult();
        } catch (NoResultException nre) {
            java.util.logging.Logger.getLogger(username).log(Level.SEVERE, username, nre);
        }
        return user;
    }

}
