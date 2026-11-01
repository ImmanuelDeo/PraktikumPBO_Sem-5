package unguided;

public class Main {
    public static void main(String[] args) {
        // Uji Proteksi Abstraksi: Kelas abstrak tidak dapat diinstansiasi secara langsung
        // TiketBioskop tiket = new TiketBioskop("Avatar", 50000, 2);

        // Buka Kasir melalui static method interface
        ItemTransaksi.catatLogKasir("Membuka transaksi baru untuk Pelanggan #042.");

        // Buat Objek Transaksi
        TiketReguler tiketReguler = new TiketReguler("Interstellar", 40000, 2, 3);
        TiketVIP tiketVIP = new TiketVIP("Dune: Part Two", 60000, 2, 25000);
        PaketSnack paketSnack = new PaketSnack("Combo Popcorn Caramel + 2 Soda", 1, 55000);

        // Simpan ke Array Polimorfik Heterogen bertipe ItemTransaksi[]
        ItemTransaksi[] daftarTransaksi = new ItemTransaksi[3];
        daftarTransaksi[0] = tiketReguler;
        daftarTransaksi[1] = tiketVIP;
        daftarTransaksi[2] = paketSnack;

        // Pemrosesan Dinamis (Loop)
        System.out.println("=== DAFTAR TRANSAKSI BIOSKOP ===");
        double totalTransaksi = 0.0;
        for (ItemTransaksi item : daftarTransaksi) {
            item.cetakRincianItem();
            totalTransaksi += item.getNominalBayar();
        }

        System.out.println("-------------------------------------------------------------");
        System.out.println("TOTAL TRANSAKSI : Rp" + totalTransaksi);
        System.out.println("=============================================================");

        // Tutup Kasir melalui static method interface
        ItemTransaksi.catatLogKasir("Transaksi #042 selesai diproses.");
    }
}
