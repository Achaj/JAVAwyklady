/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zad_5_2;

/**
 *
 * @author Jan
 */
public class Main {

    public static void main(String[] args) {
        Boss b1 = Boss.getInstance();
        Boss b2 = Boss.getInstance();

        b1.name = "Czarodziej";
        b1.health = 100;
        b1.agality = 50;

        b2.name = "Wojownik";
        b2.health = 150;
        b2.agality = 300;

        System.out.println(b1.name + b1.agality + b1.health);
        System.out.println(b2.name + b2.agality + b2.health);
        //wojownik zastopił czarodziejja ponieważ program nie pozwala przechowywac wiecej niż jednej instancji
    }
}
