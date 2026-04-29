public class GénérateurTousLesCouples extends GénérateurDesCouples {
    public GénérateurTousLesCouples() {
    }

    
    
      public CoupleDeNom[] generer(Nom[] tableau, Nom[] tableauDesNom) {
        if (tableau == null || tableauDesNom == null) {
            return new CoupleDeNom[0];
        }

        int taille = tableau.length * tableauDesNom.length;
        CoupleDeNom[] resultat = new CoupleDeNom[taille];

        int index = 0;
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableauDesNom.length; j++) {
                resultat[index] = new CoupleDeNom(tableau[i], tableauDesNom[j]);
                index++;
            }
        }

        return resultat;
    }

}
