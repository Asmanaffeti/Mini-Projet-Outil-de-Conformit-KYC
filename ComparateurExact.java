public class ComparateurExact extends ResponsableComparaison {
    @Override
    public double comparer(Nom nom1, Nom nom2) {
        return nom1.getNomNormalise().equals(nom2.getNomNormalise()) ? 1.0 : 0.0;
    }
}
