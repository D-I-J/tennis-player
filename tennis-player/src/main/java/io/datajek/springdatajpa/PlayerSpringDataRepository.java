package io.datajek.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlayerSpringDataRepository extends JpaRepository<Player,Integer> {

            //no implementation required!

//    Using Spring Data, we can run the same application again
//    without writing an implementation for any of the CRUD
//    operations. The JpaRepository provides us with methods
//    needed to perform those operations.
//    This results in a significant reduction in boilerplate code

//    NOt Working
    List<Player> findByNationality(String nationality);
}
