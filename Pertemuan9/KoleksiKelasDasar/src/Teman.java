/* Nama File    : Teman.java 
 * Deskripsi    : berisi atribut dan method dari kelas Teman
 * Pembuat      : Sarifa Nuha Ardanti Jusmar
 * Tanggal      : 7 Mei 2026
 */

import java.util.ArrayList;

public class Teman {
    /* * * ATRIBUT * * */
    private int nbElm;
    private ArrayList<String> Lnama;

    /* * * METHOD * * */
    //KONSTRUKTOR
    public Teman(){
        Lnama = new ArrayList<>();
        nbElm = 0;
    }
    
    // a. getNbElm
    public int getNbElm(){
        return nbElm;
    }

    // b. getNama(indeks)
    public String getNama(int indeks){
        return Lnama.get(indeks);
    }

    // c. setNama(indeks,nama)
    public void setNama(int indeks, String nama){
        Lnama.set(indeks, nama);
    }
    
    // d. addNama(nama)
    public void addNama(String nama){
        Lnama.add(nama);
        nbElm++;
    }

    // e. delNama(nama)
    public void delNama(String nama){
        if(Lnama.remove(nama)){
            nbElm--;
        }
    }

    // f. isMember(nama)
    public boolean isMember(String nama){
        return Lnama.contains(nama);
    }

    // g. gantiNama(nama, namaBaru)
    public void gantiNama(String nama, String namaBaru){
        int idx = Lnama.indexOf(nama);
        if (idx != -1) {
            Lnama.set(idx, namaBaru);
        }
    }

    // h. countNama(nama)
    public int countNama(String nama){
        int count = 0;

        for (String n: Lnama) {
            if(n.equals(nama)){
                count++;
            }
        }
        return count;
    }

    // i. showTeman(){menampilkan semua nama teman dalam Lnama}
    public void showTeman(){
        System.out.println("Daftar Nama");

        for(String n: Lnama){
            System.out.println("- " + n);
        }
    }
}
