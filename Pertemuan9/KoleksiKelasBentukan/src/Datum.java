/* Nama File    : Datum.java 
 * Deskripsi    : berisi atribut dan method dari kelas generik Datum
 * Pembuat      : Sarifa Nuha Ardanti Jusmar
 * Tanggal      : 7 Mei 2026
 */

public class Datum<T> {
    /* * * ATRIBUT * * */
    private T isi;

    /* * * METHOD * * */
    /* KOSTRUKTOR */
    //menambahkan objek dengan parameter
    public Datum(T isi){
        this.isi = isi;
    }

    /* GETTER */
    // method untuk mendapatkan isi dari objek Datum
    public T getIsi(){
        return isi;
    }

    /* SETTER */
    // method untuk mengubah isi dari objek Datum
    public void setIsi(T isibaru){
        this.isi = isibaru;
    }
    
    /* METHOD LAIN */
    // method untuk menampilkan gerakan dan suara dari anabul
    public void tampilkanAnabul(Anabul anabul){
        anabul.Gerak();
        anabul.Bersuara();

        if (anabul instanceof Kucing){
            ((Kucing) anabul).printBobot();
        }
    }
    

}
