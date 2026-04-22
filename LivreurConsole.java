import java.util.List;

public class LivreurConsole extends LivreurResultat {

    public void livrer(List<ResultatMatch> resultats) {

        if (resultats == null || resultats.isEmpty()) {
            System.out.println("Aucun match trouvé");
            return;
        }

        for (ResultatMatch r : resultats) {
            System.out.println(r.toString());
        }

        System.out.println("Total: " + resultats.size());
    }
}
