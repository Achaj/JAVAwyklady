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
public class DataOfCar implements Comparable<DataOfCar>{
    private String numberplate;      //numer rejstracyjny
    private String nameofovner;      //nazwisko włąściciela
    private String carmaker;         //producęt samochodu
    private String modelofcar;       // model samochodu
    private int enginecapity;     //pojemność silnika
    private int    yearofproduction; //rok produkcji
    
    public DataOfCar(String inNumberPlate,String inNameOfOvner,String inCarMaker,String inModelOfCar,int inEngineCapity,int inYearOfProduction){
        this.numberplate=inNumberPlate;
        this.nameofovner=inNameOfOvner;
        this.carmaker=inCarMaker;
        this.modelofcar=inModelOfCar;
        this.enginecapity=inEngineCapity;
        this.yearofproduction=inYearOfProduction;
    }
    public String setNumberPlate(){
        return this.numberplate;
    }
    public String setNameOfOvner(){
        return this.nameofovner;
    }
    public String setCarMaker(){
        return this.carmaker;
    }
    public String setModelOfCar(){
        return this.modelofcar;
    }
    public String changeNameOfOvner(String newOvner){
        this.nameofovner=newOvner;
        return this.nameofovner;
    }
    public int setyearOfProduction(){
        return this.yearofproduction;
    }
    public double setEngineCapity(){
        return this.enginecapity;
    }
    
    public void printDataCar(){
        System.out.println("Numer rejestracyjny: " + this.numberplate);
        System.out.println("Nazwisko właściciela: " + this.nameofovner);
        System.out.println("Marka: " + this.carmaker);
        System.out.println("Model:  " + this.modelofcar);
        System.out.println("Pojemość silnika:  " + this.enginecapity);
        System.out.println("Rok produkcji:  " + this.yearofproduction);
    }

    @Override
    public int  compareTo(DataOfCar o) {
         int result =o.enginecapity - this.enginecapity ;
       return result;
    }

    @Override
    public String toString() {
        return "Numer rejestracji :"+numberplate+""
                + "\nNazwisko właściciela:"+nameofovner+""
                + "\nMarka: "+carmaker+""
                + "\nModel:"+modelofcar+""
                + "\nPojemość silnika:"+enginecapity+""
                + "\nRok produkcji:"+yearofproduction+"\n";
    }
    
   
}

