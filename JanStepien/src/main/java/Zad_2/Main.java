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
public class Main {

    public static void main(String[] args) {
        //utorzenie i inicjalizacja zmiennych sdudent nauczyciel
        Teacher[] t = new Teacher[2];
        Student[] s = new Student[2];
        t[0] = new Teacher("Boss", 23, "Maths", "Janusz", "Dzida", "superlevel", 45);
        t[1] = new Teacher("mediumBoss", 15, "Phisic", "Julisz", "Kat", "highlevel", 30);
        s[0] = new Student("informatik", 666, 10, "Jako", "Tako", "medium", 15);
        s[1] = new Student("Medic", 333, 2, "Wanda", "Szymanek", "second", 20);
        System.out.println(t[0].toString());// wyświetlenie wyników
        System.out.println(t[1].toString());
        System.out.println(s[0].toString());
        System.out.println(s[1].toString());
        //klasa student i techer dziedziczy po person

    }
}
