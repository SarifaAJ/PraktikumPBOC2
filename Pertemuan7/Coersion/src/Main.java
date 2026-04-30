/* Nama File    : Main.java 
 * Deskripsi    : berisi tentang poliformisme ad hoc coersion
 * Pembuat      : Sarifa Nuha Ardanti Jusmar
 * Tanggal      : 30 April 2026
 */

public class Main {
    public static void main(String[] args) {
        //integer
        int nilai = 65;
        System.out.println(nilai);

        //int to char
        char character = (char) nilai;
        System.out.println(character);

        //int to real
        double real = (double) nilai;
        System.out.println(real);

        /* B */
        //real to int
        int integer = (int) real;
        System.out.println(integer);

        /* C */
        //konkatenasi String X dan Y
        String X = "1234";
        String Y = "5678";

        String S = X + Y;
        System.out.println("Konkatenasi X dan Y: " + S);
        
        //string to int, lalu ditambah
        int X_int = Integer.parseInt(X);
        int Y_int = Integer.parseInt(Y);
        int Z = X_int + Y_int;
        System.out.println("Penjumlahan X dan Y: " + Z);
        
        /* D */
        //konkatenasi String X dan Y
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;
        System.out.println("Konkatenasi P dan Q: " + R);

        //string to int, lalu ditambah
        double P_real = Double.parseDouble(P);
        double Q_real = Double.parseDouble(Q);
        double D = P_real + Q_real;
        System.out.println("Penjumlahan P dan Q: " + D);
    }
}
