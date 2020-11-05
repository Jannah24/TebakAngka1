/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttebakangka;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class TebakAngka {
    /* membuat atribut */
    int bilangan;
    int tebakan;
    
    void acak(){
        this.bilangan = (int) (Math.random() * 101);
    }
    
    void tebakanmu(){
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Masukkan angka yang kamu tebak: ");
            this.tebakan = input.nextInt();
            if (tebakan == bilangan){
                System.out.println("Hurray!!Tebakanmu BENAR");
            }else if (tebakan > bilangan) {
                System.out.println("Huhuhu.. Tebakanmu terlalu besar");
            }else{
                System.out.println("Yahh.. Tebakanmu terlalu kecil");
            }
        }while (tebakan != bilangan);
    }
}
