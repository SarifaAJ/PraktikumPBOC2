/* Nama File    : Main.java 
 * Deskripsi    : berisi untuk menguji kelas yang lain
 * Pembuat      : Sarifa Nuha Ardanti Jusmar
 * Tanggal      : 7 Mei 2026
 */

public class Main {
    public static void main(String[] args) {
        // I. GENERIK PADA CLASS
        System.out.println("Aplikasi kelas Datum");
        Datum<Anabul> data = new Datum<>(new Kucing("Artemis", 3.5));
        Datum<Anabul> data2 = new Datum<>(new Anjing("Apollo"));

        data.tampilkanAnabul(data.getIsi());
        System.out.println();

        data.setIsi(new Anggora("Persephone", 5.0));
        data.tampilkanAnabul(data.getIsi());
        System.out.println();

        data.setIsi(new Kembangtelon("Zeus", 4.5));
        data.tampilkanAnabul(data.getIsi());

        data2.tampilkanAnabul(data2.getIsi());

        // II. GENERIK PADA OPERATOR
        System.out.println("\n Prosedur Tukar");
        Datum<Anabul> hewan1 = new Datum<>(new Kucing("Aphrodite", 3.5));
        Datum<Anabul> hewan2 = new Datum<>(new Anjing("Ares"));

        OperatorGenerik.Tukar(hewan1, hewan2);
        hewan1.tampilkanAnabul(hewan1.getIsi());
        hewan2.tampilkanAnabul(hewan2.getIsi());

        Datum<Integer> angka1 = new Datum<>(2);
        Datum<Integer> angka2 = new Datum<>(7);

        OperatorGenerik.Tukar(angka1, angka2);
        System.out.println(angka1.getIsi());
        System.out.println(angka2.getIsi());

        // III. LARIK GENERIK
        // a. aplikasi kelas Data
        System.out.println("\n Aplikasi kelas Data");
        Data<String> dataNama = new Data<>(new String[0]);
        dataNama.setIsi(1, "Hestia");
        dataNama.setIsi(2, "Demeter");
        dataNama.setIsi(3, "Dionysus");

        System.out.println("Isi posisi 1: " + dataNama.getIsi(1));
        System.out.println("Isi posisi 2: " + dataNama.getIsi(2));
        System.out.println("Isi posisi 3: " + dataNama.getIsi(3));
        System.out.println("Jumlah elemen: " + dataNama.getSize());
        System.out.println("Isi posisi 4: " + dataNama.getIsi(4));

        // b. aplikasi kelas Data dengan objek Anabul
        System.out.println("\n Aplikasi kelas Data dengan objek Anabul");
        Data<Anabul> dataAnabul = new Data<>(new Anabul[0]);
        dataAnabul.setIsi(1, new Kucing("Hermes", 2.5));
        dataAnabul.setIsi(2, new Anjing("Hephaestus"));
        dataAnabul.setIsi(3, new Anggora("Aphrodite", 3.5));

        // menampilkan isi larik dataAnabul
        System.out.println("Anabul 1: " + dataAnabul.getIsi(1));
        System.out.println("Anabul 2: " + dataAnabul.getIsi(2));
        System.out.println("Anabul 3: " + dataAnabul.getIsi(3));
        System.out.println("Anabul 4: " + dataAnabul.getIsi(4));
        System.out.println("Jumlah anabul: " + dataAnabul.getSize());
    }
}
