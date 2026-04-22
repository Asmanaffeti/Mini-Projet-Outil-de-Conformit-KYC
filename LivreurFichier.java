import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class LivreurFichier extends LivreurResultat {

    private String cheminFichier;

    public LivreurFichier(String cheminFichier) {
        this.cheminFichier = cheminFichier;
    }

    public void livrer(List<ResultatMatch> resultats) {

        try (FileWriter writer = new FileWriter(cheminFichier)) {

            if (resultats == null || resultats.isEmpty()) {
                writer.write("Aucun match trouvé\n");
                return;
            }

            int i = 1;
            for (ResultatMatch r : resultats) {
                writer.write(i++ + ". ");
                writer.write(r.getNomOriginal() + " - " + r.getNomMatch());
                writer.write(" - " + r.getFichierSource());
                writer.write(" - " + r.getScore() + "\n");
            }

            writer.write("Total: " + resultats.size());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
