public class GénérateurCouplesOntDesCelabeComun extends GénérateurDesCouples {

    public GénérateurCouplesOntDesCelabeComun() {
    }
public CoupleDeNom[] generer(Nom[] tableau, Nom[] tableauDesNom) {
        if (tableau == null || tableauDesNom == null) {
            return new CoupleDeNom[0];
        }

        int compteur = 0;
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableauDesNom.length; j++) {
                if (tableau[i].getCelabe().equals(tableauDesNom[j].getCelabe())) {
                    compteur++;
                }
            }
        }

        CoupleDeNom[] resultat = new CoupleDeNom[compteur];
        int index = 0;
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableauDesNom.length; j++) {
                if (tableau[i].getCelabe().equals(tableauDesNom[j].getCelabe())) {
                    resultat[index] = new CoupleDeNom(tableau[i], tableauDesNom[j]);
                    index++;
                }
            }
        }

        return resultat;
    }
}