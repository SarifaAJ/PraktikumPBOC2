/* Nama File    : Kendaraan.java 
 * Deskripsi    : berisi atribut dan method dalam class Kendaraan
 * Pembuat      : Sarifa Nuha Ardanti Jusmar
 * Tanggal      : 5 Maret 2026
 */

public class Kendaraan {
    /* * * ATTRIBUT * * */
    private String noPlat;
    private String jenis;

    /* * * METHOD * * */

    /* KONSTRUKTOR */
    //membuat objek Kendaraan tanpa parameter
    public Kendaraan(){
        this.noPlat = "";
        this.jenis = "";
    }

    //membuat objek Kendaraan dengan parameter
    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    /* SELEKTOR */
    //mengambil nilai noPlat
    public String getNoPlat(){
        return noPlat;
    }

    //mengambil nilai jenis
    public String getJenis(){
        return jenis;
    }

    /* MUTATOR */
    //mengubah nilai noPlat
    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    //mengubah nilai jenis
    public void setJenis(String jenis){
        this.jenis = jenis;
    }
}
