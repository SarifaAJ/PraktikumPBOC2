/*  File: LambdaMap.java
    Deskripsi: Implementasi lambda pada Map, digunakan sebagai parameter pada method
    NIM: 24060124130082 
 */

import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {

        Map<String, String> mahasiswaMap = new HashMap<>();

        mahasiswaMap.put("12121", "Shinichi");
        mahasiswaMap.put("21212", "Heiji");
        mahasiswaMap.put("13131", "Kaito");
        mahasiswaMap.put("31313", "Hakuba");

        // Lambda digunakan sebagai parameter
        mahasiswaMap.forEach((nim, nama) ->
                System.out.println("NIM : " + nim + ", Nama : " + nama));
    }
}