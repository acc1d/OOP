/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB1KKN;

/**
 *
 * @author sanja
 */
public class main {

    // Class object: MenuItem sebagai inner class
    static class MenuItem {
        String nama;
        String kategori;
        double harga;
    }

    // Driver method
    public static void main(String[] args) {
        // Membuat objek makanan dan kopi
        MenuItem kopi = new MenuItem();
        kopi.nama = "AMERICANO";
        kopi.kategori = "Minuman";
        kopi.harga = 12000;

        MenuItem makanan = new MenuItem();
        makanan.nama = "Roti Bakar";
        makanan.kategori = "Makanan";
        makanan.harga = 15000;

        // Menampilkan data yang keluar yang sudah di finisinikan
        System.out.println("Menu 1: " + kopi.nama + " - " + kopi.kategori + " - Rp" + kopi.harga);
        System.out.println("Menu 2: " + makanan.nama + " - " + makanan.kategori + " - Rp" + makanan.harga);
    }
}

  
