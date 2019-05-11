/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author lenovo
 */
public class ProfileModel {
    private String uid;
  private String first_name;
  private String last_name;
    private String email;
  private String father_name;
  private String mother_name;
  private String batch;
public String getUid() {
	return uid;
}
public void setUid(String uid) {
	this.uid = uid;
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

public String getFather_name() {
	return father_name;
}
public void setFather_name(String father_name) {
	this.father_name = father_name;
}
public String getMother_name() {
	return mother_name;
}
public void setMother_name(String mother_name) {
	this.mother_name = mother_name;
}

public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

public String getBatch() {
	return batch;
}
public void setBatch(String batch) {
	this.batch = batch;
}
  
}
