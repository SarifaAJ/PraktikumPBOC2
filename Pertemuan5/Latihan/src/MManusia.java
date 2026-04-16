/* Nama File    : MManusia.java 
 * Deskripsi    : berisi aimplementasi dari class-class ynag sudah dibuat
 * Pembuat      : Sarifa Nuha Ardanti Jusmar
 * Tanggal      : 16 April 2026
 */
import java.time.LocalDate;

public class MManusia {
    public static void main(String[] args){
        //contoh memasukkan isi parameter tiap class
        PNS p1 = new PNS("Satriyo", LocalDate.of(2006, 4, 1), "Jl. Seroja", 15000000, "198302032006041002");
        Pengusaha pe1 = new Pengusaha("Adhy", LocalDate.of(2000, 1, 1), "Jl.Air", 55000000, "000-556-773-212-000-5");
        Petani pt1 = new Petani("Nugraha", LocalDate.of(1977, 1, 9), "Jl. Bunga 9 Tembalang", 5000000, "wonogiri");
        PNS p2 = new PNS("Panji", LocalDate.of(2010, 4, 1), "Jl. Panorama 111 Tembalang", 10000000, "198004212010041001");
        Pengusaha pe2 = new Pengusaha("Dimas", LocalDate.of(2005, 1, 1), "Jl. Air 2", 35000000, "000-556-773-212-000-6");
        Petani pt2 = new Petani("Dwi", LocalDate.of(1980, 1, 9), "Jl. Bunga 9 Tembalang", 3000000, "wonogiri");

        //contohprintInfo tiap class
        System.out.println("\nInformasi PNS1:");
        p1.printInfo();
        
        System.out.println("\nInformasi Pengusaha1:");
        pe1.printInfo();
        
        System.out.println("\nInformasi Petani1:");
        pt1.printInfo();    

        // contoh memanggil setiap method pada class PNS, Pengusaha, dan Petani
        System.out.println("\nInformasi PNS2:");
        String Nama = p2.getNama();
        String Alamat = p2.getAlamat();
        double Pendapatan = p2.getPendapatan();
        LocalDate TglMulaiKerja = p2.getTglMulaiKerja();
        int MasaKerja = p2.hitungMasaKerja();
        double Pajak = p2.hitungPajak();

        System.out.println("Nama: " + Nama);
        System.out.println("Alamat: " + Alamat);
        System.out.println("Pendapatan: " + Pendapatan);
        System.out.println("Tanggal Mulai Kerja: " + TglMulaiKerja);
        System.out.println("Masa Kerja: " + MasaKerja + " hari");
        System.out.println("Pajak yang harus dibayar: " + Pajak);

        System.out.println("\nInformasi Pengusaha2:");
        String npwp = pe2.getNpwp();
        System.out.println("NPWP: " + npwp);

        System.out.println("\nInformasi Petani2:");
        String asalKota = pt2.getAsalKota();
        System.out.println("Asal Kota: " + asalKota);

    }
}
