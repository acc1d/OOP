/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB4KKN;

/**
 *
 * @author sanja
 */
/**
 * Class Makanan turunan dari MenuItem
 */
public class Makanan extends MenuItem {

    /**
     * Konstruktor Makanan, kategori otomatis "Makanan"
     * @param nama nama makanan
     * @param harga harga makanan
     */
    public Makanan(String nama, double harga) {
        super(nama, "Makanan", harga);
    }

    // Bisa ditambahkan method khusus makanan jika diperlukan
}

