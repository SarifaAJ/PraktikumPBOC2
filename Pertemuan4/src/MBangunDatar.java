public class MBangunDatar {
    public static void main(String[] args){
        //* * * TEST CLASS BANGUNDATAR * * */
        BangunDatar BD1 = new BangunDatar();
        BangunDatar BD2 = new BangunDatar(5, "lavender", "ungu");

        BD1.setJmlSisi(6);
        BD1.setWarna("beige");
        BD1.setBorder("coklat");

        BD1.printInfo();
        System.out.println(" ");
        BD2.printInfo();

        System.out.println("-----");
        //* * * TEST CLASS PERSEGI * * */
        Persegi P1 = new Persegi();
        Persegi P2 = new Persegi(5, "abu-abu", "hitam");

        P1.setSisi(3);
        P1.setWarna("biru");
        P1.setBorder("navy");

        P1.printInfo();
        System.out.println(" "); 
        P2.printInfo();

        double LuasP = P2.getLuas();
        System.out.println("Luas Persegi: " + LuasP);
        double KelilingP = P2.getKeliling();
        System.out.println("Keliling Persegi: " + KelilingP);
        double DiagonalP = P2.getDiagonal();
        System.out.println("Diagonal Persegi: " + DiagonalP);

        System.out.println("-----");
        //* * * TEST CLASS LINGKARAN * * */
        Lingkaran L1 = new Lingkaran();
        Lingkaran L2 = new Lingkaran(7, "pink", "merah");

        L1.setJari(14);
        L1.setWarna("hijau");
        L1.setBorder("lime");
        
        L1.printInfo();
        System.out.println(" ");
        L2.printInfo();

        double LuasL = L2.getLuas();
        System.out.println("Luas Lingkaran: " + LuasL);
        double KelilingL = L2.getKeliling();
        System.out.println("Keliling Lingkaran: " + KelilingL);

    }
}
