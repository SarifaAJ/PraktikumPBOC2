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
    //tanpa parameter
    public Kendaraan(){
        this.noPlat = "";
        this.jenis = "";
    }

    //dengan parameter
    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    /* SELEKTOR */
    //get noPlat
    public String getNoPlat(){
        return noPlat;
    }

    //get jenis
    public String getJenis(){
        return jenis;
    }

    /* MUTATOR */
    //set noPlat
    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    //set jenis
    public void setJenis(String jenis){
        this.jenis = jenis;
    }
}
