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
public class Main {
    public static void main(String[] args){
        Jurusan jurusan1 = new Jurusan(); jrs jrs1 = new jrs("RPL");
        Jurusan jurusan2 = new Jurusan(); jrs jrs2 = new jrs();
        Jurusan jurusan3 = new Jurusan(); jrs jrs3 = new jrs("MKT");
        Jurusan jurusan4 = new Jurusan(); jrs jrs4 = new jrs("MM");
        Jurusan jurusan5 = new Jurusan(); jrs jrs5 = new jrs();
        
        jurusan1.show(); jrs1.show();
        jurusan2.show(); jrs2.show();
        jurusan3.show(); jrs3.show();
        jurusan4.show(); jrs4.show();
        jurusan5.show(); jrs5.show();
    }
}
