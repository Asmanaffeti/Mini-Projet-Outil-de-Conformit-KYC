// ===================== SELECTEUR POURCENTAGE =====================

public class SelecteurPourcentage extends SelecteurResultat {
    
    private double pourcentage; // ex: 0.10 pour les 10% meilleurs
    
    public SelecteurPourcentage(double pourcentage) {
        this.pourcentage = pourcentage;
    }
    
    @Override
    public List<ResultatMatch> selectionner() {
        int nbAGarder = (int) Math.ceil(tableauDesResultatsCompares.size() * pourcentage);
        return tableauDesResultatsCompares.stream()
            .sorted((a, b) -> Double.compare(b.getScore(), a.getScore()))
            .limit(nbAGarder)
            .collect(Collectors.toList());
    }
    
    public double getPourcentage() { return pourcentage; }
    public void setPourcentage(double pourcentage) { this.pourcentage = pourcentage; }
}