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
 * Class Minuman turunan dari MenuItem
 */
public class Minuman extends MenuItem {

    /**
     * Konstruktor Minuman, kategori otomatis "Minuman"
     * @param nama nama minuman
     * @param harga harga minuman
     */
    public Minuman(String nama, double harga) {
        super(nama, "Minuman", harga);
    }

    // Bisa ditambahkan method khusus minuman jika diperlukan
}

