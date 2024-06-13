package com.relations.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relations.model.Alerte;

public interface AlerteRepository extends JpaRepository<Alerte, Integer> {

}
