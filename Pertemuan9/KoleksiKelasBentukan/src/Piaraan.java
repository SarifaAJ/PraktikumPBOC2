/* Nama File    : Piaraan.java 
 * Deskripsi    : berisi untuk atribut dan method dari kelas Piaraan
 * Pembuat      : Sarifa Nuha Ardanti Jusmar
 * Tanggal      : 7 Mei 2026
 */

import java.util.LinkedList;

public class Piaraan {
    // a. atribut panggilam 
    private int nbElm;
    private final LinkedList<Anabul> Lanabul;

    public Piaraan(){
        Lanabul = new LinkedList<>();
        nbElm = 0;
    }

    // b. i) getNbelm
    public int getNbelm(){
        return nbElm;
    }

    // b. ii) enqueueAnabul(anabul){menambah elemen akhir}
    public void enqueueAnabul(Anabul anabul){
        Lanabul.addLast(anabul);
        nbElm++;
    }

    // b. iii) isMember(anabul)
    public boolean isMember(Anabul anabul){
        return Lanabul.contains(anabul);
    }

    // b. iv) getAnabul(){mengambil data anabul pertama dalam antrean}
    public Anabul getAnabul(){
        return Lanabul.peekFirst();
    }

    // b. v) dequeueAnabul(){mengambil anabul pertama sekaligus mengeluarkannya dari antrean}
    public Anabul dequeueAnabul(){
        Anabul remove = Lanabul.pollFirst();
    
        if(remove != null){
            nbElm--;
        }
        return remove;  
    }
    // c. showAnabul 
    public void showAnabul(){
        System.out.println("Daftar anabul");

        for(Anabul anabul: Lanabul){
            System.out.println("- " + anabul);
        }
    }

    // d. countKucing {menghitung banyak keluarga kucing dalam antrean}
    public int countKucing(){
        int count = 0;

        for (Anabul anabul: Lanabul) {
            if(anabul instanceof Kucing){
                count++;
            }
        }
        return count;
    }

    // e.  bobotKucing {menghitung bobot keluarga kucing dalam antrean}
    public double bobotKucing(){
        double total = 0.0;

        for (Anabul anabul: Lanabul) {
            if(anabul instanceof Kucing){
                total += ((Kucing) anabul).getBobot();
            }
        }
        return total;
    }

    // f. showJenisAnabul 
    public void showJenisAnabul(){
        System.out.println("Daftar jenis anabul: ");

        for(Anabul anabul: Lanabul){
            System.out.println(anabul.getNama() + " - " + anabul.getClass().getName());
        }
    }
}
