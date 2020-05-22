/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zad_1;
import java.lang.Comparable;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Jan
 */
public class Car {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        //Kolejność
        //String inNumberPlate,String inNameOfOvner,String inCarMaker,String inModelOfCar,double inEngineCapity,int inYearOfProduction
        DataOfCar[] car=new DataOfCar[5];
               car[0]=new DataOfCar("RKL052","Stepien","Honda","XL100V",1000,2010); 
               car[1]=new DataOfCar("RKL666","Malek","Yamaha","R1",1000,2014); 
               car[2]=new DataOfCar("RKL001","Kielb","Honda","FireBlade",959,2011); 
               car[3]=new DataOfCar("RKL111","Sowa","KTM","EXC",300,2019); 
               car[4]=new DataOfCar("MACZETA","Sondej","Suzuki","RM",250,2020); 
        
       
         String nr; //numer rejstracyjny
         String newovner; //nowy właściciel pojazdu
         int stering;       // zatwierdzająca wybór
         int yearproductiion; //rok produkcji
            System.out.println("Wybierz działanie :\n "
                 + "1.wyświetlanie informacji o samochodzie z podanym numerem rejestracyjnym\n "
                 + "2.wyświetlanie informacji o wszystkich samochodach\n "
                 + "3.zmianę właściciela pojazdu o podanym numerze rejestracyjnym\n "
                 + "4.wyświetlenie informacji o pojazdach wyprodukowanych przed podanym rokiem\n "
                 + "5.posortowanie pojazdów względem pojemności silnika (od najmniejszej do największej).");
                 
        int steringswitchs = input.nextInt();
         switch(steringswitchs){
             //wyświetlanie danych po rejstracji
             case 1:
                 System.out.println("Podj numer rejestracyjny :");
                 nr=input.next();
            for (DataOfCar car1 : car) {
                if (car1.setNumberPlate().equalsIgnoreCase(nr)) {
                    car1.printDataCar();
                }
            }
                 break;

            //wyświetlanie wszstkich danych
             case 2:
            for (DataOfCar car1 : car) {
                car1.printDataCar();
            }
                 break;

             //Zmiana właściciela pojazdu
             case 3:
                 System.out.println("Podaj numer rejestracji");   
                 nr=input.next();
            for (DataOfCar car1 : car) {
                if (car1.setNumberPlate().equalsIgnoreCase(nr)) {
                    System.out.println("Nowy wyłaściciel pojazdu:");
                    newovner=input.next();
                    System.out.println("Czy chcesz na pewno zmienic włąściciela pojazdu ?\n  - jeśli TAK naciśnij 1\n  - jeśli NIE naciśnij cyfre by anulować operację");
                    stering=input.nextInt();
                    if (stering==1) {
                        car1.changeNameOfOvner(newovner);
                        System.out.println("Zmienione dane pojazdu");
                        car1.printDataCar();
                    } else {
                        System.out.println("Zmiana właściciela pojazdu została anulowana");
                    }
                }
            }
                 break;

             case 4:
                 System.out.println("Podaj do jakiego roku ma wyświetlać pojazdy: ");
                 yearproductiion=input.nextInt();
            for (DataOfCar car1 : car) {
                if (car1.setyearOfProduction() < yearproductiion) {
                    car1.printDataCar();
                }
            }
                 break;

             case 5:
               Arrays.sort(car);
                 System.out.println(Arrays.toString(car));
              
                 break;
             default:
                 System.out.println("Nie wybrałeś działania");
                 break;
         }
         
    
}
}
