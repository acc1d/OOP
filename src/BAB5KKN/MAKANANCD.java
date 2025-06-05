/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB5KKN;

/**
 *
 * @author sanja
 */
public class MAKANANCD {
     public int getHarga(String nama) {
        switch (nama.toLowerCase()) {
            case "nasi goreng": return 15000;
            case "mie goreng": return 13000;
            default: return 10000;
        }
    }

    // Overloading
    public int getHarga(String nama, boolean ekstra) {
        int harga = getHarga(nama);
        return ekstra ? harga + 3000 : harga;
    }
}
