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

    // Method untuk mendapatkan panjang garis
    public double getPanjang() {
        return titikAwal.getJarak(titikAkhir);
    }
    
    // Method untuk mendapatkan gradien garis
    public double getGradien() {
        return (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) / (titikAkhir.getAbsis() - titikAwal.getAbsis());
    }

    //mencetak garis
    public void printGaris() {
        System.out.println("Garis dari " + titikAwal + " ke " + titikAkhir);
    }
    
}
