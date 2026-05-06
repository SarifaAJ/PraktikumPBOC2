/* Nama File    : OperatorGenerik.java 
 * Deskripsi    : berisi atribut dan method dari kelas OperatorGenerik
 * Pembuat      : Sarifa Nuha Ardanti Jusmar
 * Tanggal      : 7 Mei 2026
 */

public class OperatorGenerik {
    /* * * METHOD * * */
    // method untuk menukar isi dari dua objek Datum
    public static <T> void Tukar (Datum<T> a, Datum<T> b){
        T temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }
}
