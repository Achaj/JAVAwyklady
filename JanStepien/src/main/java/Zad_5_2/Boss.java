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
public class Boss {
    //====================
    
    public String name;
    public int health;
    public int agality;
    private static Boss instance=null;
   //====================
    
    private Boss() {
    }
    public static synchronized Boss getInstance(){
        if(instance==null){
            instance=new Boss();
        }
        return instance;
    }
    
    
}
