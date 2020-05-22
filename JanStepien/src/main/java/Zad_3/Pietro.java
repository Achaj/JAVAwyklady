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
public class Pietro implements Powierzchnia {

    int podajiloscPomieszczen;
    ElementPietra[] elementy;
    int numerPietra;

     /*
        metoda  zwraca polę powierzchni mieszkania i dodaje do nie jeszcze pomieszczeni suszarnia
    */

    @Override
    public int policzPole() {
        int polePowierzchniElementowPietra=0;
        for (ElementPietra elementy1 : elementy) {
            polePowierzchniElementowPietra = polePowierzchniElementowPietra + elementy1.policzPole();
        }
        return polePowierzchniElementowPietra;
    }
    
}
