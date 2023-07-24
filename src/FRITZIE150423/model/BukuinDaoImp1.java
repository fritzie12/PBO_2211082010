/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FRITZIE150423.model;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nitro
 */
public class BukuinDaoImp1 implements BukuinDao{
    List<Bukuin> data = new ArrayList<>();
    
    public BukuinDaoImp1(){
        data.add(new Bukuin("11111", "Laskar Pelangi", "Andrea Hirata", "Bentang Pustaka", "2005"));
        data.add(new Bukuin("11112", "Spider-Man", "Stan Lee", "Marvel comic", "1962"));
        data.add(new Bukuin("11113", "Perjuangan", "Ali", "Perpustakaan", "2008"));
    }
    
    public void save(Bukuin buku){
        data.add(buku);
    }
    public void update(int index, Bukuin buku){
        data.set(index, buku);
    }
    public void delete(int index){
        data.remove(index);
    }
    public Bukuin getBuku(int index){
        return data.get(index);
    }
    public List<Bukuin> getAll(){
        return data;
    }
}
