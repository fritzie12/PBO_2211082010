/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package FRITZIE150423.model;
import java.util.List;
/**
 *
 * @author nitro
 */
public interface BukuinDao {
    void save (Bukuin buku);
    void update(int index, Bukuin buku);
    void delete (int index);
    Bukuin getBuku(int index);
    List <Bukuin> getAll();
}
