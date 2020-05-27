/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zad_7;

/**
 *
 * @author Jan
 * @param <T1>
 * @param <T2>
 */
public class Generic<T1,T2> {

   private T1 element;
   private T2 element2;

    public Generic(T1 element, T2 element2) {
        this.element = element;
        this.element2 = element2;
    }

    public T1 getElement() {
        return element;
    }

    public void setElement(T1 element) {
        this.element = element;
    }

   

    public void setElement2(T2 element2) {
        this.element2 = element2;
    }

    public T2 getElement2() {
        return element2;
    }

  
    
    public static void main(String[] args) {
       Generic<String,String> stst=new Generic<>("Jan","Stępień");
        Generic<String,Integer> stin=new Generic<>("Ala",10);
        Generic<Double,Integer> dtin=new Generic<>(10.5,10);
       
        System.out.println(stst.getElement()+stst.getElement2());
        System.out.println(stin.getElement()+stin.getElement2());
        System.out.println(dtin.getElement()+dtin.getElement2());
       
    }
    
}
