/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop_2311103005_naila;

/**
 *
 * @author Naila Syakirotul Rizkiyah
 * 2311103005
 * S1SI07A
 */
public class OOP_2311103005_Naila {
    public static void main(String[] args) {
        Komputer komputerBiasa = new Komputer(20, "Warnet ByteNaila", 10000);
        komputerBiasa.informasi();

        System.out.println();

        KomputerGame komputerVip = new KomputerGame(15, "Warnet ByteNaila", 20000, true);
        komputerVip.informasi();
        komputerVip.login("Rania Inayatul Izza");
        komputerVip.bermain(2);
        komputerVip.bermain(2, 30);

        System.out.println();

        KomputerGame komputerNonVip = new KomputerGame(15, "Warnet ByteNaila", 20000, false);
        komputerNonVip.informasi();
        komputerNonVip.login("Raina Humaira Zidni");
        komputerNonVip.bermain(1);
        komputerNonVip.bermain(1, 47);

        System.out.println();

        KomputerPremium komputerPremium = new KomputerPremium(5, "Warnet ByteNaila", 15000, true);
        komputerPremium.informasi();
        komputerPremium.pesan(4);
        komputerPremium.tambahLayanan("Burger Keju");
        komputerPremium.tambahLayanan("Burger Keju", "Lemon Tea");

        System.out.println();

        KomputerPremium komputerStandar = new KomputerPremium(5, "Warnet ByteNaila", 15000, false);
        komputerStandar.informasi();
        komputerStandar.pesan(3);
        komputerStandar.tambahLayanan("Nasi Goreng");
        komputerStandar.tambahLayanan("Nasi Goreng", "Manggo Squash");
    }
    
}
