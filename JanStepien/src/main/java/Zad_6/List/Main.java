/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zad_6.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jan
 */
public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        List<Person> osoba = new ArrayList<>();
        osoba.add(new Person("Jan","Stepien", 20, 183, 80));
        osoba.add(new Person("Pawel","Kowalski", 25, 175, 82));
        osoba.add(new Person("Radek","Ptak", 30, 189, 84));
        osoba.add(new Person("Hubert","Serafin", 29, 170, 89));
        osoba.add(new Person("Janusz","Gawron", 45, 160, 85));
        osoba.add(new Person("Krzysztof","Ziemba", 22, 190, 100));
        String searchdatastring;
        int serchdatakint;
        int controlvariable;
        boolean znaleziono=false;
       
        
        
        System.out.println("Zadania:\n 1.Wyszukianie Danych\n 2.Wyszukiwanie max/min wartości\n 3.Sortowanie");
        controlvariable=input.nextInt();
        switch(controlvariable){
            case 1:
                System.out.println("Wyszukiwanie danych: 1.Wyszukiwanie po Imieniu\n 2.Wyszukiwanie po Nazwsku\n 3.wyszukiwanie po wieku\n 4.Wyszukiwanie po wzroście 5. Wyszukiwanie po wadze");
                controlvariable=input.nextInt();
                switch(controlvariable){
                        case 1:
                                searchdatastring=input.next();
                                for(int i=0;i<osoba.size();i++){
                                     if(osoba.get(i).getName().equals(searchdatastring)){
                                            System.out.println(osoba.get(i).toString());
                                            znaleziono=true;
                                      }
                               }System.out.println("Czy znaleziono ="+znaleziono);
                               break;
                        case 2:
                            searchdatastring=input.next();
                            for(int i=0;i<osoba.size();i++){
                                if(osoba.get(i).getSureName().equals(searchdatastring)){
                                     System.out.println(osoba.get(i).toString());
                                     znaleziono=true;
                                }
                            }System.out.println("Czy znaleziono ="+znaleziono);break;
                        case 3:
                            serchdatakint=input.nextInt();
                            for(int i=0;i<osoba.size();i++){
                                if(osoba.get(i).getAge()==serchdatakint){
                                    System.out.println(osoba.get(i).toString());
                                    znaleziono=true;
                                }
                            }System.out.println("Czy znaleziono ="+znaleziono);break;
                        case 4:
                            serchdatakint=input.nextInt();
                            for(int i=0;i<osoba.size();i++){
                                if(osoba.get(i).getHeight()==serchdatakint){
                                    System.out.println(osoba.get(i).toString());
                                    znaleziono=true;
                                }
                            }System.out.println("Czy znaleziono ="+znaleziono);break;
                        case 5:
                            serchdatakint=input.nextInt();
                            for(int i=0;i<osoba.size();i++){
                                if(osoba.get(i).getWage()==serchdatakint){
                                    System.out.println(osoba.get(i).toString());
                                    znaleziono=true;
                                }
                            }System.out.println("Czy znaleziono ="+znaleziono);break;
                        default:System.out.println("Brak działania");break; 
                }break;
            case 2:
                System.out.println("Wyszukiwanie:\n 1.Najstarszy\n 2.Najwyższy\n 3.Najcięższy \n 4.Najmłodszy \n 5.Najmniejszy\n 6.Najlżejszy");
                controlvariable=input.nextInt();
                switch(controlvariable){
                    case 1:
                       Person maxAge=Collections.min(osoba,Person.getCompByAge());
                        System.out.println("Najstarsza"+maxAge.toString());
                        break;
                    case 2:
                        Person maxHeight=Collections.min(osoba,Person.getCompByHeight());
                        System.out.println("Najwyższa "+maxHeight.toString());
                        break;
                    case 3:
                        Person maxWage=Collections.min(osoba,Person.getCompByWage());
                        System.out.println("Najcięższa "+maxWage.toString());
                        break;
                    case 4:
                        Person minAge=Collections.max(osoba,Person.getCompByAge());
                        System.out.println("Najmłodsza"+minAge.toString());
                        break;
                    case 5:
                        Person minHeight=Collections.max(osoba,Person.getCompByHeight());
                        System.out.println("Najniższa "+minHeight.toString());
                        break;
                    case 6:
                        Person minWage=Collections.max(osoba,Person.getCompByWage());
                        System.out.println("Najlżejsza "+minWage.toString());
                        break;
                    default:System.out.println("Brak działania");break;
                }break;
            case 3:
                System.out.println("Wybierz po czym sortować :\n 1.wiek \n 2.wzrost \n 3.waga");
                controlvariable=input.nextInt();
                switch(controlvariable){
                    case 1:
                       Collections.sort(osoba,Person.getCompByAge());
                        System.out.println(osoba.toString());
                    break;
                    case 2:
                        Collections.sort(osoba,Person.getCompByHeight());
                        System.out.println(osoba.toString());
                        break;
                    case 3:
                        Collections.sort(osoba,Person.getCompByWage());
                        System.out.println(osoba.toString());
                        break;
                }
            break;
                
                        
    }
} 
    
}
