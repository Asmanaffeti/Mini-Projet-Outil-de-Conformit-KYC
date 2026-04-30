import java.util.HashMap;
import java.util.Map;

public class ComparateurFrequenceMots extends ResponsableComparaison {
    public double comparer(Nom nom1, Nom nom2) {
        String[] words1 = nom1.getNomNormalise().split("\\s+");
        String[] words2 = nom2.getNomNormalise().split("\\s+");

        Map<String, Integer> freq1 = new HashMap<>();
        Map<String, Integer> freq2 = new HashMap<>();

        for (String w : words1)
            if (!w.isEmpty())
                freq1.put(w, freq1.getOrDefault(w, 0) + 1);
        for (String w : words2)
            if (!w.isEmpty())
                freq2.put(w, freq2.getOrDefault(w, 0) + 1);

        double dotProduct = 0.0;
        double norm1 = 0.0;
        double norm2 = 0.0;

        for (String key : freq1.keySet()) {
            int f1 = freq1.get(key);
            int f2 = freq2.getOrDefault(key, 0);
            dotProduct += f1 * f2;
            norm1 += f1 * f1;
        }

        for (int f : freq2.values()) {
            norm2 += f * f;
        }

        if (norm1 == 0 || norm2 == 0)
            return 0.0;
        return dotProduct / (Math.sqrt(norm1) * Math.sqrt(norm2));
    }
}
