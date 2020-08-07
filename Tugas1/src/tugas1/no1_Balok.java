/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author DELL
 */
class Balok {
    double panjang;
    double lebar;
    double tinggi;
}
public class no1_Balok {
    public static void main(String[] args) {
        double volume;
        Balok b = new Balok();
        
        b.panjang = 4;
        b.lebar = 3;
        b.tinggi = 2;
        
        volume = b.panjang + b.lebar * b.tinggi;
        
        System.out.println("Volume Balok = " + volume);
    }
}
