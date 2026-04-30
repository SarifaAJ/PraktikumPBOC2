/* Nama File    : MCivitas.java 
 * Deskripsi    : berisi tentang kelas utama untuk menjalankan program yang melibatkan Civitasakademika, Dosen, Mahasiswa, dan Seminar
 * Pembuat      : Sarifa Nuha Ardanti Jusmar
 * Tanggal      : 30 April 2026
 */

public class MCivitas {
    public static void main(String[] args) throws Exception {
        // Buat objek dosen
        Dosen dosen1 = new Dosen("Prof. Dr. Furuya Rei", "197503152005011001");
        Dosen dosen2 = new Dosen("Dr. Akai Shuuichi, M.Kom", "198012102008012002");

        // Buat objek mahasiswa (tanpa wali dulu)
        Mahasiswa mhs1 = new Mahasiswa("Kuco Shinichi", "G64123456", dosen1);
        Mahasiswa mhs2 = new Mahasiswa("Hattori Heiji", "G64123457", dosen1);
        Mahasiswa mhs3 = new Mahasiswa("Haibara Ai", "G64123458", dosen2);

        // Set dosen wali untuk mahasiswa
        mhs1.setWali(dosen1);
        mhs2.setWali(dosen1);
        mhs3.setWali(dosen2);

        // menampilkan informasi mahasiswa
        mhs1.tampilDataMahasiswa();
        System.out.println("---");
        mhs2.tampilDataMahasiswa();
        System.out.println("---");
        mhs3.tampilDataMahasiswa();
    }
}
