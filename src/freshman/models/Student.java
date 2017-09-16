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
public class Student {

    private String name;
    private String surName;
    private int age;
    private double aveRat;
    private boolean classMonitor;
    private boolean inClass;

    public Student(String name, String surName, int age, double aveRat, boolean classMonitor, boolean inClass) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.aveRat = aveRat;
        this.classMonitor = classMonitor;
        this.inClass = inClass;
    }

    public Student() {
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

    public double getAveRat() {
        return aveRat;
    }

    public boolean isClassMonitor() {
        return classMonitor;
    }

    public boolean isInClass() {
        return inClass;
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

    public void setAveRat(double aveRat) {
        this.aveRat = aveRat;
    }

    public void setClassMonitor(boolean classMonitor) {
        this.classMonitor = classMonitor;
    }

    public void setInClass(boolean inClass) {
        this.inClass = inClass;
    }

    @Override
    public String toString() {
        return "Student\n" + " Name : " + name + "\n Surname : " + surName + "\n Age : " + age + "\n Average Rating : " + aveRat + "\n Class Monitor : " + classMonitor + "\n In Class : " + inClass + "\n|-----------------------|";
    }
    
    
    
}
