/* Nama File    : BangunDatar.java 
 * Deskripsi    : berisi atribut dan method dalam class BangunDatar
 * Pembuat      : Sarifa Nuha Ardanti Jusmar
 * Tanggal      : 26 Maret 2026
 */

public abstract class BangunDatar {
    /* * * ATRIBUT * * */
    private int jmlSisi;
    private String warna;
    private String border;
    private static int counterBangunDatar = 0;

    /* * * METHOD * * */
    /* KONSTRUKTOR */
    //membuat objek BangunDatar tanpa parameter
    public BangunDatar(){
        this.jmlSisi = 0;
        this.warna = "";
        this.border = "";
        counterBangunDatar++;
    }

    //membuat objek BangunDatar dengan parameter
    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    /* SELEKTOR */
    //mengembalikan nilai jumlah sisi
    public int getJmlSisi(){
        return jmlSisi;
    }

    //mengembalikan nilai warna
    public String getWarna(){
        return warna;
    }

    //mengembalikan nilai border
    public String getBorder(){
        return border;
    }

    /* MUTATOR */
    //mengubah nilai jumlah sisi
    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    //mengubah nilai warna
    public void setWarna(String warna){
        this.warna = warna;
    }

    //mengubah nilai border
    public void setBorder(String border){
        this.border = border;
    }

    public abstract double getLuas();

    public abstract double getKeliling();

    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    };

    public boolean isEqualKeliling(BangunDatar X){
        return this.getKeliling() == X.getKeliling();
    };

    //menampilkan informasi BangunDatar
    public void printInfo(){
        System.out.println("Jumlah sisi: " +jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    public static void printCounterBangunDatar(){
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }

}
