package unguided;

public class RekapNilai {
    public static void main(String[] args) {
        final double KKM = 75.0;

        String[] namaMahasiswa = {"Andi", "Budi", "Citra"};
        double[][] nilaiModul = {
            {80.0, 85.0},
            {70.0, 65.0},
            {90.0, 90.0}
        };

        System.out.println("REKAP NILAI PRAKTIKUM");
        System.out.println("KKM: " + KKM);

        for (int i = 0; i < namaMahasiswa.length; i++) {
            double rataRata = (nilaiModul[i][0] + nilaiModul[i][1]) / 2;
            String status;

            if (rataRata >= KKM) {
                status = "LULUS";
            } else {
                status = "REMEDIAL";
            }

            System.out.println();
            System.out.println("Mahasiswa " + (i + 1) + ": " + namaMahasiswa[i]);
            System.out.println("Nilai Modul 1 : " + nilaiModul[i][0]);
            System.out.println("Nilai Modul 2 : " + nilaiModul[i][1]);
            System.out.println("Rata-rata     : " + rataRata);
            System.out.println("Status        : " + status);
        }
    }
}
