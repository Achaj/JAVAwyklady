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
public class Teacher extends Person{
    String position;
    int numberofprizes;
    String areasience;

    public Teacher(String position, int numberofprizes, String areasience, String name, String surename, String educationlevel, int age) {
        super(name, surename, educationlevel, age);
        this.position = position;
        this.numberofprizes = numberofprizes;
        this.areasience = areasience;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        if(position==null){
            this.position="";
        }else{
            this.position = position;
        }
    }

    public int getNumberofprizes() {
        return numberofprizes;
    }

    public void setNumberofprizes(int numberofprizes) {
        if(numberofprizes==0){
            this.numberofprizes = 0;
        }
        else{
            this.numberofprizes = numberofprizes;
        }
    }

    public String getAreasience() {
        return areasience;
    }

    public void setAreasience(String areasience) {
        if(areasience==null){
            this.areasience = "";
        }else{
            this.areasience = areasience;
        }
    }
    
}
