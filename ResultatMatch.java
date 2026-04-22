public class ResultatMatch {

    private String nomOriginal;
    private String nomMatch;
    private String fichierSource;
    private double score;
    private String dateGeneration;

    public ResultatMatch(String nomOriginal, String nomMatch, String fichierSource, double score, String dateGeneration) {
        this.nomOriginal = nomOriginal;
        this.nomMatch = nomMatch;
        this.fichierSource = fichierSource;
        this.score = score;
        this.dateGeneration = dateGeneration;
    }

    public String getNomOriginal() {
        return nomOriginal;
    }

    public String getNomMatch() {
        return nomMatch;
    }

    public String getFichierSource() {
        return fichierSource;
    }

    public double getScore() {
        return score;
    }

    public String getDateGeneration() {
        return dateGeneration;
    }

    public String toString() {
        return "ResultatMatch{" +
                "nomOriginal='" + nomOriginal + '\'' +
                ", nomMatch='" + nomMatch + '\'' +
                ", fichierSource='" + fichierSource + '\'' +
                ", score=" + score +
                ", dateGeneration='" + dateGeneration + '\'' +
                '}';
    }
}
