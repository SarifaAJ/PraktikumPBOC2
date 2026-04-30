/* Nama File    : Seminar.java 
 * Deskripsi    : berisi tentang atribut dan method dari kelas Seminar
 * Pembuat      : Sarifa Nuha Ardanti Jusmar
 * Tanggal      : 30 April 2026
 */

public class Seminar {
    /* * * ATRIBUT * * */
    private Civitasakademika[] pesertas;
    private int banyakPeserta;

    /* * * METHOD * * */
    /* KONSTRUKTOR */
    // b. Konstruktor Seminar dengan inisialisasi banyakPeserta = 0
    public Seminar() {
        this.pesertas = new Civitasakademika[100]; 
        this.banyakPeserta = 0;
    }

    /* GETTER */
    // mengembalikan nilai peserta
    public Civitasakademika[] getPesertas() {
        return this.pesertas;
    }

    // mengembalikan nilai banyakPeserta
    public int getBanyakPeserta() {
        return this.banyakPeserta;
    }

    /* SETTER */
    // mengubah nilai peserta
    public void setPesertas(Civitasakademika[] pesertas) {
        this.pesertas = pesertas;
    }

    // mengubah nilai banyakPeserta
    public void setBanyakPeserta(int banyakPeserta) {
        this.banyakPeserta = banyakPeserta;
    }

    /* METHOD LAIN */
    // c. Fungsi countPeserta
    public int countPeserta() {
        return banyakPeserta;
    }

    // d. Prosedur registrasi (pengisian kontigu, tidak melompat)
    public void registrasi(Civitasakademika peserta) {
        if (banyakPeserta < pesertas.length) {
            pesertas[banyakPeserta] = peserta;
            banyakPeserta++;
            System.out.println("Registrasi berhasil: " + peserta.getNama() + 
                               " (" + peserta.getNomor() + ")");
        } else {
            System.out.println("Maaf, kapasitas seminar sudah penuh (maksimal 100 peserta)!");
        }
    }
    
    // g. Prosedur tampilPeserta
    public void tampilPeserta() {
        System.out.println("\n=== DAFTAR PESERTA SEMINAR ===");
        System.out.println("No\tNomor\t\t\tNama");
        System.out.println("==============================================");
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.println((i+1) + "\t" + pesertas[i].getNomor() + 
                               "\t" + pesertas[i].getNama());
        }
    }

    // h. Fungsi countMahasiswa (menggunakan instanceof)
    public int countMahasiswa() {
        int jumlah = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa) {
                jumlah++;
            }
        }
        return jumlah;
    }

}
