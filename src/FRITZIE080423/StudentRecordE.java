/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FRITZIE080423;

/**
 *
 * @author LENOVO
 */
import FRITZIE010423.StudenRecordA;
public class StudentRecordE extends StudenRecordA {
        public String getNama(){
        return Nama;
    }
    public static void main(String[] args){
        StudentRecordE se = new StudentRecordE();
        se.setNama("fritzie");
        System.out.println("Nama : "+se.getNama());
    }
}
