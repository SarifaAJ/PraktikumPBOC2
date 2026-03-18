/* Nama File    : Dosen.java 
 * Deskripsi    : berisi atribut dan method dalam class Dosen
 * Pembuat      : Sarifa Nuha Ardanti Jusmar
 * Tanggal      : 18 Maret 2026
 */

import java.time.LocalDate;

public class Dosen extends Pegawai {
    /* * * ATRIBUT * * */
    private String fakultas;

    /* * * METHODS * * */
    /* KONSTRUKTOR */
    // membuat objek Dosen tanpa parameter
    public Dosen() {
        this.fakultas = "";
    }

    // membuat objek Dosen dengan parameter
    public Dosen(String nama, String nip, LocalDate tglLahir, LocalDate tmt, double gajiPokok, String fakultas) {
        super(nama, nip, tglLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }

    /* SELEKTOR */
    //mengembalikan nilai fakultas
    public String getFakultas() {
        return fakultas;
    }

    /* MUTATOR */
    //mengubah nilai fakultas
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
}
