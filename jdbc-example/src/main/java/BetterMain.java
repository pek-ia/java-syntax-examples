import java.sql.*;

public class BetterMain {


    public static void main(String[] args) {

        // We will need a Connection, a Statement, and a ResultSet
        // NOTE: These are all INTERFACES

        Statement statement;
        ResultSet resultSet;

        // The JDBC driver classes are specific to a particular database
        // This class will be pulled from Maven Central when maven compiles our code

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        // Each database has its own form of URL and credentials
        // This is the right way to connect to a MySql database on the default port 3306
        try (Connection connection =
                     DriverManager.getConnection(
                             "jdbc:mysql://localhost:3306/sakila", "poweruser", "poweruser")) {

            // Finally, we can create a statement.  But it doesn't have any SQL yet...
            statement = connection.createStatement();

            // Execute some SQL
            resultSet = statement.executeQuery("SELECT * FROM category");

            // AT LAST:  Loop through the result set and print out the answers!
            while (resultSet.next()) {

                String s1 = resultSet.getString("category_id");
                String s2 = resultSet.getString("name");
                System.out.println(s1 + " " + s2);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
