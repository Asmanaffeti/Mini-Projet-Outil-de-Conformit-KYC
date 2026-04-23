// ===================== CLASSE ABSTRAITE DE BASE =====================

public abstract class SelecteurResultat {
    
    protected List<ResultatMatch> tableauDesResultatsCompares;
    
    public abstract List<ResultatMatch> selectionner();
    
    public List<ResultatMatch> getTableauDesResultatsCompares() {
        return tableauDesResultatsCompares;
    }
    
    public void setTableauDesResultatsCompares(List<ResultatMatch> tableau) {
        this.tableauDesResultatsCompares = tableau;
    }
}