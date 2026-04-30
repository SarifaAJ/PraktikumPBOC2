/* Nama File    : Main.java 
 * Deskripsi    : berisi tentang poliformisme ad hoc overloading
 * Pembuat      : Sarifa Nuha Ardanti Jusmar
 * Tanggal      : 30 April 2026
 */

public class MMahasiswa {
    public static void main(String[] args) {
        //membuat objek mahasiswa 
        Mahasiswa m1 = new Mahasiswa("123456789", "Aqua", "Teknik Informatika");
        Mahasiswa m2 = new Mahasiswa();
        Mahasiswa m3 = new Mahasiswa();
        Mahasiswa m4 = new Mahasiswa();

        //emngambil nilai atribut menggunakan method getter
        System.out.println("NIM: " + m1.getNIM());
        System.out.println("Nama: " + m1.getNama());
        System.out.println("Program Studi: " + m1.getProgramStudi());

        //V1: mengubah nilai program studi tanpa parameter
        m2.setProgramStudi();
        System.out.println("NIM: " + m2.getNIM());
        System.out.println("Nama: " + m2.getNama());
        System.out.println("Program Studi m2: " + m2.getProgramStudi());

        //V2: mengubah nilai program studi dengan parameter string
        m3.setNama("Ruby");
        m3.setProgramStudi("Sistem Informasi");
        System.out.println("Nama: " + m3.getNama());
        System.out.println("Program Studi m3: " + m3.getProgramStudi());

        //V3: mengubah nilai program studi dengan satu parameter objek Mahasiswa lain
        m4.setProgramStudi(m3);
        System.out.println("Program Studi m4: " + m4.getProgramStudi());
    }
}
