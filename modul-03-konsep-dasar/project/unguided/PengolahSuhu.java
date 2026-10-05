package unguided;

public class PengolahSuhu {
    private double[] suhuHarian;
    public static final double NILAI_KOSONG = -1.0;

    public PengolahSuhu(double[] suhuHarian) {
        this.suhuHarian = suhuHarian;
    }

    public void tampilkanData() {
        for (int i = 0; i < suhuHarian.length; i++) {
            if (suhuHarian[i] == NILAI_KOSONG) {
                System.out.println("Hari " + (i + 1) + " : (kosong)");
            } else {
                System.out.println("Hari " + (i + 1) + " : " + suhuHarian[i] + "°C");
            }
        }
    }

    public int cariIndexKosong() {
        for (int i = 0; i < suhuHarian.length; i++) {
            if (suhuHarian[i] == NILAI_KOSONG) {
                return i;
            }
        }
        return -1;
    }

    public void isiDataKosong() {
        int index = cariIndexKosong();
        if (index != -1 && index > 0 && index < suhuHarian.length - 1) {
            suhuHarian[index] = (suhuHarian[index - 1] + suhuHarian[index + 1]) / 2.0;
        }
    }

    public double hitungRataRata() {
        double total = 0;
        int count = 0;
        for (double suhu : suhuHarian) {
            if (suhu != NILAI_KOSONG) {
                total += suhu;
                count++;
            }
        }
        return count == 0 ? 0 : total / count;
    }
}
