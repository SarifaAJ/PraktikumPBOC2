/* Nama File    : Main.java 
 * Deskripsi    : berisi program utama untuk menjalankan kelas Teman
 * Pembuat      : Sarifa Nuha Ardanti Jusmar
 * Tanggal      : 7 Mei 2026
 */

public class Main {
    public static void main(String[] args) {
        Teman T1 = new Teman();

        // d. Menambah nama teman
        T1.addNama("Hattori");
        T1.addNama("Kudo");
        T1.addNama("Kuroba");
        T1.addNama("Hakuba");
        System.out.println(T1.getNama(0));

        // i. Menampilkan semua teman
        System.out.println("\n Menampilkan semua daftar teman:");
        T1.showTeman();
        System.out.println();
        
        // a. Menampilkan jumlah elemen
        System.out.println("\n Jumlah teman dalam daftar: " + T1.getNbElm() + " orang\n");
        
        // b. Mengambil nama berdasarkan indeks
        System.out.println("\n Mengambil nama berdasarkan indeks:");
        System.out.println("Nama pada indeks 0: " + T1.getNama(0));
        System.out.println("Nama pada indeks 2: " + T1.getNama(2));
        System.out.println();
        
        // c. Mengubah nama berdasarkan indeks
        System.out.println("\nMengubah nama berdasarkan indeks:");
        System.out.println("Sebelum diubah: " + T1.getNama(1)); 
        T1.setNama(1, "Sera");
        System.out.println("Setelah diubah: " + T1.getNama(1)); 
        System.out.println();
        
        // f. Mengecek apakah nama member
        System.out.println("\n Pengecekan keanggotaan:");
        System.out.println("Apakah 'Mouri' member? " + T1.isMember("Mouri"));
        System.out.println("Apakah 'Hattori' member? " + T1.isMember("Hattori"));
        System.out.println();
        
        // g. Mengganti nama dengan nama baru
        System.out.println("\n Mengganti nama (nama lama -> nama baru):");
        System.out.println("Sebelum diganti:");
        T1.showTeman();
        T1.gantiNama("Sera", "Suzuki");
        System.out.println("\nSetelah 'Sera' diganti menjadi 'Suzuki':");
        T1.showTeman();
        System.out.println();
        
        // h. Menghitung jumlah kemunculan nama
        System.out.println("\n Menghitung jumlah kemunculan nama:");
        T1.addNama("Kudo"); 
        T1.showTeman();
        System.out.println("\nJumlah 'Kudo' dalam daftar: " + T1.countNama("Kudo") + " kali");
        System.out.println("Jumlah 'Hakuba' dalam daftar: " + T1.countNama("Hakuba") + " kali");
        System.out.println();
        
        // e. Menghapus nama
        System.out.println("\n Menghapus nama:");
        System.out.println("Sebelum dihapus: " + T1.getNbElm() + " orang");
        T1.delNama("Hakuba");
        System.out.println("Setelah menghapus 'Hakuba': " + T1.getNbElm() + " orang");
        System.out.println("\nDaftar teman setelah penghapusan:");
        T1.showTeman();
        System.out.println();        
    }
}
