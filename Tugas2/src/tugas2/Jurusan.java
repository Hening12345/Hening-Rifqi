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
public class Jurusan {
    private String name;
    private static int jumlahJurusan;
    
    Jurusan(String name){
        Jurusan.jumlahJurusan++;
        this.name = name;
    }
    
    Jurusan(){
        Jurusan.jumlahJurusan++;
        this.name = "Jurusan" + Jurusan.jumlahJurusan;
    }
    
    void show(){
        System.out.println("Nama : " + this.name);
    }

}
