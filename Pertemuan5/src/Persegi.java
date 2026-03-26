/* Nama File    : Persegi.java 
 * Deskripsi    : berisi atribut dan method dalam class Persegi
 * Pembuat      : Sarifa Nuha Ardanti Jusmar
 * Tanggal      : 26 Maret 2026
 */

public class Persegi extends BangunDatar implements IResize{
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

    @Override
    public void zoomIn(){
        sisi = sisi * 1.1;
    }

    @Override
    public void zoomOut(){
        sisi = sisi * 0.9;
    }

    @Override
    public void zoom(int percent){
        sisi = sisi * percent/100;
    }    

    //menampilan informasi Persegi
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Panjang sisi: " + sisi);
    }

}
