/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB7KKN;

import BAB6KKN.*;
import BAB5KKN.*;

/**
 *
 * @author sanja
 */
public class CAMILANCD extends KategoriProdukAbstract{
    @Override
    public String getNamaKategori() {
        return "Camilan"; 
    }
    public int getHarga(String nama) {
        switch (nama.toLowerCase()) {
            case "keripik": return 4000;
            case "roti bakar": return 8000;
            default: return 5000;
        }
    }}
