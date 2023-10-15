package com.example.demo.model;

import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class User {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;

  private String username;

  private String first_name;
  
  private String last_name;
  
  private String gender;
  
  private Date DOB;
  
  
  @CreationTimestamp
  private Date createdAt;
  
  
  public Date getCreatedAt() {
	return createdAt;
}

public void setCreatedAt(Date createdAt) {
	this.createdAt = createdAt;
}

private int profile_id;

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getFirst_name() {
	return first_name;
}

public void setFirst_name(String first_name) {
	this.first_name = first_name;
}

public String getLast_name() {
	return last_name;
}

public void setLast_name(String last_name) {
	this.last_name = last_name;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public Date getDOB() {
	return DOB;
}

public void setDOB(Date dOB) {
	DOB = dOB;
}

public int getProfile_id() {
	return profile_id;
}

public void setProfile_id(int profile_id) {
	this.profile_id = profile_id;
}

  
  
  
}