/**
* Ukol 1_A
 * Stefan Drotar
 */
package com.engeto.uloha1;

public class Main {

    public static void main(String[] args) {

        Seller seller1 = new Seller("Stefan","Drotar",4,1.2,"Kosice",new RegistrationPlate("KE123KE"),6.5,new IPv4(192,168,2,1));
        Seller seller2 = new Seller("Jana","Velka",42,112.2,"Praha",new RegistrationPlate("1AB 123 DD"),4.5,new IPv4(192,168,2,12));

        System.out.printf("Prumerna mnozstvo prodane mrkve na smlouvu je: %.2f\n", (seller1.getSoldCarrotsTons()+ seller2.getSoldCarrotsTons())/(seller1.getAgreedAccord()+seller2.getAgreedAccord()));


    }
}
