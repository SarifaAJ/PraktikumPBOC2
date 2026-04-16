/* Nama File    : Manusia.java 
 * Deskripsi    : berisi atribut dan method dalam class Manusia
 * Pembuat      : Sarifa Nuha Ardanti Jusmar
 * Tanggal      : 16 April 2026
 */

import java.time.LocalDate;

abstract public class Manusia {
    /* * * ATRIBUT * * */
    private String nama;
    private LocalDate tgl_mulai_kerja;
    private String alamat;
    private double pendapatan;
    private static int counterMns = 0;

    /* * * METHOD * * */
    /* KONSTRUKTOR */
    //membuat objek Manusia tanpa parameter
    public Manusia() {
        this.nama = "";
        this.tgl_mulai_kerja = null;
        this.alamat = "";
        this.pendapatan = 0.0;
        counterMns++;
    }

    //membuat objek Manusia dengan parameter
    public Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    /* SELEKTOR */
    //mengembalikan nilai nama
    public String getNama() {
        return nama;
    }
    
    //mengembalikan nilai tgl_mulai_kerja
    public LocalDate getTglMulaiKerja() {
        return tgl_mulai_kerja;
    }
    
    //mengembalikan nilai alamat
    public String getAlamat() {
        return alamat;
    }
    
    //mengembalikan nilai pendapatan
    public double getPendapatan() {
        return pendapatan;
    }

    /* MUTATOR */
    //mengatur nilai nama
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    //mengatur nilai tgl_mulai_kerja
    public void setTglMulaiKerja(LocalDate tgl_mulai_kerja) {
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }
    
    //mengatur nilai alamat
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    //mengatur nilai pendapatan
    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    /* METHOD LAIN */
    //menghitung masa bekerja
    abstract public int hitungMasaKerja();

    //menampilkan informasi manusia
    public void printInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Mulai Kerja: " + tgl_mulai_kerja);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
    }

    //menampilkan counter manusia
    public static void printCounter() {
        System.out.println("Jumlah Manusia: " + counterMns);
    }

}
