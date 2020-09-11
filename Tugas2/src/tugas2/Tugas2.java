/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author DELL
 */
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Balok pp = new Balok();
        pp.setPanjang(10);
        pp.setLebar(20);
        pp.setTinggi(1);
        System.out.println("Panjang = "+ pp.getPanjang());
        System.out.println("Lebar = "+ pp.getLebar());
        System.out.println("Tinggi = "+ pp.getTinggi());
        System.out.println("Volume = "+ pp.getVolume());
    }
    
}
