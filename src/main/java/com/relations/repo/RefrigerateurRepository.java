package com.relations.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relations.model.Refrigerateur;

public interface RefrigerateurRepository extends JpaRepository<Refrigerateur, Integer> {

	Optional<Refrigerateur> findByDeviceId(String deviceId);

}
