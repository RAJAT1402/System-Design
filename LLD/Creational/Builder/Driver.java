package Builder;

public class Driver {
    public static void main(String[] args) {
        
        Query query = new Query();

        // 1.
        query.setSelect("Select x,y,z");
        query.setWhere("where x = 10");

        // 2. 
        query.setQuery("Select x,y,z where x = 10 from tablename");


        QueryBuilder qb = new QueryBuilder();

        Query query1 = qb.setSelect("x, y, z")
                        .setTableName("table")
                        .setWhere("x = 10")
                        .build();

        System.out.println(query1.getQuery());
    }
}
