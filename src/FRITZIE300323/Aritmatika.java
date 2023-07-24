/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FRITZIE300323;

/**
 *
 * @author LENOVO
 */
public class Aritmatika {
  public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int hasil = tambah(a, b);
        System.out.println("Hasil penjumlahan " + a + " dan " + b + " adalah = " + hasil);

        boolean cek_ganjil = CekGanjil(5);
        System.out.println("Apakah 5 ganjil? " + cek_ganjil);
    }

    public static int tambah(int a, int b) {
        return a + b;
    }

    public static boolean CekGanjil(int a) {
        if (a % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }
}
