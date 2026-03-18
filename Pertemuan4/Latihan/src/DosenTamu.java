/* Nama File    : DosenTamu.java 
 * Deskripsi    : berisi atribut dan method dalam class DosenTamu
 * Pembuat      : Sarifa Nuha Ardanti Jusmar
 * Tanggal      : 18 Maret 2026
 */

import java.time.LocalDate;

public class DosenTamu extends Dosen {
    /* * * ATRIBUT * * */
    private String nidk;
    private LocalDate akhirKontrak;

    /* * * METHODS * * */
    /* KONSTRUKTOR */
    // membuat objek DosenTamu tanpa parameter
    public DosenTamu() {
        this.nidk = "";
        this.akhirKontrak = null;
    }

    // membuat objek DosenTamu dengan parameter
    public DosenTamu(String nama, String nip, LocalDate tglLahir, LocalDate tmt, double gajiPokok, String fakultas, String nidk, LocalDate akhirKontrak) {
        super(nama, nip, tglLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.akhirKontrak = akhirKontrak;
    }

    /* SELEKTOR */
    //mengembalikan nilai nidk
    public String getNidk() {
        return nidk;
    }

    //mengembalikan nilai akhirKontrak
    public LocalDate getAkhirKontrak() {
        return akhirKontrak;
    }

    /* MUTATOR */
    //mengubah nilai nidk
    public void setNidk(String asalUniversitas) {
        this.nidk = asalUniversitas;
    }
    
    //mengubah nilai akhirKontrak
    public void setAkhirKontrak(LocalDate akhirKontrak) {
        this.akhirKontrak = akhirKontrak;
    }

    /* METHOD LAIN */
    //menghitung tunjangan
    public double hitungTunjangan() {
        return 0.025 * getGajiPokok();
    }

    //menampilkan informasi DosenTamu
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas: " + getFakultas());
        System.out.println("NIDK: " + nidk);
        System.out.println("Jabatan: Dosen Tamu");
        System.out.println("Akhir Kontrak: " + formatTanggal(akhirKontrak));
        System.out.println("Tunjangan: " + formatRupiah(hitungTunjangan()));
    }
}
