/* Nama File    : Anjing.java 
 * Deskripsi    : berisi tentang atribut dan method dari kelas Anjing
 * Pembuat      : Sarifa Nuha Ardanti Jusmar
 * Tanggal      : 30 April 2026
 */

public class Anjing extends Anabul{
    /* * * METHOD * * */
    /* KOSTRUKTOR */
    //menambahkan objek tanpa parameter
    public Anjing() {
        super("");
    }

    //menambahkan objek dengan parameter
    public Anjing(String nama){
        super(nama);
    }

    /* METHOD LAIN */
    @Override
    public void Gerak() {
        System.out.println(getNama() + " melata");
    }

    @Override
    public void Bersuara() {
        System.out.println(getNama() + " menggonggong");
    }
    
}
