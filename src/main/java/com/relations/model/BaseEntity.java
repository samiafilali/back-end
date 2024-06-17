package com.relations.model;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
@MappedSuperclass
@Data

public  abstract class BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	//@Temporal(TemporalType.TIMESTAMP)
	@Column(updatable = false)
	private Date timestamp ;
	
	
	
}
