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
class jrs {
        private String namajrs;
        jrs(String namajrs){
            this.namajrs = namajrs;
        }
        
        jrs(){
            this.namajrs = "Tidak ada";
        }
        
        void show(){
            System.out.println("Adalah = " + this.namajrs);
        }

}
