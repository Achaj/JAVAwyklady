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
public class Budynek implements Powierzchnia {

    int powierzchniaDzialki;
    Pietro[] pietra;
    Garaz[] garaze;

    /*
        Zlicza pole garazu i pola piętra
        POLE DZIAŁKI NIE JEST WLICZANE DO POLA POWIERZCHNI BUDYNKU
     */
    @Override
    public int policzPole() {
        int polePietra = 0;
        int poleGarazu = 0;
        for (Pietro pietra1 : pietra) {
            polePietra = polePietra + pietra1.policzPole();
        }
        for (Garaz garaze1 : garaze) {
            poleGarazu = poleGarazu + garaze1.policzPole();
        }
        return poleGarazu + polePietra;
    }
}
