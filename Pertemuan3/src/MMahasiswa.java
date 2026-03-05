public class MMahasiswa {
    public static void main(String[] args) {
        //* * * TEST CLASS DOSEN * * */
        Dosen D1 = new Dosen();
        Dosen D2 = new Dosen("112233", "Colonello", "Biologi");

        D1.setNIP("001122");
        String NIP = D1.getNIP();
        System.out.println("NIP: " + NIP);

        D1.setNama("Reborn");
        String Nama = D1.getNama();
        System.out.println("Nama: " + Nama);

        D1.setProdi("Informatika");
        String Prodi = D1.getProdi();
        System.out.println("Prodi: " + Prodi);


        //* * * TEST CLASS MATAKULIAH * * */
        MataKuliah MK1 = new MataKuliah();
        MataKuliah MK2 = new MataKuliah("02", "Algoritma dan Pemrograman", 3);

        MK1.setIdMatKul("01");
        String idMatKul = MK1.getIdMatKul();
        System.out.println("ID Mata Kuliah: " + idMatKul);

        MK1.setNamaMatKul("Struktur Data");
        String namaMatKul = MK1.getNamaMatKul();
        System.out.println("Nama Mata Kuliah: " + namaMatKul);

        MK1.setSKS(4);
        int SKS = MK1.getSKS();
        System.out.println("SKS: " + SKS);
        
        
        //* * * TEST CLASS KENDARAAN * * */
        Kendaraan K1 = new Kendaraan();
        Kendaraan K2 = new Kendaraan("B 1234 ABC", "Mobil");

        K1.setNoPlat("H 3333 HE");
        String noPlat = K1.getNoPlat();
        System.out.println("No Plat: " + noPlat);

        K1.setJenis("Motor");
        String jenis = K1.getJenis();
        System.out.println("Jenis: " + jenis);


        //* * * TEST CLASS MAHASISWA * * */
        Mahasiswa M1 = new Mahasiswa();
        Mahasiswa M2 = new Mahasiswa("12345", "Tsuna", "Informatika");

        M1.setNIM("54321");
        String NIM = M1.getNIM();
        System.out.println("NIM: " + NIM);

        M1.setNama("Gokudera");
        String nama = M1.getNama();
        System.out.println("Nama: " + nama);

        M1.setProdi("Sistem Informasi");
        String prodi = M1.getProdi();
        System.out.println("Prodi: " + prodi);

        M1.setDosenWali(D2);
        M1.setKendaraan(K2);
        M1.addMatKul(MK1);
        M1.addMatKul(MK2);

        M2.printMhs();
        M1.printDetailMhs();

        System.out.println("Jumlah mata kuliah: " + M1.getJumlahMatKul());
        System.out.println("Jumlah SKS mata kuliah: " + M1.getJumlahSKS());

    }
}
