package com.taoh.nlw3.happy.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_orphanages")
public class Orphanages implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	@Column(precision = 2, scale = 10)
	private BigDecimal latitude;
	
	@Column(precision = 2, scale = 10)
	private BigDecimal longitude;
	
	@Column(columnDefinition = "TEXT")
	private String about;
	
	@Column(columnDefinition = "TEXT")
	private String instructions;
	
	private boolean open_on_weekends;
	
	
	
	
	
	
	
	
	
	
	
	
}
