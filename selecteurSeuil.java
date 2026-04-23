// ===================== SELECTEUR SEUIL =====================

public class SelecteurSeuil extends SelecteurResultat {
    
    private double seuil;
    private String nomFichier;
    private String nomListe;
    
    public SelecteurSeuil(double seuil) {
        this.seuil = seuil;
    }
    
    @Override
    public List<ResultatMatch> selectionner() {
        List<ResultatMatch> resultats = new ArrayList<>();
        for (ResultatMatch r : tableauDesResultatsCompares) {
            if (r.getScore() >= seuil) {
                resultats.add(r);
            }
        }
        return resultats;
    }
    
    public double getSeuil() { return seuil; }
    public void setSeuil(double seuil) { this.seuil = seuil; }
    
    public String getNomFichier() { return nomFichier; }
    public String getNomListe() { return nomListe; }
    public double getScore() { return seuil; }
    public String getID() { return nomFichier + "_" + nomListe; }
}