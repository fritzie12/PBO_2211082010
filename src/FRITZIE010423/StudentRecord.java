/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FRITZIE010423;

/**
 *
 * @author LENOVO
 */
public class StudentRecord {
    protected String name;
    private String address; 
    private int age; 
    private double mathGrade; 
    private double englishGrade; 
    private double scienceGrade; 
    private double average; 
    //area penulisan kode selanjutnya
    
    private static int  studentCount;//class var
    
    public String getName(){ 
        return name; 
    }
    
    public void setName(String name){
        this.name = name; 
    }
    ///////////////////////////////////////
        public String getAddress(){ 
            return address; 
        }
    
        public void setAddress(String address){
            this.address = address; 
        }
    //////////////////////////////////////
    public int getAge(){ 
        return age; 
    }
    
    public void setAge(int age){
        this.age = age; 
    }
    //////////////////////////////////////
     public double getMathGrade(){ 
        return mathGrade; 
    }
    
    public void setMathGrade(double mathGrade){
        this.mathGrade = mathGrade; 
    }
    //////////////////////////////////////
     public double getEnglishGrade(){ 
        return englishGrade; 
    }
    
    public void setEnglishGrade(double englishGrade){
        this.englishGrade = englishGrade; 
    }
    ///////////////////////////////////////
        public double getScienceGrade(){ 
            return scienceGrade; 
        }
    
        public void setScienceGrade(double scienceGrade){
            this.scienceGrade = scienceGrade; 
        }
    ///////////////////////////////////////
    public double getAverage(){
        average = (getMathGrade()+getEnglishGrade()+getScienceGrade()/3);
        return average; 
    }
    ///////////////////////////////////////
    public static int getStudentCount(){ 
        return studentCount; 
    }
    ///////////////////////////////////////////
    
    public void print( String temp ){ 
    System.out.println("Name:" + name); 
    System.out.println("Address:" + address); 
    System.out.println("Age:" + age); 
    } 
    public void print(double eGrade, double mGrade, double sGrade){
    //System.out.println("Name:" + name); 
    System.out.println("Math Grade:" + mGrade); 
    System.out.println("English Grade:" + eGrade); 
    System.out.println("Science Grade:" + sGrade); 
    }
    ////////////////////////////////////////////
    
    public StudentRecord(){
        studentCount++;
    //area inisialisasi kode; 
    } 
    public StudentRecord(String temp){ 
    this.name = temp; 
    studentCount++;
    } 
    public StudentRecord(String name, String address){ 
    this.name = name; 
    this.address = address;
    studentCount++;
    } 
    public StudentRecord(double mGrade, double eGrade, double sGrade){ 
    mathGrade = mGrade; 
    englishGrade = eGrade; 
    scienceGrade = sGrade;
    studentCount++;
    }

    void setAddres(String padang) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    boolean getAddres() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


