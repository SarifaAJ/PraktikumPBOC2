/* Nama File    : Petani.java 
 * Deskripsi    : berisi atribut dan method dalam class Petani
 * Pembuat      : Sarifa Nuha Ardanti Jusmar
 * Tanggal      : 16 April 2026
 */

import java.time.LocalDate;

public class Petani extends Manusia implements Pajak {
    /* * * ATRIBUT * * */
    private String asal_kota;
    private static int counterPetani = 0;

    /* * * METHOD * * */
    /* KONSTRUKTOR */
    //membuat objek Petani tanpa parameter
    public Petani() {
        super();
        this.asal_kota = "";
        counterPetani++;
    }

    //membuat objek Petani dengan parameter
    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    /* SELEKTOR */
    //mengembalikan nilai asal_kota
    public String getAsalKota() {
        return asal_kota;
    }
    
    /* MUTATOR */
    //mengatur nilai asal_kota
    public void setAsalKota(String asal_kota) {
        this.asal_kota = asal_kota;
    }
    
    /* METHOD LAIN */
    //menghitung masa kerja
    @Override
    public int hitungMasaKerja() {
        LocalDate sekarang = LocalDate.now();
        LocalDate mulaiKerja = getTglMulaiKerja();
        
        long masaKerja = sekarang.toEpochDay() - mulaiKerja.toEpochDay() + 0;
        return (int) masaKerja;
    }

    //menghitung pajak yang harus dibayar
    @Override
    public double hitungPajak() {
        return 0;
    }

    //memampilkan informasi Petani
    @Override
    public void printInfo() {
        System.out.println("Nama: " + getNama());
        System.out.println("Asal Kota: " + getAsalKota());
        System.out.println("Alamat: " + getAlamat());
        System.out.println("Pendapatan: " + getPendapatan());
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak yang harus dibayar: " + hitungPajak());
    }

    //menampulkan counter Petani
    public static void printCounterPetani() {
        System.out.println("Jumlah Petani: " + counterPetani);
    }
}
