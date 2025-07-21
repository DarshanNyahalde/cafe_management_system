/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deo;

import javax.swing.JOptionPane;

/**
 *
 * @author nyaha
 */
public class tables {
    public static void main(String[] args) {
        try{
            String userTable="create table user (id int AUTO_INCREMENT primary key,name varchar(200),email varchar(100),mobileNumber varchar(10),address varchar(100),password varchar(100),securityQuestion varchar(100),answer varchar(100),status varchar(100),UNIQUE(email))";
            String adminDetails="insert into user(name,email,mobileNumber,address,password,securityQuestion,answer,status)  values('Admin','admin@gmail.com','1234567890','India','admin','what primary school did you attend?','ABC','true')";
            String categoryTable="create table category (id int AUTO_INCREMENT primary key,name varchar(100))";
            String productTable="create table product (id int AUTO_INCREMENT primary key,name varchar(100),category varchar(100),price varchar(100))";
            String billTable="create table bill (id int primary key,name varchar(100),mobileNumber varchar(100),email varchar(100),date varchar(100),total varchar(100),createBy varchar(100))";
            
            
            
          DbOperations.setDataOrDelete(userTable, "User table created successfully");
           DbOperations.setDataOrDelete(adminDetails, "Admin details added successfully");
          DbOperations.setDataOrDelete(categoryTable, " Category table created successfully"); 
          DbOperations.setDataOrDelete(productTable, " product table created successfully");   
           DbOperations.setDataOrDelete(billTable, " bill table created successfully");      
              
        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
        }
    }
}
