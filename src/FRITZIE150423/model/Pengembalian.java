/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FRITZIE150423.model;

/**
 *
 * @author ASUS
 */
public class Pengembalian {
    private String kembali;
    private int terlambat;
    private double denda;
    private String strterlambat;
    private String strdenda;
    
    public Pengembalian(){
        
    }
    
    public Pengembalian (String kembali, int terlambat, double denda, String strterlambat, String strdenda){
        this.kembali = kembali;
        this.terlambat = terlambat;
        this.denda = denda;
        this.strterlambat = strterlambat;
        this.strdenda = strdenda;
    }
    
    public String getKembali(){
        return kembali;
    }
    
    public void setKembali(String kembali){
        this.kembali = kembali;
    }
    
    public String getStrterlambat(){
        return strterlambat;
    }
    
    public void setStrterlambat(String strterlambat){
        this.strterlambat = strterlambat;
    }
    
    public String getStrdenda(){
        return strdenda;
    }
    
    public void setStrdenda(String strdenda){
        this.strdenda = strdenda;
    }
    
}
