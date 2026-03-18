/* Nama File    : DosenTetap.java 
 * Deskripsi    : berisi atribut dan method dalam class DosenTetap
 * Pembuat      : Sarifa Nuha Ardanti Jusmar
 * Tanggal      : 18 Maret 2026
 */

import java.time.LocalDate;

public class DosenTetap extends Dosen {
    /* * * ATRIBUT * * */
    private String nidn;

    /* * * METHODS * * */
    /* KONSTRUKTOR */
    // membuat objek DosenTetap tanpa parameter
    public DosenTetap() {
        this.nidn = "";
    }

    // membuat objek DosenTetap dengan parameter
    public DosenTetap(String nama, String nip, LocalDate tglLahir, LocalDate tmt, double gajiPokok, String fakultas, String nidn) {
        super(nama, nip, tglLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    /* SELEKTOR */
    //mengembalikan nilai nidn
    public String getNidn() {
        return nidn;
    }

    /* MUTATOR */
    //mengubah nilai nidn
    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    /* METHOD LAIN */
    //menghitung tanggal pensiun
    public LocalDate hitungTanggalPensiun() {
        LocalDate pensiun = getTglLahir().plusYears(65);
        return LocalDate.of(pensiun.getYear(), pensiun.getMonth().plus(1), 1);
    }

    //mmenghitung tunjangan
    public double hitungTunjangan() {
        int tahun = hitungMasaKerja().getYears();
        return 0.02 * tahun * getGajiPokok();
    }

    //menampilkan informasi DosenTetap
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas: " + getFakultas());
        System.out.println("NIDN: " + nidn);
        System.out.println("Jabatan: Dosen Tetap");
        System.out.println("Tanggal Pensiun: " + formatTanggal(hitungTanggalPensiun()));
        System.out.println("Tunjangan: " + formatRupiah(hitungTunjangan()));
    }
}
