/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zad_6.Map;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Jan
 */
public class Employe {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Map<String,Integer> employee=new TreeMap<>();
        employee.put("Kowalski",2500);
        employee.put("Mroczek",50);
        employee.put("Janik",1000);
        employee.put("Bachleda",300);
        employee.put("Curus",90);
        employee.put("Hej",5);
         
       Iterator<Map.Entry<String,Integer>> itr=employee.entrySet().iterator();
       
       while(itr.hasNext()){
           Map.Entry<String,Integer> entry=itr.next();
           System.out.println("key="+entry.getKey()+" value="+entry.getValue());
       }
        for(String key:employee.keySet()){
            Integer value=employee.get(key);
            System.out.println(value);
        }
        String keys;
        keys=input.next();
            Integer value=employee.get(keys);
            System.out.println("key"+keys+"wartośc"+value);
       
        
    }
}
