/* Nama File    : TestPolimorfisme.java 
 * Deskripsi    : berisi tentang kelas TestPolimorfisme untuk menguji kelas Anabul, Kucing, Anjing, dan Burung
 * Pembuat      : Sarifa Nuha Ardanti Jusmar
 * Tanggal      : 30 April 2026
 */

import java.util.ArrayList;

public class TestPolimorfisme {
    public static void main(String[] args) {
        Anabul anabul1 = new Kucing("Ruby");
        Anabul anabul2 = new Anjing("Onyx");
        Anabul anabul3 = new Burung("Opal");

        ArrayList<Anabul> anabuls = new ArrayList<>();
        anabuls.add(anabul1);
        anabuls.add(anabul2);
        anabuls.add(anabul3);

        for(Anabul anabul : anabuls) {
            anabul.Bersuara();
            anabul.Gerak();
            System.out.println();
        }
        
    }
}
