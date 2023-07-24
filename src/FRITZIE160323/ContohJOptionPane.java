/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FRITZIE160323;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author LENOVO
 */
public class ContohJOptionPane {
    public static void main (String []args){
    BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
    int nilai1;
    int nilai2;
    boolean d;
    try{
        System.out.print("Entri nilai A : ");
        nilai1 = Integer.parseInt(dataIn.readLine());
        System.out.print("Enter nilai B : ");
        nilai2 = Integer.parseInt(dataIn.readLine());
        System.out.print("Enter nilai C : ");
        d = Boolean.parseBoolean(dataIn.readLine()); 
        
        int nilai3 = nilai1 + nilai2;
        System.out.println("Nilai C : " + nilai3);
        System.out.println("Nilai D : " + d);
        }catch (Exception ex){
    
        }
    }
}