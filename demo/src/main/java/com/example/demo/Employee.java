package com.example.demo;

public class Employee { 
  
    public Employee() {} 
  
    // Parameterized Constructor 
    // to assign the values 
    // to the properties of 
    // the entity 
     public Employee( 
        String id, String firstName, 
        String lastName, String email, String title) 
    { 
  
        super(); 
  
        this.id = id; 
  
        this.firstName = firstName; 
  
        this.lastName = lastName; 
  
        this.email = email; 

        this.title = title;
  
            
    } 
  
       private String id; 
  
       private String firstName; 
  
       private String lastName; 
  
       private String email; 

       private String title;
  
    // Overriding the toString method 
    // to find all the values 
    @Override
   public String toString() 
    { 
  
        return "Employee [id="
            + id + ", firstName="
            + firstName + ", lastName="
            + lastName + ", email="
            + email + "]"; 
  
            
    } 
  
    // Getters of 
    // the properties 
    public String getId() 
    { 
  
         return id; 
    } 
  
    public String getFirstName() 
    { 
  
         return firstName; 
    } 
  
  
    public String getLastName() 
    { 
  
         return lastName; 
    } 
  
    public String getEmail() 
    { 
  
         return email; 
    } 
  

    public String getTitle() 
    { 
  
         return title; 
    }  
} 