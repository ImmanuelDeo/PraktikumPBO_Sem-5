package unguided;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<ModelEksperimen> daftarModel = new ArrayList<>();
        daftarModel.add(new ModelEksperimen("Logistic Regression", 0.82, 12));
        daftarModel.add(new ModelEksperimen("Random Forest", 0.91, 45));
        daftarModel.add(new ModelEksperimen("SVM", 0.87, 60));
        daftarModel.add(new ModelEksperimen("KNN", 0.79, 5));
        daftarModel.add(new ModelEksperimen("Decision Tree", 0.84, 8));

        System.out.println("Jumlah eksperimen: " + ModelEksperimen.getJumlahEksperimen());
        System.out.println();

        System.out.println("Sorted by akurasi");
        Collections.sort(daftarModel);
        daftarModel.forEach(System.out::println);
        System.out.println();

        System.out.println("Sorted by waktu training");
        Collections.sort(daftarModel, new WaktuTrainingComparator());
        daftarModel.forEach(System.out::println);
        System.out.println();

        System.out.println("Model dengan akurasi minimal 0.85");
        List<ModelEksperimen> filterAkurasi = daftarModel.stream()
                .filter(m -> m.getAkurasi() >= 0.85)
                .collect(Collectors.toList());
        filterAkurasi.forEach(System.out::println);
        System.out.println();

        System.out.println("Pencarian model KNN");
        ModelEksperimen knn = daftarModel.stream()
                .filter(m -> m.getNamaModel().equals("KNN"))
                .findFirst()
                .orElse(null);
        System.out.println(knn);
    }
}