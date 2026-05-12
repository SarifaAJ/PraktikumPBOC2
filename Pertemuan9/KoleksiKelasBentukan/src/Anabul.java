/* Nama File    : Anabul.java 
 * Deskripsi    : berisi atribut dan method dari kelas Anabul
 * Pembuat      : Sarifa Nuha Ardanti Jusmar
 * Tanggal      : 7 Mei 2026
 */

public abstract class Anabul {
    /* * * ATRIBUT * * */
    private String panggilan;

    /* * * METHOD * * */
    /* KOSTRUKTOR */
    public Anabul(String panggilan){
        this.panggilan = panggilan;
    }

    /* GETTER */
    // method untuk mendapatkan panggilan anabul
    public String getNama(){
        return panggilan;
    }

    /* SETTER */
    // method untuk mengubah panggilan anabul
    public void setNama(String panggilan){
        this.panggilan = panggilan;
    }

    /* METHOD LAIN */
    // method untuk menampilkan gerak anabul
    public abstract void Gerak();

    // method untuk menampilkan suara anabul
    public abstract void Bersuara();
}
