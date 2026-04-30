/* Nama File    : Mahasiswa.java 
 * Deskripsi    : berisi tentang atribut dan method dari kelas Mahasiswa
 * Pembuat      : Sarifa Nuha Ardanti Jusmar
 * Tanggal      : 30 April 2026
 */

public class Mahasiswa extends Civitasakademika {
    /* * * ATRIBUT * * */
    private String NIM;
    private Dosen dosenWali;

    /* * * METHOD * * */
    /* KONSTRUKTOR */
    // membuat objek Mahasiswa tanpa parameter
    public Mahasiswa() {
        super();
        this.NIM = "";
        this.dosenWali = new Dosen();
    }

    // membuat objek Mahasiswa dengan parameter nama dan NIM
    public Mahasiswa(String nama, String NIM, Dosen dosenWali) {
        super(nama);
        this.NIM = NIM;
        this.dosenWali = dosenWali;
    }

    /* GETTER */
    // mengembalikan nilai NIM dengan override method getNomor dari kelas Civitasakademika
    @Override
    public String getNomor() {
        return this.NIM;
    }

    // mengembalikan nilai dosenWali
    public Dosen getDosenWali() {
        return this.dosenWali;
    }

    /* SETTER */
    // mengubah nilai NIM
    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    // mengubah nilai dosenWali
    public void setWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    /* METHOD LAIN */
    //menampilkan informasi mahasiswa
    public void tampilDataMahasiswa() {
        System.out.println("Nama: " + getNama());
        System.out.println("NIM: " + getNomor());
        System.out.println("Dosen Wali: " + dosenWali.getNama());
    }    
}
