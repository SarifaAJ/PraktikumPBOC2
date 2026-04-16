/* Nama File    : PNS.java 
 * Deskripsi    : berisi atribut dan method dalam class PNS
 * Pembuat      : Sarifa Nuha Ardanti Jusmar
 * Tanggal      : 16 April 2026
 */

import java.time.LocalDate;

public class PNS extends Manusia implements Pajak {
    /* * * ATRIBUT * * */
    private String nip;
    private static int counterPNS = 0;

    /* * * METHOD * * */
    /* KONSTRUKTOR */
    //membuat objek PNS tanpa parameter
    public PNS() {
        super();
        this.nip = "";
        counterPNS++;
    }

    //membuat objek PNS dengan parameter
    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;

    }

    /* SELEKTOR */
    //mengembalikan nilai nip
    public String getNip() {
        return nip;
    }
    
    /* MUTATOR */
    //mengatur nilai nip
    public void setNip(String nip) {
        this.nip = nip;
    }
    
    /* METHOD LAIN */
    //menghitung masa kerja
    @Override
    public int hitungMasaKerja() {
        LocalDate sekarang = LocalDate.now();
        LocalDate mulaiKerja = getTglMulaiKerja();
        
        long masaKerja = sekarang.toEpochDay() - mulaiKerja.toEpochDay() + 2;
        return (int) masaKerja;
    }
    //menghitung pajak yang harus dibayar
    @Override
    public double hitungPajak() {
        return 0.1 * getPendapatan();
    }

    //memampilkan informasi PNS
    @Override
    public void printInfo() {
        System.out.println("Nama: " + getNama());
        System.out.println("NIP: " + getNip());
        System.out.println("Alamat: " + getAlamat());
        System.out.println("Pendapatan: " + getPendapatan());
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " hari");
        System.out.println("Pajak yang harus dibayar: " + hitungPajak());
    }

    //menampilkan counter PNS
    public static void printCounterPNS() {
        System.out.println("Jumlah PNS: " + counterPNS);
    }
}