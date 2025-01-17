package com.tuhuella.main.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import com.tuhuella.main.enums.Sex;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

@Entity
public class Pet {
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String id;
	private Photo photo;
	private String name;
	private Integer ageInMontageInMonths;
	private String species;
	private String breed;
	private Integer weight;
	private Sex sex;
	private Size size;
	private Boolean upToDateVaccine;
	private Boolean castrated;
	private Boolean dewormed;
	private String disease;
	private Zone zone;
	
	
	public Pet() {
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Photo getPhoto() {
		return photo;
	}
	public void setPhoto(Photo photo) {
		this.photo = photo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAgeInMontageInMonths() {
		return ageInMontageInMonths;
	}
	public void setAgeInMontageInMonths(Integer ageInMontageInMonths) {
		this.ageInMontageInMonths = ageInMontageInMonths;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public Sex getSex() {
		return sex;
	}
	public void setSex(Sex sex) {
		this.sex = sex;
	}
	public Size getSize() {
		return size;
	}
	public void setSize(Size size) {
		this.size = size;
	}
	public Boolean getUpToDateVaccine() {
		return upToDateVaccine;
	}
	public void setUpToDateVaccine(Boolean upToDateVaccine) {
		this.upToDateVaccine = upToDateVaccine;
	}
	public Boolean getCastrated() {
		return castrated;
	}
	public void setCastrated(Boolean castrated) {
		this.castrated = castrated;
	}
	public Boolean getDewormed() {
		return dewormed;
	}
	public void setDewormed(Boolean dewormed) {
		this.dewormed = dewormed;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public Zone getZone() {
		return zone;
	}
	public void setZone(Zone zone) {
		this.zone = zone;
	}

	
	
	

}
