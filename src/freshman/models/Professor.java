/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freshman.models;

/**
 *
 * @author Max
 */
public class Professor {
    
    private String name;
    private String surName;
    private int age;
    private String specialty;

    public Professor(String name, String surName, int age, String specialty) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.specialty = specialty;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Professor\n" + " Name : " + name + "\n Surname : " + surName + "\n Age : " + age + "\n Specialty : " + specialty;
    }
    
    
}
