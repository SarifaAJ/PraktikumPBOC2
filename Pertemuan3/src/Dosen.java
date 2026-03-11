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
    //membuat objek Dosen tanpa parameter
    public Dosen() {
        this.NIP = "";
        this.Nama = "";
        this.Prodi = "";
    }

    //membuat objek Dosen dengan parameter
    public Dosen(String NIP, String Nama, String Prodi) {
        this.NIP = NIP;
        this.Nama = Nama;
        this.Prodi = Prodi;
    }

    /* SELEKTOR */
    //mengambil nilai NIP
    public String getNIP(){
        return NIP;
    }

    //mengambil nilai Nama
    public String getNama(){
        return Nama;
    }

    //mengambil nilai Prodi
    public String getProdi(){
        return Prodi;
    }

    /* MUTATOR */
    //mengubah nilai NIP
    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    //mengubah nilai Nama
    public void setNama(String Nama){
        this.Nama = Nama;
    }

    //mengubah nilai Prodi
    public void setProdi(String Prodi){
        this.Prodi = Prodi;
    }
}
