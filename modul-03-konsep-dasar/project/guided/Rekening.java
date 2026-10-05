package guided;

public class Rekening {
    private int saldo = 0;

    public void tambahSaldo(int jumlah) {
        saldo += jumlah;
        System.out.println("Saldo berhasil ditambahkan: " + saldo);
    }

    public void tampilkanSaldo() {
        System.out.println("Saldo saat ini: " + saldo);
    }
}
