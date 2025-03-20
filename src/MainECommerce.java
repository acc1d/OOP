/**
 * Program E-Commerce dengan Constructor
 * @author sanja
 */

public class MainECommerce {

    static class Produk {
        // Atribut produk
        private String nama;
        private int harga;
        private int stok;

        // Constructor untuk inisialisasi objek
        public Produk(String nama, int harga, int stok) {
            this.nama = nama;
            this.harga = harga;
            this.stok = stok;
        }

        // Metode untuk menampilkan informasi produk
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
        // Membuat objek produk dengan constructor
        Produk produk1 = new Produk("Vanila Latte", 15000, 5);
        Produk produk2 = new Produk("Cappuccino", 10000, 10);

        // Menampilkan informasi produk
        System.out.println("=== Daftar Produk E-Commerce ===");
        produk1.tampilkanInfo();
        System.out.println("--------------------------");
        produk2.tampilkanInfo();
    }
}
