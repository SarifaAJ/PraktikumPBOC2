/* Nama File    : Mahasiswa.java 
 * Deskripsi    : berisi atribut dan method dalam class Kendaraan
 * Pembuat      : Sarifa Nuha Ardanti Jusmar
 * Tanggal      : 5 Maret 2026
 */

import java.util.ArrayList;

public class Mahasiswa {
    /* * * ATTRIBUT * * */
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /* * * METHOD * * */

    /* KONSTRUKTOR */
    //membuat objek Mahasiswa tanpa parameter
    public Mahasiswa(){
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatKul = new ArrayList<>();
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    //membuat objek Mahasiswa dengan parameter
    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>();
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    /* SELEKTOR */
    //mengambil nilai nim
    public String getNIM(){
        return this.nim;
    }

    //mengambil nilai nama
    public String getNama(){
        return this.nama;
    }

    //mengambil nilai prodi
    public String getProdi(){
        return this.prodi;
    }

    //mengambil nilai listMatKul
    public ArrayList<MataKuliah> getListMatKul(){
        return this.listMatKul;
    }

    //mengambil nilai dosen
    public Dosen getDosenWali(){
        return this.dosenWali;
    }

    //mengambil nilai kendaraan
    public Kendaraan getKendaraan(){
        return this.kendaraan;
    }


    /* MUTATOR */
    //mengubah nilai nim
    public void setNIM(String nim){
        this.nim = nim;
    }

    //mengubah nilai nama
    public void setNama(String nama){
        this.nama = nama;
    }

    //mengubah nilai prodi
    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    //mengubah nilai listMatKul
    public void setListMatKul(ArrayList<MataKuliah> listMatKul) {
        this.listMatKul = listMatKul;
    }

    //mengubah nilai dosen
    public void setDosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    //mengubah nilai kendaraan
    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }
    
    /* METHOD LAIN */
    //menambahkan sebuah mata kuliah ke atribut listMatKul
    public void addMatKul(MataKuliah newMatKul){
        listMatKul.add(newMatKul);
    }

    //mendapatkan jumlah SKS mata kuliah yang diambil mahasiswa
    public int getJumlahSKS(){
        int jumlahSKS = 0;
        int i;
        for (i = 0; i < listMatKul.size(); i++){
            jumlahSKS += listMatKul.get(i).getSKS();
        }
        return jumlahSKS;
    }

    //mendapatkan jumlah mata kuliah yang diambil mahasiswa
    public int getJumlahMatKul(){
        return listMatKul.size();
    }

    //menampilkan nim, nama, dan prodi mahasiswa
    public void printMhs(){
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }


    //menampilkan nim, nama, prodi, daftar mata kuliah yang diambil, data dosen wali, serta data kendaraan yang dimiliki mahasiswa
    public void printDetailMhs(){
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        
        int i;
        for (i = 0; i < listMatKul.size(); i++){
            System.out.println(listMatKul.get(i).getNamaMatKul());
        }

        System.out.println("Dosen Wali: " + dosenWali.getNama() + " (NIP: " + dosenWali.getNIP() + ", Prodi: " + dosenWali.getProdi() + ")");
        System.out.println("Kendaraan: " + kendaraan.getJenis() + " dengan No Plat: " + kendaraan.getNoPlat());
    }
}
