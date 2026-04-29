import java.util.ArrayList;
import java.util.List;

public class GénérateurTousLesCouples extends GénérateurDesCouples {

    public GénérateurTousLesCouples() {
    }

    public List<CoupleDeNom> generer(List<Nom> liste, List<Nom> listeDesNoms) {
        if (liste == null || listeDesNoms == null) {
            return new ArrayList<>();
        }

        List<CoupleDeNom> resultat = new ArrayList<>();

        for (int i = 0; i < liste.size(); i++) {
            for (int j = 0; j < listeDesNoms.size(); j++) {
                resultat.add(new CoupleDeNom(liste.get(i), listeDesNoms.get(j)));
            }
        }

        return resultat;
    }
}