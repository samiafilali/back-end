package com.relations.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relations.model.Refrigerateur;

public interface RefrigerateurRepository extends JpaRepository<Refrigerateur, Integer> {

}
