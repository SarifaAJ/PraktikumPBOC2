public class Lingkaran extends BangunDatar {
    /* * * ATRIBUT * * */
    private double jari;

        /* * * METHOD * * */
    /* KONSTRUKTOR */
    //membuat objek Lingkaran tanpa parameter
    public Lingkaran() {
        this.jari = 0;
    }

    //membuat objek Lingkaran dengan parameter
    public Lingkaran(double jari, String warna, String border){
        this.jari = jari;
        setWarna(warna);
        setBorder(border);
    }

    /* SELEKTOR */
    //mengembalikan nilai jari-jari
    public double getJari(){
        return jari;
    }

    //mengembalikan nilai luas
    public double getLuas(){
        return Math.PI*(jari*jari);
    }

    //mengembalikan nilai keliling
    public double getKeliling(){
        return Math.PI*(jari*2);
    }

    /* MUTATOR */
    //mengubah nilai jari-jari
    public void setJari(double jari){
        this.jari = jari;
    }

    //menampilan informasi Lingkaran
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Panjang jari-jari: " + jari);
    }
}
