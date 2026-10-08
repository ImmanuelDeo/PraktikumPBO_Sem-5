package unguided.laporan;

import java.util.Locale;
import unguided.model.Dataset;

public class LaporanDataset {

    public void cetak(Dataset ds) {
        System.out.println("=== Laporan Dataset ===");
        System.out.println("Nama         : " + ds.getNama());
        System.out.println("Jumlah Baris : " + ds.getJumlahBaris());
        System.out.println("Jumlah Kolom : " + ds.getJumlahKolom());
        System.out.printf(Locale.US, "Missing      : %d sel (%.2f%%)%n", ds.getJumlahMissing(), ds.getPersentaseMissing());
        String status = ds.perluDibersihkan() ? "Perlu dibersihkan" : "Bersih";
        System.out.println("Status       : " + status);
    }
}
