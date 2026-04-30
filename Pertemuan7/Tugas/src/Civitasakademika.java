/* Nama File    : Civitasakademika.java 
 * Deskripsi    : berisi tentang atribut dan method dari kelas Civitasakademika
 * Pembuat      : Sarifa Nuha Ardanti Jusmar
 * Tanggal      : 30 April 2026
 */

abstract class Civitasakademika {
    /* * * ATRIBUT * * */
    private String nama;

    /* * * METHOD * * */
    /* KONSTRUKTOR */
    // membuat objek Civitasakademika tanpa parameter
    public Civitasakademika() {
        this.nama = "";
    }

    // membuat objek Civitasakademika dengan parameter nama
    public Civitasakademika(String nama) {
        this.nama = nama;
    }

    /* GETTER */
    // mengembalikan nilai nama
    public String getNama() {
        return this.nama;
    }

    // mengembalikan nilai nomor
    public abstract String getNomor();

    /* SETTER */
    // mengubah nilai nama
    public void setNama(String nama) {
        this.nama = nama;
    }
}
