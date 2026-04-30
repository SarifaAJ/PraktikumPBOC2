/* Nama File    : Mahasiswa.java 
 * Deskripsi    : berisi tentang atrubut dan method dari kelas mahasiswa
 * Pembuat      : Sarifa Nuha Ardanti Jusmar
 * Tanggal      : 30 April 2026
 */

public class Mahasiswa {
    /* * * ATRIBUT * * */
    private String NIM;
    private String nama;
    private String programStudi;

    /* * * METHOD * * */
    /* KONSTRUKTOR */
    //menambahkan objek tanpa parameter
    public Mahasiswa(){
        this.NIM = "-999";
        this.nama = "n/a";
        this.programStudi = "n/a";
    }

    //menambahkan objek dengan parameter
    public Mahasiswa(String NIM, String nama, String programStudi) {
        this.NIM = NIM;
        this.nama = nama;
        this.programStudi = programStudi;
    }

    /* GETTER */
    //mengambil nilai NIM
    public String getNIM() {
        return NIM;
    }

    //mengambil nilai nama
    public String getNama() {
        return nama;
    }

    //mengambil nilai program studi
    public String getProgramStudi() {
        return programStudi;
    }

    /* SETTER */
    //mengubah nilai NIM
    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    //mengubah nilai nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    //V1: mengubah nilai program studi tanpa parameter
    public void setProgramStudi() {
        this.programStudi = "Kosong";
    }

    //V2: mengubah nilai program studi dengan parameter string
    public void setProgramStudi(String programStudi) {
        this.programStudi = programStudi;
    }

    // V3: mengubah nilai program studi dengan satu parameter objek Mahasiswa lain
    public void setProgramStudi(Mahasiswa m) {
        this.programStudi = m.programStudi;
    }
}
