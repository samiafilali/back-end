package com.relations.model;
import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;

import lombok.Data;
@MappedSuperclass
@Data

public  abstract class BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	//@Temporal(TemporalType.TIMESTAMP)
	@Column(updatable = false)
	private LocalDateTime date ;
	@PrePersist
	public void persist()
	{
		date=LocalDateTime.now();
		
	}
	
	
	
}
