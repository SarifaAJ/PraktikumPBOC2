/* Nama File    : Persegi.java 
 * Deskripsi    : berisi atribut dan method dalam class Persegi
 * Pembuat      : Sarifa Nuha Ardanti Jusmar
 * Tanggal      : 13 Maret 2026
 */

public class Persegi extends BangunDatar{
    /* * * ATRIBUT * * */
    private double sisi;

    /* * * METHOD * * */
    /* KONSTRUKTOR */
    //membuat objek Persegi tanpa parameter
    public Persegi(){
        setJmlSisi(4);
    }

    //membuat objek Persegi dengan parameter
    public Persegi(double sisi, String warna, String border){
        super(4, warna, border);
        this.sisi = sisi;
    }

    /* SELEKTOR */
    //mengembalikan nilai sisi
    public double getSisi(){
        return sisi;
    }

    //mengembalikan nilai luas
    public double getLuas() {
        return sisi*sisi;
    }

    //mengembalikan nilai keliling
    public double getKeliling() {
        return sisi*4;
    }

    //mengembalikan nilai diagonal
    public double getDiagonal(){
        return Math.sqrt((sisi*sisi) + (sisi*sisi));
    }

    /* MUTATOR */
    //mengubah nilai sisi
    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    //menampilan informasi Persegi
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Panjang sisi: " + sisi);
    }

}
