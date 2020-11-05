/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttebakangka;

/**
 *
 * @author HP
 */
public class ProjectTebakAngka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Haii.. Nama saya Jannah, saya telah memilih "
                + "sebuah bilangan bulat secara acak antara 0 s/d 100."
                + "Silahkan tebak ya!!");
        TebakAngka TA = new TebakAngka();
        TA.acak();
        TA.tebakanmu();
    }
    
}
