/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB8KKN;

import BAB7KKN.*;

/**
 *
 * @author sanja
 */
public class DemoPolymorphism {
      public void tampilkanKategori(KategoriProdukAbstract produk) {
        System.out.println("Kategori Produk: " + produk.getNamaKategori());
        System.out.println("Deskripsi Umum: " + produk.getDeskripsiUmum());
        
        // Using instanceof to check the actual type and cast for specific methods
        if (produk instanceof MAKANANCD) {
            MAKANANCD makanan = (MAKANANCD) produk; // Downcasting
            System.out.println("    (Detail Makanan) Harga Nasi Goreng: " + makanan.getHarga("nasi goreng"));
            System.out.println("    (Detail Makanan) Harga Mie Goreng (ekstra): " + makanan.getHarga("mie goreng", true));
        } else if (produk instanceof MINUMANCD) {
            MINUMANCD minuman = (MINUMANCD) produk; // Downcasting
            System.out.println("    (Detail Minuman) Harga Es Teh: " + minuman.getHarga("es teh"));
        } else if (produk instanceof CAMILANCD) {
            CAMILANCD camilan = (CAMILANCD) produk; // Downcasting
            System.out.println("    (Detail Camilan) Harga Keripik: " + camilan.getHarga("keripik"));
        }
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        // Create instances of concrete classes
        MAKANANCD makanan1 = new MAKANANCD();
        MINUMANCD minuman1 = new MINUMANCD();
        CAMILANCD camilan1 = new CAMILANCD();

        // Create an instance of DemoPolymorphism
        DemoPolymorphism demo = new DemoPolymorphism();

        System.out.println("--- Demonstrasi Polymorphism ---");
        
        // Call the method with different concrete types
        demo.tampilkanKategori(makanan1);
        demo.tampilkanKategori(minuman1);
        demo.tampilkanKategori(camilan1);
        
        // Demonstrasi dengan referensi abstrak
        KategoriProdukAbstract produkUmum;

        System.out.println("\n--- Demonstrasi Polymorphism (Generic Reference) ---");

        produkUmum = new MAKANANCD();
        demo.tampilkanKategori(produkUmum);

        produkUmum = new MINUMANCD();
        demo.tampilkanKategori(produkUmum);

        produkUmum = new CAMILANCD();
        demo.tampilkanKategori(produkUmum);
    }
}
