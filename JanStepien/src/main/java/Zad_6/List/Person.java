/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zad_6.List;

import java.util.Comparator;
/**
 *
 * @author Jan
 */
public class Person implements Comparable<Person>{
    private String name;
    private String sureName;
    private int age;
    private int height;
    private int wage;

    public Person(String name, String sureName, int age, int height, int wage) {
        this.name = name;
        this.sureName = sureName;
        this.age = age;
        this.height = height;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public String getSureName() {
        return sureName;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWage() {
        return wage;
    } 
    public static Comparator<Person> getCompSearchByName(){
        Comparator<Person> comp=new Comparator<Person>(){
            public int compare(Person p1,Person p2){
                if(p1.getAge()<p2.getAge()){
                    return 1;
                }else{
                    return -1;
                }
            }
        };
        return comp;            
    }
    
    public static Comparator<Person> getCompByAge(){
        Comparator<Person> comp=new Comparator<Person>(){
            public int compare(Person p1,Person p2){
                if(p1.getAge()<p2.getAge()){
                    return 1;
                }else{
                    return -1;
                }
            }
        };
        return comp;            
    }
     public static Comparator<Person> getCompByHeight(){
        Comparator<Person> comp=new Comparator<Person>(){
            public int compare(Person p1,Person p2){
                if(p1.getHeight()<p2.getHeight()){
                    return 1;
                }else{
                    return -1;
                }
            }
        };
        return comp;            
    }
     public static Comparator<Person> getCompByWage(){
        Comparator<Person> comp=new Comparator<Person>(){
            public int compare(Person p1,Person p2){
                if(p1.getWage()<p2.getWage()){
                    return 1;
                }else{
                    return -1;
                }
            }
        };
        return comp;            
    }
  
    
    
    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", sureName=" + sureName + ", age=" + age + ", height=" + height + ", wage=" + wage + '}';
    }

    @Override
    public int compareTo(Person arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
  
}
