package com.taoh.nlw3.happy.dto;

import java.io.Serializable;

import com.taoh.nlw3.happy.entities.Orphanage;

public class OrphanageDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private Double latitude;
	private Double longitude;
	private String about;
	private String instructions;
	private String opening_hours;
	private boolean open_on_weekends;

	public OrphanageDTO() {
	}

	public OrphanageDTO(Orphanage entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.latitude = entity.getLatitude();
		this.longitude = entity.getLongitude();
		this.about = entity.getAbout();
		this.instructions = entity.getInstructions();
		this.opening_hours = entity.getOpening_hours();
		this.open_on_weekends = entity.isOpen_on_weekends();
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

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
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
}