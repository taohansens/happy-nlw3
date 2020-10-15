package com.taoh.nlw3.happy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taoh.nlw3.happy.entities.Orphanage;

@Repository
public interface OrphanagesRepository extends JpaRepository<Orphanage, Long> {

}
