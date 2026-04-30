/* Nama File    : Anabul.java 
 * Deskripsi    : berisi atribut dan method dari kelas Anabul
 * Pembuat      : Sarifa Nuha Ardanti Jusmar
 * Tanggal      : 30 April 2026
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
    public String getNama(){
        return nama;
    }

    /* SETTER */
    public void setNama(String nama){
        this.nama = nama;
    }

    /* METHOD LAIN */
    public void Gerak(){
        System.out.println("Anabul " + nama + "bergerak...");
    }

    public void Bersuara(){
        System.out.println("Anabul " + nama + "bersuara...");
    }
}
