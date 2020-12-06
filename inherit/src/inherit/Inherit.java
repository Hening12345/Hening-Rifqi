/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherit;

/**
 *
 * @author DELL
 */
public class Inherit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mamalia m = new mamalia();
        kancil k = new kancil();
        Lumba_lumba l = new Lumba_lumba();
        kelelawar kl = new kelelawar();
        
        System.out.println("Lumba-lumba berjenis tulang : "+l.nafas);
        m.bernafas();
        
        System.out.println("Kancil bernafas dengan : "+k.tulang);
        m.tulang();
        
        System.out.println("Kelelawar mempunyai : "+kl.sayap);
        m.sayap();
        
        k.habitat();
        l.habitat();
        kl.habitat();
    }
    
}
