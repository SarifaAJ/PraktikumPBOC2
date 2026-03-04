 
public class Titik {
    /* * * * * * ATRIBUT * * * * * */
    private double absis;
    double ordinat;
    static int counterTitik;

    /* * * * * * METHOD * * * * * */
    //konstruktor untuk membuat titik (0,0)
    public Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    public Titik (double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    //mengembalikan nilai counterTitik
    public static int getounterTitik() {
        return counterTitik;
    }

    //mengembalikan nilai absis
    public double getAbsis() {
        return absis;
    }

    //mengembalikan nilai ordinat
    public double getOrdinat() {
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    public void setAbsis(double x) {
        absis = x;
    }

    //mengeset oridnat titik dengan nilai baru y
    public void setOrdinat(double y) {
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //mengembalikan letak kuadran titik
    public int getKuadran() {
        if (this.absis > 0 && this.ordinat > 0) {
            return 1;
        } else if (this.absis < 0 && this.ordinat > 0) {
            return 2;
        } else if (this.absis < 0 && this.ordinat < 0) {
            return 3;
        } else if (this.absis > 0 && this.ordinat < 0) {
            return 4;
        } else {
            return 0;
        }
    }

    public double getJarakPusat() {
        return Math.sqrt((this.absis * this.absis) + (this.ordinat * this.ordinat));

    }

    public double getJarak(Titik T) {
        return Math.sqrt(((this.absis - T.absis)*(this.absis - T.absis)) + ((this.ordinat - T.ordinat)*(this.ordinat - T.ordinat)));
    }

    public void refleksiX() {
        this.absis = -absis;
    }

    public void refleksiY() {
        this.ordinat = -ordinat;
    }

    public Titik getRefleksiX() {
        Titik X = new Titik(this.absis, -this.ordinat);
        return X;
    }

    public Titik getRefleksiY() {
        Titik Y = new Titik(-this.absis, this.ordinat);
        return Y;
    }

    //mencetak koordinat titik
    public void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
}
