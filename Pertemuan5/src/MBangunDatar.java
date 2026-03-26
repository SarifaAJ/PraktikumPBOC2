/* Nama File    : MBangunDatar.java 
 * Deskripsi    : berisi implementasi class-class yang sudah dibuat
 * Pembuat      : Sarifa Nuha Ardanti Jusmar
 * Tanggal      : 26 Maret 2026
 */

public class MBangunDatar {
    public static void main(String[] args){
        //* * * TEST CLASS BANGUNDATAR * * */
        //BangunDatar BD1 = new BangunDatar();
        BangunDatar P1 = new Persegi(10, "abu-abu", "hitam");
        System.out.println("Luas P1: " + P1.getLuas());
        
        BangunDatar L1 = new Lingkaran(7, "pink", "merah");
        System.out.println("Luas L1: " + L1.getLuas());
        
        Persegi P2 = new Persegi(5, "milo", "coklat");
        System.out.println("Luas P2: " + P2.getLuas());

        Lingkaran L2 = new Lingkaran(14, "lavender", "ungu");
        System.out.println("Luas L2: " + L2.getLuas());

        System.out.println("Luas P1 == L1? : " + P1.isEqualLuas(L1));
        System.out.println("Keliling P1 == L1? : " + P1.isEqualKeliling(L1));

        ((Persegi) P1).zoomIn();
        P2.zoomOut();
        System.out.println("Setelah zoomIn P1: " + ((Persegi) P1).getSisi());
        System.out.println("Setelah zoomOut P2: " + P2.getSisi());

        ((Lingkaran) L1).zoomIn();
        L2.zoomOut();
        System.out.println("Setelah zoomIn L1: " + ((Lingkaran) L1).getJari());
        System.out.println("Setelah zoomOut L2: " + L2.getJari());


    }
}
