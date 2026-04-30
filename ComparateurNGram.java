import java.util.HashSet;
import java.util.Set;

public class ComparateurNGram extends ResponsableComparaison {
    private int n;

    public ComparateurNGram(int n) {
        this.n = n;
    }

    public double comparer(Nom nom1, Nom nom2) {
        String s1 = nom1.getNomNormalise();
        String s2 = nom2.getNomNormalise();

        Set<String> ngrams1 = getNGrams(s1, n);
        Set<String> ngrams2 = getNGrams(s2, n);

        Set<String> intersection = new HashSet<>(ngrams1);
        intersection.retainAll(ngrams2);

        Set<String> union = new HashSet<>(ngrams1);
        union.addAll(ngrams2);

        if (union.isEmpty())
            return 0.0;
        return (double) intersection.size() / union.size();
    }

    private Set<String> getNGrams(String s, int n) {
        Set<String> ngrams = new HashSet<>();
        for (int i = 0; i <= s.length() - n; i++) {
            ngrams.add(s.substring(i, i + n));
        }
        return ngrams;
    }
}
