/* Nama File    : Kucing.java 
 * Deskripsi    : berisi tentang atribut dan method dari kelas Kucing
 * Pembuat      : Sarifa Nuha Ardanti Jusmar
 * Tanggal      : 7 Mei 2026
 */

public class Kucing extends Anabul{
    /* * * ATRIBUT * * */
    private double bobot;

    /* * * METHOD * * */
    /* KOSTRUKTOR */
    //menambahkan objek tanpa parameter
    public Kucing() {
        super("");
        this.bobot = 0;
    }

    //menambahkan objek dengan parameter
    public Kucing(String nama, double bobot){
        super(nama);
        this.bobot = bobot;
    }

    /* GETTER */
    // method untuk mendapatkan bobot kucing
    public double getBobot() {
        return this.bobot;
    }

    /* SETTER */
    // method untuk mengubah bobot kucing
    public void setBobot(double bobot) {
        this.bobot = bobot;
    }    

    /* METHOD LAIN */
    // method untuk menampilkan gerak kucing, override dari kelas Anabul
    @Override
    public void Gerak() {
        System.out.println(getNama() + " melata");
    }

    // method untuk menampilkan suara kucing, override dari kelas Anabul
    @Override
    public void Bersuara() {
        System.out.println(getNama() + " mengeong");
    }

    // method untuk menampilkan bobot dari kucing
    public void printBobot(){
        System.out.println(getNama() + " memiliki bobot " + getBobot() + " kg");
    }

    // method untuk menampilkan informasi lengkap tentang kucing, override dari kelas Anabul
    @Override
    public String toString() {
        return getNama() + " memiliki bobot " + getBobot() + " kg";
    }
}
