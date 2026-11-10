package unguided;

import java.util.Comparator;

public class WaktuTrainingComparator implements Comparator<ModelEksperimen> {
    @Override
    public int compare(ModelEksperimen m1, ModelEksperimen m2) {
        return Integer.compare(m1.getWaktuTraining(), m2.getWaktuTraining());
    }
}