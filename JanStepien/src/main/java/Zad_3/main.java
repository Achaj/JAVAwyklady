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
public class main {
     public static void main(String[] args) {
        Pomieszczenie[] mojePomieszczenia = {
            new Pomieszczenie() {
                {
                    szerokosc = 3;
                    dlugosc = 2;
                    nazwa = "pokoj";
                }
            },
            new Pomieszczenie() {
                {
                    szerokosc = 2;
                    dlugosc = 2;
                    nazwa = "lazienka";
                }
            }
        };

        Mieszkanie mojeMieszkanie = new Mieszkanie() {
            {
                pomieszczenia = mojePomieszczenia;
                wizytowka = "Kowalscy";

            }
        };
        ElementPietra[] mojeElementyParteru = {
            mojeMieszkanie, new Pomieszczenie() {
                {
                    szerokosc = 2;
                    dlugosc = 2;
                    nazwa = "suszarnia";
                }
            }
        };
        Pietro[] mojePietra = {
            new Pietro() {
                {
                    elementy = mojeElementyParteru;
                    numerPietra = 0;

                }
            }
        };
        Garaz[] mojeGaraze = {
            new Garaz() {
                {
                    szerokoscBramy = 3;
                    dlugoscBramy = 2;
                    szerokosc = 5;
                    dlugosc = 5;
                }
            }
        };
        Budynek mojBudynek = new Budynek() {
            {
                powierzchniaDzialki = 20;
                pietra = mojePietra;
                garaze = mojeGaraze;
            }
        };
        System.out.println("Powierzchnia Budynku wynosi:"+mojBudynek.policzPole()+"\nPowierzchnia działki:"+mojBudynek.powierzchniaDzialki);                //pole jest obliczane bez powierzchni dzialki
    }
}
