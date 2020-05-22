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
public class Student extends Person {

    private String speciality;
    private int indexnumer;
    private int yerofstudy;

    public Student(String speciality, int indexnumer, int yerofstudy, String name, String surename, String educationlevel, int age) {
        super(name, surename, educationlevel, age);
        this.speciality = speciality;
        this.indexnumer = indexnumer;
        this.yerofstudy = yerofstudy;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        if (speciality == null) {
            this.speciality = "";
        } else {
            this.speciality = speciality;
        }
    }

    public int getIndexnumer() {
        return indexnumer;
    }

    public void setIndexnumer(int indexnumer) {
        if (indexnumer < 0) {
            this.indexnumer = -indexnumer;
        }
        this.indexnumer = indexnumer;
    }

    public int getYerofstudy() {
        return yerofstudy;
    }

    public void setYerofstudy(int yerofstudy) {
        if (yerofstudy < 0) {
            this.yerofstudy = -yerofstudy;
        } else {
            this.yerofstudy = yerofstudy;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "speciality=" + speciality + ", indexnumer=" + indexnumer + ", yerofstudy=" + yerofstudy;
    }

}
