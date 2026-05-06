/* Nama File    : Burung.java 
 * Deskripsi    : berisi tentang atribut dan method dari kelas Burung
 * Pembuat      : Sarifa Nuha Ardanti Jusmar
 * Tanggal      : 30 April 2026
 */

public class Burung extends Anabul{
    /* * * METHOD * * */
    /* KOSTRUKTOR */
    //menambahkan objek tanpa parameter
    public Burung() {
        super("");
    }

    //menambahkan objek dengan parameter
    public Burung(String nama){
        super(nama);
    }

    /* METHOD LAIN */
    @Override
    public void Gerak() {
        System.out.println(getNama() + " terbang");
    }

    @Override
    public void Bersuara() {
        System.out.println(getNama() + " berkicau");
    }
}
