package guided.gd3.iteration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listBuah = new ArrayList<>();

        // 2. Menambahkan elemen ke dalam List
        listBuah.add("Apel");
        listBuah.add("Mangga");
        listBuah.add("Jeruk");
        listBuah.add("Pisang");

         // 3. Operasi utilitas List
        System.out.println("Total Elemen: " + listBuah.size());
        
        System.out.println("Apakah ada 'Mangga'? " + listBuah.contains("Mangga"));

        // 4. menghapus data
        listBuah.remove("Pisang");

        // --- Teknik 1: For loop tradisional (indeks) ---
        System.out.println("\n--- 1. Normal For-Loop (Indeks) ---");
            for (int i = 0; i < listBuah.size(); i++) {
                System.out.println("Index " + i + ": " + listBuah.get(i));
        }

        // --- Teknik 2: Enhanced for-each loop ---
        System.out.println("\n--- 2. Enhanced For-Loop (For-Each) ---");
        for (String buah : listBuah) {
            System.out.println(buah);
        }

        // --- Teknik 3: Iterator Interface ---
        System.out.println("\n--- 3. Menggunakan Iterator ---");
        Iterator<String> itr = listBuah.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // --- Teknik 4: Lambda Expression (Java 8+) ---
        System.out.println("\n--- 4. Lambda Expression ---");
        listBuah.forEach(buah -> System.out.println(buah));

        // --- Teknik 5: Method Reference (Java 8+) ---
        System.out.println("\n--- 5. Method Reference ---");
        listBuah.forEach(System.out::println);
    }

}
