/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zad_2;

/**
 *
 * @author Jan
 */
public class Person {
    private String name;
    private String surename;
    private String educationlevel;
    private int age;

    public Person(String name, String surename, String educationlevel, int age) {
        this.name = name;
        this.surename = surename;
        this.educationlevel = educationlevel;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", surename=" + surename + ", educationlevel=" + educationlevel + ", age=" + age + '}';
    }
    

   
    
            
}
