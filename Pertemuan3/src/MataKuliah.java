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
    //tanpa parameter
    public MataKuliah() {
        this.idMatKul = "";
        this.namaMatKul = "";
        this.SKS = 0;
    }

    //dengan parameter
    public MataKuliah(String idMatKul, String namaMatKul, int SKS){
        this.idMatKul = idMatKul;
        this.namaMatKul = namaMatKul;
        this.SKS = SKS;
    }

    /* SELEKTOR */
    //get idMatKul
    public String getIdMatKul(){
        return this.idMatKul;
    }

    //get namaMatKul
    public String getNamaMatKul(){
        return this.namaMatKul;
    }

    //get SKS
    public int getSKS(){
        return this.SKS;
    }

    /* MUTATOR */
    //set idMatKul
    public void setIdMatKul(String idMatKul){
        this.idMatKul = idMatKul;
    }

    //set namaMatKul
    public void setNamaMatKul(String namaMatKul){
        this.namaMatKul = namaMatKul;
    }

    //set SKS
    public void setSKS(int SKS){
        this.SKS = SKS;
    }
}
