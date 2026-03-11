/* Nama File    : MataKuliah.java 
 * Deskripsi    : berisi atribut dan method dalam class MataKuliah
 * Pembuat      : Sarifa Nuha Ardanti Jusmar
 * Tanggal      : 5 Maret 2026
 */

public class MataKuliah {
    /* * * ATTRIBUT * * */
    private String idMatKul;
    private String namaMatKul;
    private int SKS;

    /* * * METHOD * * */

    /* KONSTRUKTOR */
    //membuat objek MataKuliah tanpa parameter
    public MataKuliah() {
        this.idMatKul = "";
        this.namaMatKul = "";
        this.SKS = 0;
    }

    //membuat objek MataKuliah dengan parameter
    public MataKuliah(String idMatKul, String namaMatKul, int SKS){
        this.idMatKul = idMatKul;
        this.namaMatKul = namaMatKul;
        this.SKS = SKS;
    }

    /* SELEKTOR */
    //mengambil nilai idMatKul
    public String getIdMatKul(){
        return this.idMatKul;
    }

    //mengambil nilai namaMatKul
    public String getNamaMatKul(){
        return this.namaMatKul;
    }

    //mengambil nilai SKS
    public int getSKS(){
        return this.SKS;
    }

    /* MUTATOR */
    //mengubah nilai idMatKul
    public void setIdMatKul(String idMatKul){
        this.idMatKul = idMatKul;
    }

    //mengubah nilai namaMatKul
    public void setNamaMatKul(String namaMatKul){
        this.namaMatKul = namaMatKul;
    }

    //mengubah nilai SKS
    public void setSKS(int SKS){
        this.SKS = SKS;
    }
}
