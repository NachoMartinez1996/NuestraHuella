package com.tuhuella.main.entities;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Photo {

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	String id;
	String name;
	String mime;
	@Lob
	@Basic(fetch = FetchType.LAZY)
	private byte[] picture;
	Date createPhoto;
	Date modifiedPhoto;
	Boolean active;
	
	public Photo() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMime() {
		return mime;
	}

	public void setMime(String mime) {
		this.mime = mime;
	}

	public byte[] getPicture() {
		return picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

	public Date getCreatePhoto() {
		return createPhoto;
	}

	public void setCreatePhoto(Date createPhoto) {
		this.createPhoto = createPhoto;
	}

	public Date getModifiedPhoto() {
		return modifiedPhoto;
	}

	public void setModifiedPhoto(Date modifiedPhoto) {
		this.modifiedPhoto = modifiedPhoto;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}
	
	
	

}
