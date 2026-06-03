package com.aosouza.demo_spring_rev_jpa.dao;

import com.aosouza.demo_spring_rev_jpa.entity.Autor;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class AutorDao {

    @PersistenceContext
    private EntityManager manager;

    public void save(Autor autor) {
        this.manager.persist(autor);
    }
}
