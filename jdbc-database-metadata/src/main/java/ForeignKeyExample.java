import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ForeignKeyExample {

    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/baibai_petspa";
        String username = "superuser";
        String password = "superuser";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            DatabaseMetaData metaData = connection.getMetaData();

            // Specify the catalog, schema, table name, and column name for the foreign key
            String catalog = null;
            String schema = null;
            String tableName = "pet";
            String columnName = "owner_id";

            // Get foreign key information
            ResultSet foreignKeys = metaData.getImportedKeys(catalog, schema, tableName);

            while (foreignKeys.next()) {
                String fkTableName = foreignKeys.getString("FKTABLE_NAME");
                String fkColumnName = foreignKeys.getString("FKCOLUMN_NAME");
                String pkTableName = foreignKeys.getString("PKTABLE_NAME");
                String pkColumnName = foreignKeys.getString("PKCOLUMN_NAME");

                System.out.println("Foreign Key found in table `" + fkTableName + "`, column `" + fkColumnName + "`");
                System.out.println("   which references table `" + pkTableName + "`, column `" + fkColumnName + "`");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
