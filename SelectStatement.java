public class SelectStatement {

    protected String select;
    protected String from;
    protected String where;
    protected String attrslist;

    public SelectStatement () {
        this.select = null;
        this.from = null;
        this.where = null;
        this.attrslist = null;
    }
    
    public SelectStatement (String select, String from, String where) {
        this.select = select;
        this.from = from;
        this.where = where;
    }
    
}