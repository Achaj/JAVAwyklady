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
public class Person {
    private String name;
    private String secondName;
    private String birth;
    private String sex;

    public Person(String name, String secondName, String birth, String sex) {
        this.name = name;
        this.secondName = secondName;
        this.birth = birth;
        this.sex = sex;
    }
    public void printPerson(){
        System.out.println("Imię:"+name+"/nNazwisko:"+secondName+"\nData urodzenia"+birth+"\nPłeć:"+sex);
    }
    
}
