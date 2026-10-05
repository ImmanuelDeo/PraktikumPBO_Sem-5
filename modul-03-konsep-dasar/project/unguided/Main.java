package unguided;

import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        double[] suhuHarian = { 30.4, 24.3, 26.8, -1.0, 31.4, 30.8, 32.9 };

        PengolahSuhu pengolah = new PengolahSuhu(suhuHarian);

        System.out.println("=== Data Suhu Awal ===");
        pengolah.tampilkanData();

        System.out.println();
        int indexKosong = pengolah.cariIndexKosong();
        System.out.println("Index hari kosong (dimulai dari 0): " + indexKosong);

        pengolah.isiDataKosong();

        System.out.println();
        System.out.println("=== Data Suhu Setelah Pengisian ===");
        pengolah.tampilkanData();

        System.out.println();
        System.out.println("Rata-rata : " + String.format(Locale.US, "%.2f", pengolah.hitungRataRata()) + "°C");

        System.out.println();
        System.out.println("Isi array suhuHarian di main setelah isiDataKosong() dijalankan:");
        System.out.println(Arrays.toString(suhuHarian));

        /*
         * Penjelasan Reference:
         * Array suhuHarian bertipe reference. Saat dilewatkan ke constructor PengolahSuhu,
         * constructor menyimpan referensi ke alamat memori array yang sama.
         * Oleh karena itu, perubahan elemen array di dalam method isiDataKosong()
         * langsung berdampak pada variabel suhuHarian di method main.
         */
    }
}
