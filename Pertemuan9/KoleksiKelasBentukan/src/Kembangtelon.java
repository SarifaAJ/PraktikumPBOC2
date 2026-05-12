/* Nama File    : Kembangtelon.java 
 * Deskripsi    : berisi atribut dan method dari kelas Kembangtelon
 * Pembuat      : Sarifa Nuha Ardanti Jusmar
 * Tanggal      : 7 Mei 2026
 */

public class Kembangtelon extends Kucing {
    /* * * METHOD * * */
    /* KOSTRUKTOR */
    //menambahkan objek tanpa parameter
    public Kembangtelon(){
        super("", 0.0);
    }

    //menambahkan objek dengan parameter
    public Kembangtelon(String nama, double bobot){
        super(nama, bobot);
    }

    /* METHOD LAIN */
    // method untuk menampilkan gerak kembangtelon, override dari kelas Kucing
    @Override
    public void Gerak(){
        System.out.println(getNama() + " lincah melompat");
    }

    // method untuk menampilkan suara kembangtelon, override dari kelas Kucing
    @Override
    public void Bersuara(){
        System.out.println(getNama() + " bersuara: Meong lembut");
    }
}
