/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FRITZIE150423.model;

/**
 *
 * @author ASUS
 */
public class Peminjaman {
    private Anggota anggota;
    private Bukuin buku;
    private String tglpinjam;
    private String tglkembali;
    
    public Peminjaman(){
        
    }
    public Peminjaman (Anggota anggota,Bukuin buku, String tglpinjam, String tglkembali){
        this.anggota = anggota;
        this.buku = buku;
        this.tglpinjam = tglpinjam;
        this.tglkembali = tglkembali;
    }
    public Anggota getAnggota(){
        return anggota;
    }
    public void setAnggota(Anggota anggota){
        this.anggota = anggota;
    }
    
    public Bukuin getBuku(){
        return buku;
    }
    public void setBuku(Bukuin buku){
        this.buku = buku;
    }
    
    public String getTglpinjam(){
        return tglpinjam;
    }
    public void setTglpinjam(String tglpinjam){
        this.tglpinjam = tglpinjam;
    }
    
    public String getTglkembali(){
        return tglkembali;
    }
    public void setTglkembali(String tglkembali){
        this.tglkembali = tglkembali;
    }
}
