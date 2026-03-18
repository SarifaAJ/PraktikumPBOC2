/* Nama File    : Tendik.java 
 * Deskripsi    : berisi atribut dan method dalam class Tendik
 * Pembuat      : Sarifa Nuha Ardanti Jusmar
 * Tanggal      : 18 Maret 2026
 */

import java.time.LocalDate;

public class Tendik extends Pegawai {
    /* * * ATRIBUT * * */
    private String bidang;

    /* * * METHODS * * */
    /* KONSTRUKTOR */
    // membuat objek Tendik tanpa parameter
    public Tendik() {
        this.bidang = "";
    }

    // membuat objek Tendik dengan parameter
    public Tendik(String nama, String nip, LocalDate tglLahir, LocalDate tmt, double gajiPokok, String unitKerja) {
        super(nama, nip, tglLahir, tmt, gajiPokok);
        this.bidang = unitKerja;
    }

    /* SELEKTOR */
    //mengembalikan nilai bidang
    public String getBidang() {
        return bidang;
    }

    /* MUTATOR */
    //mengubah nilai bidang
    public void setBidang(String unitKerja) {
        this.bidang = unitKerja;
    }

    /* METHOD LAIN */
    //menghitung tanggal pensiun
    public LocalDate hitungTanggalPensiun() {
        LocalDate pensiun = getTglLahir().plusYears(55);
        return LocalDate.of(pensiun.getYear(), pensiun.getMonth().plus(1), 1);
    }

    //menghitung tunjangan
    public double hitungTunjangan() {
        int tahun = hitungMasaKerja().getYears();
        return 0.01 * tahun * getGajiPokok();
    }

    //menampilkan informasi Tendik
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Bidang: " + bidang);
        System.out.println("Jabatan: Tenaga Kependidikan");
        System.out.println("Tanggal Pensiun: " + formatTanggal(hitungTanggalPensiun()));
        System.out.println("Tunjangan: " + formatRupiah(hitungTunjangan()));
    }
}