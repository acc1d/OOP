/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB5KKN;

/**
 *
 * @author sanja
 */
public class MINUMANCD {
    public int getHarga(String nama) {
        switch (nama.toLowerCase()) {
            case "es teh": return 5000;
            case "kopi hitam": return 7000;
            default: return 6000;
        }
    }
}
