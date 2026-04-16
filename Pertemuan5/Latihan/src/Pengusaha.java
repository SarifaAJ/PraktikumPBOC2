/* Nama File    : Pengusaha.java 
 * Deskripsi    : berisi atribut dan method dalam class Pengusaha
 * Pembuat      : Sarifa Nuha Ardanti Jusmar
 * Tanggal      : 16 April 2026
 */

import java.time.LocalDate;

public class Pengusaha extends Manusia implements Pajak {
    /* * * ATRIBUT * * */
    private String npwp;
    private static int counterPengusaha = 0;

    /* * * METHOD * * */
    /* KONSTRUKTOR */
    //membuat objek Pengusaha tanpa parameter
    public Pengusaha() {
        super();
        this.npwp = "";
        counterPengusaha++;
    }

    //membuat objek Pengusaha dengan parameter
    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    /* SELEKTOR */
    //mengembalikan nilai npwp
    public String getNpwp() {
        return npwp;
    }
    
    /* MUTATOR */
    //mengatur nilai npwp
    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }
    
    /* METHOD LAIN */
    //menghitung masa kerja
    @Override
    public int hitungMasaKerja() {
        LocalDate sekarang = LocalDate.now();
        LocalDate mulaiKerja = getTglMulaiKerja();
        
        long masaKerja = sekarang.toEpochDay() - mulaiKerja.toEpochDay() + 8;
        return (int) masaKerja;
    }

    //menghitung pajak yang harus dibayar
    @Override
    public double hitungPajak() {
        return 0.15 * getPendapatan();
    }

    //memampilkan informasi Pengusaha
    @Override
    public void printInfo() {
        System.out.println("Nama: " + getNama());
        System.out.println("NPWP: " + getNpwp());
        System.out.println("Alamat: " + getAlamat());
        System.out.println("Pendapatan: " + getPendapatan());
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak yang harus dibayar: " + hitungPajak());
    }

    //menampulkan counter Pengusaha
    public static void printCounterPengusaha() {
        System.out.println("Jumlah Pengusaha: " + counterPengusaha);
    }
}

