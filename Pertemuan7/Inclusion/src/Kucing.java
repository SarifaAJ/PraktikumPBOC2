/* Nama File    : Kucing.java 
 * Deskripsi    : berisi tentang atribut dan method dari kelas Kucing
 * Pembuat      : Sarifa Nuha Ardanti Jusmar
 * Tanggal      : 30 April 2026
 */

public class Kucing extends Anabul{
    /* * * METHOD * * */
    /* KOSTRUKTOR */
    //menambahkan objek tanpa parameter
    public Kucing() {
        super("");
    }

    //menambahkan objek dengan parameter
    public Kucing(String nama){
        super(nama);
    }

    /* METHOD LAIN */
    @Override
    public void Gerak() {
        System.out.println(getNama() + " melata");
    }

    @Override
    public void Bersuara() {
        System.out.println(getNama() + " mengeong");
    }
}
