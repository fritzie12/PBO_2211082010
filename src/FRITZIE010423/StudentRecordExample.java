/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FRITZIE010423;

/**
 *
 * @author LENOVO
 */
public class StudentRecordExample {
    public static void main(String[] args){
        StudentRecord anna = new StudentRecord();
        StudentRecord cris = new StudentRecord();
        StudentRecord ali = new StudentRecord("ali");
        
        anna.setName("Anna");
        anna.setAddress("Padang");
        anna.setAge(18);
        
        cris.setName("Cris");
        cris.setAddress("Bukittinggi");
        cris.setAge(20);
        
        //menampilkan data objek
        System.out.println("Data Objek Anna");
        System.out.println("Nama    : "+anna.getName());
        System.out.println("Alamat  : "+anna.getAddress());
        System.out.println("Umur    : "+anna.getAge());
        System.out.println(" ");
        
        //memanggil method print
        System.out.println("Data objek Cris");
        cris.print("");
        cris.print(70, 80, 90);
        System.out.println(" ");
        
        //memanggil objek melalui konstruktor method
         System.out.println("Data objek Ali");
         ali.print("");
        
        //menampilkan jumlah siswa
        System.out.println("Jumlah Siswa "+StudentRecord.getStudentCount());
    }
}
