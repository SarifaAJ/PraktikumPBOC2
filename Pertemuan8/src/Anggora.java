/* Nama File    : Anggora.java 
 * Deskripsi    : berisi atribut dan method dari kelas Anggora
 * Pembuat      : Sarifa Nuha Ardanti Jusmar
 * Tanggal      : 7 Mei2026
 */

public class Anggora extends Kucing {
    /* * * METHOD * * */
    /* KOSTRUKTOR */
    //menambahkan objek tanpa parameter
    public Anggora(){
        super("", 0.0);
    }

    //menambahkan objek dengan parameter
    public Anggora(String nama, double bobot){
        super(nama, bobot);
    }

    /* METHOD LAIN */
    // method untuk menampilkan gerak anggora, override dari kelas Kucing
    @Override
    public void Gerak(){
        System.out.println(getNama() + " lincah melompat");
    }

    // method untuk menampilkan suara anggora, override dari kelas Kucing
    @Override
    public void Bersuara(){
        System.out.println(getNama() + " bersuara: Meong lembut");
    }

    // method untuk menampilkan bobot anggora, override dari kelas Kucing
    @Override
    public void printBobot(){
        System.out.println(getNama() + " memiliki bobot " + getBobot() + " kg");
    }
}
