package Builder;

public class Query {
    
    private String query;
    private String select;
    private String tableName;
    private String where;
    private String groupBy;

    public void setQuery(String query){
        this.query = query;
    }

    public String getQuery(){
        return this.query;
    }

    public void setSelect(String select){
        this.select = select;
    }

    public void setTableName(String tableName){
        this.tableName = tableName;
    }

    public void setWhere(String where){
        this.where = where;
    }

    public void setGroupBy(String groupBy){
        this.groupBy = groupBy;
    }
}
