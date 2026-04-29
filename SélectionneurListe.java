public abstract class SélectionneurListe {
    protected String nomFichier;
    protected int nbrFichier;
    public SélectionneurListe() {
        this.nbrFichier = 0;
    }
    public SélectionneurListe(String nomFichier) {
        this.nomFichier = nomFichier;
        this.nbrFichier = 0;
    }
    public void charger(String nomFichier) {
        this.nomFichier = nomFichier;
        this.nbrFichier++;
    }
    public String getNomFichier() {
        return nomFichier;
    }
    public void setNomFichier(String nomFichier) {
        this.nomFichier = nomFichier;
    }

    public int getNbrFichier() {
        return nbrFichier;
    }

    public void setNbrFichier(int nbrFichier) {
        this.nbrFichier = nbrFichier;
    }



