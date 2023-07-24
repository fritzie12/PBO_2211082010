/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FRITZIE080423;

/**
 *
 * @author LENOVO
 */
public class Human extends LivingThing { 
    
    
    public void berjalan(){ 
        System.out.println("manusia berjalan..."); 
    } 
    
    public static void main(String[] args){
        Human m = new Human();
        m.bernafas();
        m.makan();
        m.berjalan();
    }
}