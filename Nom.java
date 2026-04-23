public class Nom {
        private String nom_original;

        public Nom(String nomComplet) {
            this.nom_original = nomComplet;
        }
        public int getNbMots() {
            int count = 0;
            boolean dansMot = false;
            for (int i = 0; i < nom_original.length(); i++) {
                char c = nom_original.charAt(i);

                if (c != ' ') {
                    if (!dansMot) {
                        count++;
                        dansMot = true;
                    }
                } else {
                    dansMot = false;
                }
            }
            return count;
        }
        public int getLongueurTotal() {
            int longueur = 0;

            for (int i = 0; i < nom_original.length(); i++) {
                if (nom_original.charAt(i) != ' ') {
                    longueur++;
                }
            }
            return longueur;
        }
        public String getPremierMot() {
            String resultat = "";
            int i = 0;
            while (i < nom_original.length() && nom_original.charAt(i) == ' ') {
                i++;
            }
            while (i < nom_original.length() && nom_original.charAt(i) != ' ') {
                resultat += nom_original.charAt(i);
                i++;
            }

            return resultat;
        }
        public String getDernierMot() {
            String resultat = "";
            int i = nom_original.length() - 1;
            while (i >= 0 && nom_original.charAt(i) == ' ') {
                i--;
            }
            while (i >= 0 && nom_original.charAt(i) != ' ') {
                resultat = nom_original.charAt(i) + resultat;
                i--;
            }

            return resultat;
        }
    }
}
