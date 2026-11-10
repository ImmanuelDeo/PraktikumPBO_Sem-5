package unguided;

import java.util.Locale;

public class ModelEksperimen implements Comparable<ModelEksperimen> {
    private String namaModel;
    private double akurasi;
    private int waktuTraining;
    private static int jumlahEksperimen = 0;

    public ModelEksperimen(String namaModel, double akurasi, int waktuTraining) {
        this.namaModel = namaModel;
        this.akurasi = akurasi;
        this.waktuTraining = waktuTraining;
        jumlahEksperimen++;
    }

    public String getNamaModel() {
        return namaModel;
    }

    public double getAkurasi() {
        return akurasi;
    }

    public int getWaktuTraining() {
        return waktuTraining;
    }

    public static int getJumlahEksperimen() {
        return jumlahEksperimen;
    }

    @Override
    public int compareTo(ModelEksperimen other) {
        return Double.compare(other.akurasi, this.akurasi);
    }

    @Override
    public String toString() {
        return String.format(Locale.US, "Model=%s, akurasi=%.2f, waktu=%d detik", namaModel, akurasi, waktuTraining);
    }
}