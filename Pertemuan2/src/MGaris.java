/* Nama File    : MGaris.java 
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : Sarifa Nuha Ardanti Jusmar
 * Tanggal      : 4 Maret 2026
 */

public class MGaris {
    public static void main(String[] args){
        Garis G1 = new Garis();
        G1.printGaris();

        Titik T1 = new Titik(2,7);
        G1.setTitikAwal(T1);

        Titik T2 = new Titik(5,9);
        G1.setTitikAkhir(T2);

        
    }
}
