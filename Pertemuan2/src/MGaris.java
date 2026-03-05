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

        double getPanjang = G1.getPanjang();
        System.out.println("Panjang garis: " + getPanjang);

        double getGradien = G1.getGradien();
        System.out.println("Gradien garis: " + getGradien);

        Titik titikTengah = G1.getTitikTengah();
        System.out.println("Titik tengah: " + titikTengah);

        G1.isSejajar(G1);
        G1.isTegakLurus(G1);
        G1.getPersamaanGaris();
        
        G1.printGaris();
    }
}
