public class SelectStatement {

    protected String select;
    protected String from;
    protected String where;

    public SelectStatement () {
        this.select = null;
        this.from = null;
        this.where = null;
    }
    
    public SelectStatement (String select, String from, String where) {
        this.select = select;
        this.from = from;
        this.where = where;
    }
    
}