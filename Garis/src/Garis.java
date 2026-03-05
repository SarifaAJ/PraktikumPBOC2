/* Nama File    : Garis.java 
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : Sarifa Nuha Ardanti Jusmar
 * Tanggal      : 4 Maret 2026
 */

public class Garis {
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris;

    // Konstruktor tanpa parameter (membuat garis dari (0,0) ke (1,1))
    public Garis() {
        this.titikAwal = new Titik(0, 0);
        this.titikAkhir = new Titik(1, 1);
        counterGaris++;
    }
    
    // Konstruktor dengan parameter Titik
    public Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    public static int getCounterGaris() {
        return counterGaris;
    }

    public Titik getTitikAwal() {
        return titikAwal;
    }
    
    public void setTitikAwal(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }
    
    public Titik getTitikAkhir() {
        return titikAkhir;
    }
    
    public void setTitikAkhir(Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    // mendapatkan panjang garis
    public double getPanjang() {
        return titikAwal.getJarak(titikAkhir);
    }
    
    // mendapatkan gradien garis
    public double getGradien() {
        return (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) / (titikAkhir.getAbsis() - titikAwal.getAbsis());
    }

    // mendapatkan titik tengah garis
    public Titik getTitikTengah() {
        double absisTengah = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double ordinatTengah = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(absisTengah, ordinatTengah);
    }

    // apakah garis sejajar dengan garis lain
    public boolean isSejajar(Garis garis) {
        return this.getGradien() == garis.getGradien();
    }

    // apakah garis tegak lurus dengan garis lain
    public boolean isTegakLurus(Garis garis) {
        return this.getGradien() * garis.getGradien() == -1;
    }

    // persamaan garis dalam bentuk y = mx + c
    public String getPersamaanGaris() {
        double m = this.getGradien();
        double c = titikAwal.getOrdinat() - m * titikAwal.getAbsis();
        return "y = " + m + "x + " + c;
    }

    //mencetak garis
    public void printGaris() {
        System.out.println("Garis dari " + titikAwal + " ke " + titikAkhir);
    }
    
}
