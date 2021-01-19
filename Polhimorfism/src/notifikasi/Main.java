/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notifikasi;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args){
        String emailPenerima ="apaajabole@Gmail.com";
        String nomerHp ="+627756764";
        String mobileId ="android-72648";
        
        EmailNotif emailnotif =new EmailNotif();
        SMSNotif smsnotif =new SMSNotif();        
        PushNotif pushnotif =new PushNotif();
        
        String message ="TUTORIAL POLIMORFISM blablabla, "
     + "cek sekarang di.............";
        
        emailnotif.sendMessage(emailPenerima, message);        
        smsnotif.sendMessage(nomerHp, message);        
        pushnotif.sendMessage(mobileId, message);
    }
}
