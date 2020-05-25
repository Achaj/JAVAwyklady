/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zad_4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jan
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input= new Scanner(System.in);
        List<Person> osoba = new ArrayList<>();
        osoba.add(new Person("Jan","Stepien", 20, 183, 80));
        osoba.add(new Person("Pawel","Kowalski", 25, 175, 82));
        osoba.add(new Person("Radek","Ptak", 30, 189, 84));
        osoba.add(new Person("Hubert","Serafin", 29, 170, 89));
        osoba.add(new Person("Janusz","Gawron", 45, 160, 85));
        osoba.add(new Person("Krzysztof","Ziemba", 22, 190, 100));
        String searchDataString;
        int serchDataInt;
        int controlVariable;
        boolean znaleziono=false;
       
      try {
            File file = new File("dane.txt");
            if (!file.exists()) {
                file.createNewFile();
                try {
                    for(int i=0;i<osoba.size();i++){
                        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                            bw.write(osoba.get(i).getSureName() + osoba.get(i).getSureName() + "," + String.valueOf(osoba.get(i).getAge()) + "," + String.valueOf(osoba.get(i).getHeight()) + "," + String.valueOf(osoba.get(i).getWage()));
                            bw.newLine();
                            bw.close();
                        }
                    }
                } catch (IOException e) {
                    e.getMessage();
                }
            } else {
                try {
                    for(int i=0;i<osoba.size();i++){
                        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                            bw.write(osoba.get(i).getSureName() + osoba.get(i).getSureName() + "," + String.valueOf(osoba.get(i).getAge()) + "," + String.valueOf(osoba.get(i).getHeight()) + "," + String.valueOf(osoba.get(i).getWage()));
                            bw.newLine();
                            bw.close();
                        }
                    }
                } catch (IOException e) {
                    e.getMessage();
                }

            }
        }catch(IOException e){
            e.getMessage();
        }

        
        System.out.println("Zadania:\n 1.Wyszukianie Danych\n 2.Wyszukiwanie max/min wartości\n 3.Sortowanie");
        controlVariable=input.nextInt();
        switch(controlVariable){
            case 1:
                System.out.println("Wyszukiwanie danych: 1.Wyszukiwanie po Imieniu\n 2.Wyszukiwanie po Nazwsku\n 3.wyszukiwanie po wieku\n 4.Wyszukiwanie po wzroście 5. Wyszukiwanie po wadze");
                controlVariable=input.nextInt();
                switch(controlVariable){
                        case 1:
                                searchDataString=input.next();
                                for(int i=0;i<osoba.size();i++){
                                     if(osoba.get(i).getName().equals(searchDataString)){
                                            System.out.println(osoba.get(i).toString());
                                            znaleziono=true;
                                      }
                               }System.out.println("Czy znaleziono ="+znaleziono);
                               break;
                        case 2:
                            searchDataString=input.next();
                            for(int i=0;i<osoba.size();i++){
                                if(osoba.get(i).getSureName().equals(searchDataString)){
                                     System.out.println(osoba.get(i).toString());
                                     znaleziono=true;
                                }
                            }System.out.println("Czy znaleziono ="+znaleziono);break;
                        case 3:
                            serchDataInt=input.nextInt();
                            for(int i=0;i<osoba.size();i++){
                                if(osoba.get(i).getAge()==serchDataInt){
                                    System.out.println(osoba.get(i).toString());
                                    znaleziono=true;
                                }
                            }System.out.println("Czy znaleziono ="+znaleziono);break;
                        case 4:
                            serchDataInt=input.nextInt();
                            for(int i=0;i<osoba.size();i++){
                                if(osoba.get(i).getHeight()==serchDataInt){
                                    System.out.println(osoba.get(i).toString());
                                    znaleziono=true;
                                }
                            }System.out.println("Czy znaleziono ="+znaleziono);break;
                        case 5:
                            serchDataInt=input.nextInt();
                            for(int i=0;i<osoba.size();i++){
                                if(osoba.get(i).getWage()==serchDataInt){
                                    System.out.println(osoba.get(i).toString());
                                    znaleziono=true;
                                }
                            }System.out.println("Czy znaleziono ="+znaleziono);break;
                        default:System.out.println("Brak działania");break; 
                }break;
            case 2:
                System.out.println("Wyszukiwanie:\n 1.Najstarszy\n 2.Najwyższy\n 3.Najcięższy \n 4.Najmłodszy \n 5.Najmniejszy\n 6.Najlżejszy");
                controlVariable=input.nextInt();
                switch(controlVariable){
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
                controlVariable=input.nextInt();
                switch(controlVariable){
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
