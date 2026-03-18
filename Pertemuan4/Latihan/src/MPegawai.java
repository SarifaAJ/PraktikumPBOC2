/* Nama File    : MPegawai.java 
 * Deskripsi    : berisi method main untuk menguji class Pegawai, Dosen, DosenTamu, dan Tendik
 * Pembuat      : Sarifa Nuha Ardanti Jusmar
 * Tanggal      : 18 Maret 2026
 */

import java.time.LocalDate;

public class MPegawai {
    public static void main(String[] args){
        /* TEST CLASS DOSENTETAP */
        DosenTetap dosen1 = new DosenTetap("Dr. Budi Santoso", "123456789", LocalDate.of(1975, 5, 20), LocalDate.of(2000, 8, 1), 5000000, "Teknik Informatika", "NIDN12345");
        System.out.println("=== Informasi Dosen Tetap===");
        dosen1.printInfo();
        
        /* TEST CLASS DOSENTAMU */
        DosenTamu dosenTamu1 = new DosenTamu("Dr. Siti Aminah", "987654321", LocalDate.of(1980, 3, 15), LocalDate.of(2022, 1, 1), 4000000, "Teknik Elektro", "NIDK12345", LocalDate.of(2023, 12, 31));

        System.out.println("\n=== Informasi Dosen Tamu ===");
        dosenTamu1.printInfo();
        
        /* TEST CLASS TENDIK */
        Tendik tendik1 = new Tendik("Ahmad Fauzi", "555555555", LocalDate.of(1985, 7, 10), LocalDate.of(2010, 6, 1), 3000000, "Administrasi Akademik");
        
        System.out.println("\n=== Informasi Tendik ===");
        tendik1.printInfo();
    }
}
