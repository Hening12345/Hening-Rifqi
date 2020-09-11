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
    double volume;

    private double volume(double panjang, double lebar, double tinggi){
        return panjang*lebar*tinggi;
    }
        
    public void setPanjang(double panjang){
        this.panjang = panjang;
    }
    
    public void setLebar(double lebar){
        this.lebar = lebar;
    }
    
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    
    public double getPanjang(){
        return panjang;
    }
    
    public double getLebar(){
        return lebar;
    }
    
    public double getTinggi(){
        return tinggi;
    }
    
    public double getVolume(){
        return volume(panjang, lebar, tinggi);
    }

}
public class no1_Balok {
    private double panjang;
    private double lebar;
    private double tinggi;
        
    public no1_Balok(){
    double panjang = 0;
    double lebar = 0;
    double tinggi = 0;
    double volume = 0;
    }
    
    
}
