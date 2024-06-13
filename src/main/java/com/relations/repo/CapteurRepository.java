package com.relations.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relations.model.Capteur;

public interface CapteurRepository extends JpaRepository<Capteur, Integer> {

}
