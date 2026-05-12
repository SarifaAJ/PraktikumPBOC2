/* Nama File    : Main.java 
 * Deskripsi    : berisi untuk menguji kelas yang lain
 * Pembuat      : Sarifa Nuha Ardanti Jusmar
 * Tanggal      : 7 Mei 2026
 */

public class Main {
    public static void main(String[] args) {
        //KOLEKSI
        Piaraan P1 = new Piaraan();

        Kucing A1 = new Kucing("Ruby", 4.5);
        Anggora A2 = new Anggora("Pearl", 5.2);
        Anjing A3 = new Anjing("Onyx");
        Burung A4 = new Burung("Sky");
        Kembangtelon A5 = new Kembangtelon("Aqua", 4.0);

        // b. ii - Menambahkan anabul ke dalam antrean
        P1.enqueueAnabul(A1);
        P1.enqueueAnabul(A2);
        P1.enqueueAnabul(A3);
        P1.enqueueAnabul(A4);
        P1.enqueueAnabul(A5);

        // b. i - Menampilkan jumlah anabul dalam antrean
        System.out.println("\n Jumlah Anabul dalam Piaraan: " + P1.getNbelm() + " ekor\n");

        // c. - Menampilkan semua anabul dalam antrean
        System.out.println("\n Menampilkan semua Anabul:");
        P1.showAnabul();
        System.out.println();
        
        // b. iii - Cek apakah anabul member
        System.out.println("\n Pengecekan keanggotaan Anabul:");
        System.out.println("\n Apakah Ruby member? " + P1.isMember(A1));
        Kucing kucingBaru = new Kucing("Baru", 2.0);
        System.out.println(" \n Apakah Baru member? " + P1.isMember(kucingBaru));
        System.out.println();
        
        // b. iv - Mendapatkan anabul pertama (tanpa menghapus)
        System.out.println("\n Anabul pertama dalam antrian:");
        Anabul anabulPertama = P1.getAnabul();

        if(anabulPertama != null) {
            System.out.println("\n Anabul pertama: " + anabulPertama);
        }
        System.out.println();
        
        // d. - Menghitung jumlah kucing
        System.out.println("\n Jumlah Kucing dalam Piaraan: " + P1.countKucing() + " ekor\n");
        
        // e. - Menghitung total bobot semua kucing
        System.out.println("\n Total bobot semua Kucing: " + P1.bobotKucing() + " kg\n");
        
        // f. - Menampilkan jenis setiap anabul
        System.out.println("\n Menampilkan jenis setiap Anabul:");
        P1.showJenisAnabul();
        System.out.println();

        // b. v - Mengambil dan mengeluarkan anabul pertama
        System.out.println("\n Mengambil dan mengeluarkan Anabul pertama:");
        Anabul anabulKeluar = P1.dequeueAnabul();
        if(anabulKeluar != null) {
            System.out.println("Anabul yang keluar: " + anabulKeluar);
        }


    }
}
