package Builder;

import java.util.Objects;

public class QueryBuilder {
    
    private String query;
    private String select;
    private String tableName;
    private String where;
    private String groupBy;

    public QueryBuilder setQuery(String query){
        this.query = query;
        return this;
    }

    public QueryBuilder setSelect(String select){
        this.select = select;
        return this;
    }

    public QueryBuilder setTableName(String tableName){
        this.tableName = tableName;
        return this;
    }

    public QueryBuilder setWhere(String where){
        this.where = where;
        return this;
    }

    public QueryBuilder setGroupBy(String groupBy){
        this.groupBy = groupBy;
        return this;
    }

    public Query build(){
        if(Objects.isNull(this.select)){
            throw new IllegalArgumentException("Select cannot be empty");
        }

        if(Objects.isNull(this.where)){
            throw new IllegalArgumentException("where cannot be empty");
        }

        if(Objects.isNull(this.tableName)){
            throw new IllegalArgumentException("tableName cannot be empty");
        }

        StringBuilder sb = new StringBuilder();

        String query = sb.append("Select " + this.select)
                        .append(" from " + this.tableName)
                        .append(" where " + this.where + ";")
                        .toString();

        Query query1 = new Query();
        query1.setQuery(query);

        return query1;
    }
}
