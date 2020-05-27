/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zad_5;

/**
 *
 * @author Jan
 */
public class Student extends Person{
    private static int INDEX=0;
    private static int NUMBEROFSTUDENTS;
    private int id;
    private String typeOfStudy;
    private String degreeCourse;
    private int yearOfStudy;

    public Student(String typeOfStudy, String degreeCourse, int yearOfStudy, String name, String secondName, String birth, String sex) {
        super(name, secondName, birth, sex);
        this.id = INDEX++;
        this.typeOfStudy = typeOfStudy;
        this.degreeCourse = degreeCourse;
        this.yearOfStudy = yearOfStudy;
        NUMBEROFSTUDENTS++;
    }
    public static int numberOfStudents(){
        return NUMBEROFSTUDENTS;
    }

    @Override
    public void printPerson() {
        super.printPerson();
        System.out.println("Nazwa studiów:"+typeOfStudy+" --Kierunek:"+degreeCourse+" --rok:"+yearOfStudy+" --ID:" +id);
    }

   
    
}
