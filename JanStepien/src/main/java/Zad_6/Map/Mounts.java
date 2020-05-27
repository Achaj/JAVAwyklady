/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zad_6.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Jan
 */
public class Mounts {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, Integer> mounth = new HashMap<>();
        mounth.put("Styczen", 31);
        mounth.put("Luty", 28);
        mounth.put("Marzec", 31);
        mounth.put("Kwiecien", 30);
        mounth.put("Maj", 31);
        mounth.put("Czerwiec", 30);
        mounth.put("Lipiec", 31);
        mounth.put("Sierpien", 31);
        mounth.put("Wrzesien", 30);
        mounth.put("Pazdziernik", 31);
        mounth.put("Listopad", 30);
        mounth.put("Grudzien", 31);
        Iterator<Map.Entry<String, Integer>> itr = mounth.entrySet().iterator();

        mounth.keySet().forEach((key) -> {
            Integer value = mounth.get(key);
            System.out.println("Miesiąć= " + key + " Ilość dni=" + value);
        });
        
        String keys;
        keys = input.next();
        Integer value = mounth.get(keys);
        System.out.println("key" + keys + "wartośc" + value);
    }
}
