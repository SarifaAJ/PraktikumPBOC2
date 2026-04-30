/* Nama File    : Dosen.java 
 * Deskripsi    : berisi tentang atribut dan method dari kelas Dosen
 * Pembuat      : Sarifa Nuha Ardanti Jusmar
 * Tanggal      : 30 April 2026
 */

public class Dosen extends Civitasakademika {
    /* * * ATRIBUT * * */
    private String NIP;

    /* * * METHOD * * */
    /* KONSTRUKTOR */
    // membuat objek Dosen tanpa parameter
    public Dosen() {
        super();
        this.NIP = "";
    }

    // membuat objek Dosen dengan parameter nama dan NIP
    public Dosen(String nama, String NIP) {
        super(nama);
        this.NIP = NIP;
    }

    /* GETTER */
    // mengembalikan nilai NIP dengan override method getNomor dari kelas Civitasakademika
    @Override
    public String getNomor() {
        return this.NIP;
    }

    /* SETTER */
    // mengubah nilai NIP
    public void setNIP(String NIP) {
        this.NIP = NIP;
    }
    
}
