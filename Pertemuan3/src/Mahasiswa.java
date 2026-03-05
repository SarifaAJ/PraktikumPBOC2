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
    //tanpa parameter
    public Mahasiswa(){
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatKul = new ArrayList<>();
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    //dengan parameter
    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>();
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    /* SELEKTOR */
    //get nim
    public String getNIM(){
        return this.nim;
    }

    //get nama
    public String getNama(){
        return this.nama;
    }

    //get prodi
    public String getProdi(){
        return this.prodi;
    }

    //get listMatKul
    public ArrayList<MataKuliah> getListMatKul(){
        return this.listMatKul;
    }

    //get dosen
    public Dosen getDosenWali(){
        return this.dosenWali;
    }

    //get kendaraan
    public Kendaraan getKendaraan(){
        return this.kendaraan;
    }


    /* MUTATOR */
    //set nim
    public void setNIM(String nim){
        this.nim = nim;
    }

    //set nama
    public void setNama(String nama){
        this.nama = nama;
    }

    //set prodi
    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    //set listMatKul
    public void setListMatKul(ArrayList<MataKuliah> listMatKul) {
        this.listMatKul = listMatKul;
    }

    //set dosen
    public void setDosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    //set kendaraan
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
