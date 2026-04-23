// ===================== SELECTEUR TOP N =====================

public class SelecteurTopN extends SelecteurResultat {
    
    private int n;
    
    public SelecteurTopN(int n) {
        this.n = n;
    }
    
    @Override
    public List<ResultatMatch> selectionner() {
        // Trier par score décroissant et prendre les N premiers
        return tableauDesResultatsCompares.stream()
            .sorted((a, b) -> Double.compare(b.getScore(), a.getScore()))
            .limit(n)
            .collect(Collectors.toList());
    }
    
    public int getN() { return n; }
    public void setN(int n) { this.n = n; }
}