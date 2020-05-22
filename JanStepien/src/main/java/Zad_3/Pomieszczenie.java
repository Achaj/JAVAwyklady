/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zad_3;

/**
 *
 * @author Jan
 */
public class Pomieszczenie extends ElementPietra {

    int szerokosc;
    int dlugosc;
    String nazwa;

    /*
        metoda zwraca pole powierzchni
     */
    @Override
    public int policzPole() {
        return dlugosc * szerokosc;
    }
}
