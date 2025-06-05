/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB6KKN;

import BAB5KKN.*;

/**
 *
 * @author sanja
 */
public class MAKANANCD extends KategoriProdukAbstract {
    @Override
    public String getNamaKategori() {
        return "Makanan"; 
    }

    // Metode getHarga yang sudah ada sebelumnya tetap di sini
    public int getHarga(String nama) {
        switch (nama.toLowerCase()) {
            case "nasi goreng": return 15000;
            case "mie goreng": return 13000;
            default: return 10000;
        }
    }

    public int getHarga(String nama, boolean ekstra) {
        int harga = getHarga(nama); // Memanggil getHarga(nama) di kelas ini
        return ekstra ? harga + 3000 : harga;
    }

}
