/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB7KKN;

import BAB6KKN.*;

/**
 *
 * @author sanja
 */
public abstract class KategoriProdukAbstract  {
    public abstract String getNamaKategori();
    public String getDeskripsiUmum() {
        return "Ini adalah produk dari kategori: " + getNamaKategori();
    }
}

