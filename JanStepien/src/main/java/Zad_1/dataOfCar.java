/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zad_1;

/**
 *
 * @author Jan
 */
public class dataOfCar implements Comparable<dataOfCar>{
    private String numberPlate;      //numer rejstracyjny
    private String nameOfOvner;      //nazwisko włąściciela
    private String carMaker;         //producęt samochodu
    private String modelOfCar;       // model samochodu
    private int engineCapity;     //pojemność silnika
    private int    yearOfProduction; //rok produkcji
    
    public dataOfCar(String inNumberPlate,String inNameOfOvner,String inCarMaker,String inModelOfCar,int inEngineCapity,int inYearOfProduction){
        this.numberPlate=inNumberPlate;
        this.nameOfOvner=inNameOfOvner;
        this.carMaker=inCarMaker;
        this.modelOfCar=inModelOfCar;
        this.engineCapity=inEngineCapity;
        this.yearOfProduction=inYearOfProduction;
    }
    public String setNumberPlate(){
        return this.numberPlate;
    }
    public String setNameOfOvner(){
        return this.nameOfOvner;
    }
    public String setCarMaker(){
        return this.carMaker;
    }
    public String setModelOfCar(){
        return this.modelOfCar;
    }
    public String changeNameOfOvner(String newOvner){
        this.nameOfOvner=newOvner;
        return this.nameOfOvner;
    }
    public int setyearOfProduction(){
        return this.yearOfProduction;
    }
    public double setEngineCapity(){
        return this.engineCapity;
    }
    
    public void printDataCar(){
        System.out.println("Numer rejestracyjny: " + this.numberPlate);
        System.out.println("Nazwisko właściciela: " + this.nameOfOvner);
        System.out.println("Marka: " + this.carMaker);
        System.out.println("Model:  " + this.modelOfCar);
        System.out.println("Pojemość silnika:  " + this.engineCapity);
        System.out.println("Rok produkcji:  " + this.yearOfProduction);
    }

    @Override
    public int  compareTo(dataOfCar o) {
         int result =o.engineCapity - this.engineCapity ;
       return result;
    }

    @Override
    public String toString() {
        return "Numer rejestracji :"+numberPlate+""
                + "\nNazwisko właściciela:"+nameOfOvner+""
                + "\nMarka: "+carMaker+""
                + "\nModel:"+modelOfCar+""
                + "\nPojemość silnika:"+engineCapity+""
                + "\nRok produkcji:"+yearOfProduction+"\n";
    }
    
   
}

