/* Nama File    : Dosen.java 
 * Deskripsi    : berisi atribut dan method dalam class Dosen
 * Pembuat      : Sarifa Nuha Ardanti Jusmar
 * Tanggal      : 5 Maret 2026
 */

public class Dosen {
    /* * * ATTRIBUT * * */
    private String NIP;
    private String Nama;
    private String Prodi;

    /* * * METHOD * * */

    /* KONSTRUKTOR */
    //tanpa parameter
    public Dosen() {
        this.NIP = "";
        this.Nama = "";
        this.Prodi = "";
    }

    //dengan parameter
    public Dosen(String NIP, String Nama, String Prodi) {
        this.NIP = NIP;
        this.Nama = Nama;
        this.Prodi = Prodi;
    }

    /* SELEKTOR */
    //get NIP
    public String getNIP(){
        return NIP;
    }

    //get Nama
    public String getNama(){
        return Nama;
    }

    //get Prodi
    public String getProdi(){
        return Prodi;
    }

    /* MUTATOR */
    //set NIP
    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    //setNama
    public void setNama(String Nama){
        this.Nama = Nama;
    }

    //set Prodi
    public void setProdi(String Prodi){
        this.Prodi = Prodi;
    }
}
