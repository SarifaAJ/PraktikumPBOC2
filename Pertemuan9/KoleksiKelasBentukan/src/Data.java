/* Nama File    : Data.java 
 * Deskripsi    : berisi atribut dan method dari kelas Data
 * Pembuat      : Sarifa Nuha Ardanti Jusmar
 * Tanggal      : 7 Mei 2026
 */

import java.util.Arrays;

public class Data<T> {
    /* * * ATRIBUT * * */
    private static final int KAPASITAS = 100;
    private final T[] ruang;
    private int banyak;

    /* * * METHOD * * */
    /* KOSTRUKTOR */
    //menambahkan objek dengan parameter
    public Data(T[] contohRuang) {
        this.ruang = Arrays.copyOf(contohRuang, KAPASITAS);
        this.banyak = 0;
    }

    /* GETTER */
    // method untuk mendapatkan isi dari objek Datum berdasarkan posisi
    public T getIsi(int posisi){
        return ruang[posisi -1];
    }

    /* SETTER */
    // method untuk mengubah isi dari objek Datum berdasarkan posisi
    public void setIsi(int posisi, T objek){
        if(ruang[posisi] == null){
            banyak++;
        }

        ruang[posisi - 1] = objek;
    }

    /* METHOD LAIN */
    // method untuk menampilkan isi dari objek Datum berdasarkan posisi
    public int getSize(){
        return banyak;
    }
}
