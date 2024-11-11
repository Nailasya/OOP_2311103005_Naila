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
public class KomputerPremium extends Komputer{
    private boolean ruangPrivat;
    
    public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean ruangPrivat){
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.ruangPrivat = ruangPrivat;
    }
    
    public void pesan(int nomorKomputer){   
        System.out.println("Komputer nomor " + nomorKomputer + "telah berhasil dipesan.");
    }
    
    public void tambahLayanan(String makanan){
        System.out.println("Menambah layanan ekstra : Makanan - " + makanan);
    }
    
    public void tambahLayanan(String makanan, String minuman) {
        System.out.println("Menambah layanan ekstra: Makanan - " + makanan + ", Minuman - " + minuman);
    }
    
    @Override
    public void informasi(){
        super.informasi();
        System.out.println("Status      : " + (ruangPrivat ? "Ruangan Premium" : "Ruangan Biasa"));
        if(ruangPrivat){
            System.out.println("Fasilitas untuk Ruangan Premium : ");
            System.out.println("- Ruangan ber-AC menambah kenyamanan");
            System.out.println("- Sofa dan kursi gaming yang empuk");
            System.out.println("- Spesifikasi komputer gaming terbaru");
            System.out.println("- Koneksi internet sangat cepat 1gb");
        }else{
            System.out.println("Fasilitas untuk Ruangan Biasa : ");
            System.out.println("- Ruangan menggunakan kipas");
            System.out.println("- Sofa biasa, tetapi nyaman");
            System.out.println("- Spesifikasi kompuer standar");
            System.out.println("- Koneksi internet 50Mbps");
        }
        System.out.println("=====================================");
    }
}
