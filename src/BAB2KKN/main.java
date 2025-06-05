/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB2KKN;

/**
 *
 * @author sanja
 */
public class main {

    // Class object: MenuItem
    static class MenuItem {
        String nama;
        String kategori;
        double harga;

        // Constructor untuk mengisi data saat objek dibuat
        public MenuItem(String nama, String kategori, double harga) {
            this.nama = nama;
            this.kategori = kategori;
            this.harga = harga;
        }
    }

    // Driver method untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek menggunakan constructor
        MenuItem kopi = new MenuItem("Americano", "Minuman", 12000);
        MenuItem makanan = new MenuItem("Roti Bakar", "Makanan", 15000);

        // Menampilkan informasi menu
        System.out.println("=== Daftar Menu ===");
        System.out.println("Menu 1: " + kopi.nama + " - " + kopi.kategori + " - Rp" + kopi.harga);
        System.out.println("Menu 2: " + makanan.nama + " - " + makanan.kategori + " - Rp" + makanan.harga);
    }
}

