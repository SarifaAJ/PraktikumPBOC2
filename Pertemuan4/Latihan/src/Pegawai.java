/* Nama File    : Pegawai.java 
 * Deskripsi    : berisi atribut dan method dalam class Pegawai
 * Pembuat      : Sarifa Nuha Ardanti Jusmar
 * Tanggal      : 18 Maret 2026
 */

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.TextStyle;
import java.util.Locale;

public class Pegawai {
    /* * * ATRIBUT * * */
    private String nama;
    private String nip;
    private LocalDate tglLahir;
    private LocalDate tmt;
    private double gajiPokok;

    /* * * METHODS * * */
    /* KONSTRUKTOR */
    // membuat objek Pegawai tanpa parameter
    public Pegawai() {
        this.nama = "";
        this.nip = "";
        this.tglLahir = null;
        this.tmt = null;
        this.gajiPokok = 0;
    }

    // membuat objek Pegawai dengan parameter
    public Pegawai(String nama, String nip, LocalDate tglLahir, LocalDate tmt, double gajiPokok) {
        this.nama = nama;
        this.nip = nip;
        this.tglLahir = tglLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    /* SELEKTOR */
    //mengembalikan nilai nama
    public String getNama() {
        return nama;
    }

    //mengembalikan nilai nip
    public String getNip() {
        return nip;
    }

    //mengembalikan nilai tglLahir
    public LocalDate getTglLahir() {
        return tglLahir;
    }

    //mengembalikan nilai tmt
    public LocalDate getTmt() {
        return tmt;
    }

    //mengembalikan nilai gajiPokok
    public double getGajiPokok() {
        return gajiPokok;
    }

    /* MUTATOR */
    //mengubah nilai nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    //mengubah nilai nip
    public void setNip(String nip) {
        this.nip = nip;
    }

    //mmengubah nilai tglLahir
    public void setTglLahir(LocalDate tglLahir) {
        this.tglLahir = tglLahir;
    }

    //mengubah nilai tmt
    public void setTmt(LocalDate tmt) {
        this.tmt = tmt;
    }

    //mengubah nilai gajiPokok
    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    /* METHOD LAIN */
    //menghitung masa kerja pegawai
    public Period hitungMasaKerja() {
        return Period.between(tmt, LocalDate.now());
    }

    //mengubah format tanggal menjadi DD MMMM YYYY
    public String formatTanggal(LocalDate tgl) {
        return tgl.getDayOfMonth() + " " +
               tgl.getMonth().getDisplayName(TextStyle.FULL, new Locale("id")) +
               " " + tgl.getYear();
    }

    //mengubah format uang menjadi Rp. xxx.xxx,xx
    public String formatRupiah(double angka) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        return nf.format(angka);
    }

    //menampilkan informasi pegawai
    public void printInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIP: " + nip);
        System.out.println("Tanggal Lahir: " + formatTanggal(tglLahir));
        System.out.println("TMT: " + formatTanggal(tmt));
        System.out.println("Masa Kerja: " + hitungMasaKerja().getYears() + " tahun " + hitungMasaKerja().getMonths() + " bulan");
        System.out.println("Gaji Pokok: " + formatRupiah(gajiPokok));
    }
}