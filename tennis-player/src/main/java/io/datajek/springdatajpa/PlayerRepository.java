package io.datajek.springdatajpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class PlayerRepository {
    @PersistenceContext
    EntityManager entityManager;
}
