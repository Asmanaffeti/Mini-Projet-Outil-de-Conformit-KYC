public class Nom {
        private String nomOriginal;
        private List<string> nomNormalise;

        public Nom(String nomComplet) {
            this.nomOriginal = nomComplet;
        }
        public int getNbMots() {
            int count = 0;
            boolean dansMot = false;
            for (int i = 0; i < nomOriginal.length(); i++) {
                char c = nomOriginal.charAt(i);

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

            for (int i = 0; i < nomOriginal.length(); i++) {
                if (nom_original.charAt(i) != ' ') {
                    longueur++;
                }
            }
            return longueur;
        }
        public String getPremierMot() {
            String resultat = "";
            int i = 0;
            while (i < nomOriginal.length() && nomOriginal.charAt(i) == ' ') {
                i++;
            }
            while (i < nomOriginal.length() && nomOriginal.charAt(i) != ' ') {
                resultat += nomOriginal.charAt(i);
                i++;
            }

            return resultat;
        }
        public String getDernierMot() {
            String resultat = "";
            int i = nomOriginal.length() - 1;
            while (i >= 0 && nomOriginal.charAt(i) == ' ') {
                i--;
            }
            while (i >= 0 && nomOriginal.charAt(i) != ' ') {
                resultat = nom_original.charAt(i) + resultat;
                i--;
            }

            return resultat;
        }
    }
}
