package com.relations.model;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitialiser","handler"})

@AllArgsConstructor
public class Refrigerateur  extends BaseEntity{
	@Column(unique = true)
	private String label;
	
	String emplacement;
	private int temperatureMax, temperatureMin;
	@ManyToMany(mappedBy = "refrigerateurs")
	@JsonIgnoreProperties("refrigerateurs")
	private List<Alerte> alertes;
	
	@OneToOne(mappedBy = "refrigerateur")
	@JsonIgnoreProperties("refrigerateur")

	private Capteur capteur;
}