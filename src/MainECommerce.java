/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sanja
 */
public class MainECommerce {

    static class Produk {
        // Atribut produk
        public String nama;
        public int harga;
        public int stok;

        
        public void tampilkanInfo() {
            System.out.println("Nama Produk: " + nama);
            System.out.println("Harga: Rp" + harga);
            System.out.println("Stok: " + stok);
        }
    }

    /**
     * Metode utama yang akan mengeksekusi program.
     */
    public static void main(String[] args) {
        // Membuat objek produk pertama
        Produk produk1 = new Produk();
        produk1.nama = "Vanila Latte";
        produk1.harga = 15000;
        produk1.stok = 5;

        // Membuat objek produk kedua
        Produk produk2 = new Produk();
        produk2.nama = "Cappuccino";
        produk2.harga = 10000;
        produk2.stok = 10;

        // Menampilkan informasi produk
        System.out.println("=== Daftar Produk E-Commerce ===");
        produk1.tampilkanInfo();
        System.out.println("--------------------------");
        produk2.tampilkanInfo();
    }
}

