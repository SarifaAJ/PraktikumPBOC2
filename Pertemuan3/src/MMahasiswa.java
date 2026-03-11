public class MMahasiswa {
    public static void main(String[] args) {
        //* * * TEST CLASS DOSEN * * */
        Dosen D1 = new Dosen(); // objek dosen dengan konstruktor tanpa parameter
        Dosen D2 = new Dosen("112233", "Colonello", "Biologi"); // objek dosen dengan konstruktor dengan parameter

        D1.setNIP("001122"); // mengubah nilai NIP
        String NIP = D1.getNIP(); // mengambil nilai NIP
        System.out.println("NIP: " + NIP); // menampilkan nilai NIP

        D1.setNama("Reborn"); // mengubah nilai Nama
        String Nama = D1.getNama(); // mengambil nilai Nama
        System.out.println("Nama: " + Nama); // menampilkan nilai Nama

        D1.setProdi("Informatika"); // mengubah nilai Prodi
        String Prodi = D1.getProdi(); // mengambil nilai Prodi
        System.out.println("Prodi: " + Prodi); // menampilkan nilai Prodi


        //* * * TEST CLASS MATAKULIAH * * */
        MataKuliah MK1 = new MataKuliah(); // objek MataKuliah dengan konstruktor tanpa parameter
        MataKuliah MK2 = new MataKuliah("02", "Algoritma dan Pemrograman", 3); // objek MataKuliah dengan konstruktor dengan parameter

        MK1.setIdMatKul("01"); // mengubah nilai idMatKul
        String idMatKul = MK1.getIdMatKul(); // mengambil nilai idMatKul
        System.out.println("ID Mata Kuliah: " + idMatKul); // menampilkan nilai idMatKul

        MK1.setNamaMatKul("Struktur Data"); // mengubah nilai namaMatKul
        String namaMatKul = MK1.getNamaMatKul(); // mengambil nilai namaMatKul
        System.out.println("Nama Mata Kuliah: " + namaMatKul); // menampilkan nilai namaMatKul

        MK1.setSKS(4); // mengubah nilai SKS
        int SKS = MK1.getSKS(); // mengambil nilai SKS
        System.out.println("SKS: " + SKS); // menampilkan nilai SKS
        
        
        //* * * TEST CLASS KENDARAAN * * */
        Kendaraan K1 = new Kendaraan(); // objek Kendaraan dengan konstruktor tanpa parameter
        Kendaraan K2 = new Kendaraan("B 1234 ABC", "Mobil"); // objek Kendaraan dengan konstruktor dengan parameter

        K1.setNoPlat("H 3333 HE"); // mengubah nilai noPlat
        String noPlat = K1.getNoPlat(); // mengambil nilai noPlat
        System.out.println("No Plat: " + noPlat); // menampilkan nilai noPlat

        K1.setJenis("Motor"); // mengubah nilai jenis
        String jenis = K1.getJenis(); // mengambil nilai jenis
        System.out.println("Jenis: " + jenis); // menampilkan nilai jenis


        //* * * TEST CLASS MAHASISWA * * */
        Mahasiswa M1 = new Mahasiswa(); // objek Mahasiswa dengan konstruktor tanpa parameter
        Mahasiswa M2 = new Mahasiswa("12345", "Tsuna", "Informatika"); // objek Mahasiswa dengan konstruktor dengan parameter

        M1.setNIM("54321"); // mengubah nilai NIM
        String NIM = M1.getNIM(); // mengambil nilai NIM
        System.out.println("NIM: " + NIM); // menampilkan nilai NIM

        M1.setNama("Gokudera"); // mengubah nilai Nama
        String nama = M1.getNama(); // mengambil nilai Nama
        System.out.println("Nama: " + nama); // menampilkan nilai Nama

        M1.setProdi("Sistem Informasi"); // mengubah nilai Prodi
        String prodi = M1.getProdi(); // mengambil nilai Prodi
        System.out.println("Prodi: " + prodi); // menampilkan nilai Prodi

        M1.setDosenWali(D2); // mengubah nilai dosen wali
        M1.setKendaraan(K2); // mengubah nilai kendaraan
        M1.addMatKul(MK1); // menambahkan mata kuliah MK1 ke listMatKul
        M1.addMatKul(MK2); // menambahkan mata kuliah MK2 ke listMatKul

        M2.printMhs(); // menampilkan nim, nama, dan prodi mahasiswa M2
        M1.printDetailMhs(); // menampilkan nim, nama, prodi, daftar mata kuliah yang diambil, data dosen wali, serta data kendaraan yang dimiliki mahasiswa M1

        System.out.println("Jumlah mata kuliah: " + M1.getJumlahMatKul()); // menampilkan jumlah mata kuliah yang diambil mahasiswa M1
        System.out.println("Jumlah SKS mata kuliah: " + M1.getJumlahSKS()); // menampilkan jumlah SKS mata kuliah yang diambil mahasiswa M1
    }
}
