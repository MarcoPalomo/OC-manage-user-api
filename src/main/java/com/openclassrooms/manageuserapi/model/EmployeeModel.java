package com.openclassrooms.manageuserapi.model;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class EmployeeModel {

     private Integer id;

     private String firstName;

     private String lastName;

     private String mail;

     private String password;


}
