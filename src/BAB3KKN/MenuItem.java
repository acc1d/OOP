/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB3KKN;

/**
 *
 * @author sanja
 */
public class MenuItem {
    String nama;
    String kategori;
    double harga;

    public MenuItem(String nama, String kategori, double harga) {
        this.nama = nama;
        this.kategori = kategori;
        this.harga = harga;
    }

    public double getHarga() {
        return harga;
    }
}
