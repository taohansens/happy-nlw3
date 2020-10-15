package com.taoh.nlw3.happy.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name = "tb_orphanages")
public class Orphanages implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;

	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant createdAt;

	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant updatedAt;

	@Column(precision = 2, scale = 10)
	private BigDecimal latitude;

	@Column(precision = 2, scale = 10)
	private BigDecimal longitude;

	@Column(columnDefinition = "TEXT")
	private String about;

	@Column(columnDefinition = "TEXT")
	private String instructions;

	private String opening_hours;

	private boolean open_on_weekends;

	public Orphanages() {
	}

	public Orphanages(String name, BigDecimal latitude, BigDecimal longitude, String about, String instructions,
			String opening_hours, boolean open_on_weekends) {
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
		this.about = about;
		this.instructions = instructions;
		this.opening_hours = opening_hours;
		this.open_on_weekends = open_on_weekends;
	}

	@PrePersist
	public void prePersist() {
		this.createdAt = Instant.now();
	}

	@PreUpdate
	public void preUpdate() {
		this.updatedAt = Instant.now();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Instant getCreatedAt() {
		return createdAt;
	}

	public Instant getUpdatedAt() {
		return updatedAt;
	}

	public BigDecimal getLatitude() {
		return latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	public BigDecimal getLongitude() {
		return longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	public String getOpening_hours() {
		return opening_hours;
	}

	public void setOpening_hours(String opening_hours) {
		this.opening_hours = opening_hours;
	}

	public boolean isOpen_on_weekends() {
		return open_on_weekends;
	}

	public void setOpen_on_weekends(boolean open_on_weekends) {
		this.open_on_weekends = open_on_weekends;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Orphanages other = (Orphanages) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
