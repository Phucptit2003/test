package connection;

import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseConnection {

    private static DatabaseConnection instance;
    private Connection connection;

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    private DatabaseConnection() {

    }

 public void connectToDatabase() throws SQLException {
    String server = "localhost"; // XAMPP usually runs MySQL on localhost
    String port = "3306"; // Default MySQL port
    String database = "chat_application"; // Name of your database in XAMPP
    String userName = "root"; // Default XAMPP MySQL username is 'root'
    String password = ""; // Default XAMPP MySQL password is empty
    connection = java.sql.DriverManager.getConnection("jdbc:mysql://" + server + ":" + port + "/" + database, userName, password);
}


    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
