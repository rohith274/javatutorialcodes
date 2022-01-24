import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

class JdbcDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/employees_database";
        try {
            // Establish Cnnection Object
            Connection conn = DriverManager.getConnection(url, "root", "rootroot");
            // Create a statement object to send to the database
            java.sql.Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM emplyees_tbl");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
                ;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}