package sql.grader.cs.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/grader_db";

    public static Connection getConnection(String user, String password) throws SQLException {
        return DriverManager.getConnection(DB_URL, user, password);
    }
}

