package com.taoh.nlw3.happy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taoh.nlw3.happy.entities.Orphanages;

@Repository
public interface OrphanagesRepository extends JpaRepository<Orphanages, Long> {

}
