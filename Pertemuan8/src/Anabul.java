/* Nama File    : Anabul.java 
 * Deskripsi    : berisi atribut dan method dari kelas Anabul
 * Pembuat      : Sarifa Nuha Ardanti Jusmar
 * Tanggal      : 7 Mei 2026
 */

public class Anabul {
    /* * * ATRIBUT * * */
    private String nama;

    /* * * METHOD * * */
    /* KOSTRUKTOR */
    //menambahkan objek tanpa parameter
    public Anabul(){
        this.nama = "";
    }

    //menambahkan objek dengan parameter
    public Anabul(String nama){
        this.nama = nama;
    }

    /* GETTER */
    // method untuk mendapatkan nama anabul
    public String getNama(){
        return nama;
    }

    /* SETTER */
    // method untuk mengubah nama anabul
    public void setNama(String nama){
        this.nama = nama;
    }

    /* METHOD LAIN */
    // method untuk menampilkan gerak anabul
    public void Gerak(){
        System.out.println("Anabul " + nama + "bergerak...");
    }

    // method untuk menampilkan suara anabul
    public void Bersuara(){
        System.out.println("Anabul " + nama + "bersuara...");
    }
}
