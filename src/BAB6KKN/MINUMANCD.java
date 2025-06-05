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
public class MINUMANCD extends KategoriProdukAbstract {
    @Override
    public String getNamaKategori() {
        return "Minum"; 
    }
    public int getHarga(String nama) {
        switch (nama.toLowerCase()) {
            case "es teh": return 5000;
            case "kopi hitam": return 7000;
            default: return 6000;
        }
    }
}
