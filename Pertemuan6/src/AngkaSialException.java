/* Nama File    : AngkaSialException.java 
 * Deskripsi    : Eksepsi buatan sendiri, menolak angka 13!
 * Pembuat      : Sarifa Nuha Ardanti Jusmar
 * Tanggal      : 26 Maret 2026
 */

public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("jangan memasukkan angka 13 karena angka sial!!!");
    }
}
