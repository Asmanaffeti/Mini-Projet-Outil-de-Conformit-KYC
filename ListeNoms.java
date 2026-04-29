public class ListeNoms {
    private Nom nom;
    private List<Nom> listeNoms;
    private LocalDate dateChargement;
    public ListeNoms() {
        this.listeNoms = new ArrayList<>();
        this.dateChargement = LocalDate.now();
    }
    public ListeNoms(Nom nom) {
        this();
        this.nom = nom;
    }

    public void remplirListe(Nom nom) {
        listeNoms.add(nom);
    }
    public int getID(Nom nom) {
        return listeNoms.indexOf(nom);
    }
    public Nom getNom() {
        return nom;
    }
    public void setNom(Nom nom) {
        this.nom = nom;
    }
    public List<Nom> getListeNoms() {
        return listeNoms;
    }
    public void setListeNoms(List<Nom> listeNoms) {
        this.listeNoms = listeNoms;
    }
    public LocalDate getDateChargement() {
        return dateChargement;
    }
    public void setDateChargement(LocalDate dateChargement) {
        this.dateChargement = dateChargement;
    }

}