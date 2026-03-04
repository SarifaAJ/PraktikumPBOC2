/* Nama File    : Titik.java 
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Sarifa Nuha Ardanti Jusmar
 * Tanggal      : 4 Maret 2026
 */

public class MTitik {
    public static void main(String[] args){
        Titik T1 = new Titik();
        T1.printTitik();

        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();

        T1.geser(3,4);
        T1.printTitik();

        T1.getKuadran();

        T1.getJarakPusat();

        Titik T3 = new Titik(5, 5);
        T1.getJarak(T3);

        T1.refleksiX();
        T1.printTitik();

        T1.getRefleksiX();
        T1.printTitik();
        
        T1.refleksiY();
        T1.printTitik();

        T1.getRefleksiY();
        T1.printTitik();

        Titik T2 = T1;
        T2.printTitik();
        
        T2.setAbsis(10);
        T2.setOrdinat(10);
        T2.printTitik();

    }
}
