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
public class Mieszkanie extends ElementPietra{

    String wizytowka;
    Pomieszczenie[] pomieszczenia;

    /*
       metoda zliczająca pole dwóch pomieszczeń
   */
    @Override
    public int policzPole() {
        int polePowierzchniMieszkania=0;
        for (Pomieszczenie pomieszczenia1 : pomieszczenia) {
            polePowierzchniMieszkania = polePowierzchniMieszkania + pomieszczenia1.policzPole();
        }
        return polePowierzchniMieszkania;
    }


}
