/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_2311103005_naila;

/**
 *
 * @author Naila Syakirotul Rizkiyah
 * 2311103005
 * S1SI07A
 */
public class KomputerGame extends Komputer {
    private boolean vipCard;
    
    public KomputerGame(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean vipCard){
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.vipCard = vipCard;
    }
    
    public void login(String username) {
    System.out.println("Selamat datang, " + username + "!");
    }

    public void bermain(int jam){
        System.out.println("Anda bermain selama " + jam + "jam.");
    }
    
    public void bermain(int jam, int menitTambahan){
        System.out.println("Anda bermain selama " + jam + "jam dan " + menitTambahan + " menit.");
    }
    
    @Override
    public void informasi(){
        super.informasi();
        System.out.println("Status          : " + (vipCard ? "Anggota VIP" : "Pengunjung Biasa"));
        if(vipCard){
            System.out.println("Keuntungan khusus untuk VIP : ");
            System.out.println("- Diskon 15% untuk sesi lebih dari 3 jam");
            System.out.println("- Akses gratis ke minuman dan snack corner");
            System.out.println("- Hak prioritas pemesanan komputer gaming kelas atas");
        }else{
            System.out.println("Keuntungan untuk Pengunjung Biasa : ");
            System.out.println("- Silahkan upgrade ke VIP terlebih dahulu, untuk mendapatkan banyak keuntungan!!");
        }
        System.out.println("=====================================");
    }
}
