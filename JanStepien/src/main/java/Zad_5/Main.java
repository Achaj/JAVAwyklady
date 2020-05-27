/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zad_5;

import java.util.Arrays;

/**
 *
 * @author Jan
 */
public class Main {
    public static void main(String[] args) {
       Student[] students=new Student[5];
       students[0]=new Student("Techniczne", "Informatyka", 2, "Jan", "Kowalski", "23.11.1999", "male");
        students[1]=new Student("Techniczne", "Informatyka-Ekonmetria", 1, "Paweł", "Rak", "11.11.1999", "male");
         students[2]=new Student("Medyczne", "Pielengniarskie", 5, "Urszula", "Krzak", "05.01.1994", "female");
          students[3]=new Student("Pedagokiczne", "Matematyka", 2, "Kludia", "Pyra", "23.09.1997", "female");
           students[4]=new Student("Techniczne", "Informatyka", 2, "Paweł", "Kowalski", "10.06.1999", "male");
           
           for (int i=0;i<students.length;i++) {
               students[i].printPerson();
        }
          System.out.println(Student.numberOfStudents());
    
}
}
