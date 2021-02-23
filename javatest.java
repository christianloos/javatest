
class javatest{  
    public static void main(String args[]){  
    //System.out.println("Hello Java");  
    }  

    private static Connection getConnection() throws URISyntaxException, SQLException {
    String dbUrl = System.getenv("JDBC_DATABASE_URL");
    return DriverManager.getConnection(dbUrl);
}
}  