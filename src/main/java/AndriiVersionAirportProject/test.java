package AndriiVersionAirportProject;

import java.sql.*;
public class test {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/";
        String user = "postgres";
        String password = "ait77";

        try {
            // Attempt to create the "airplane" database if it doesn't exist
            try (Connection connectionForCreation = DriverManager.getConnection("jdbc:postgresql://localhost:5432/", user, password);
                 Statement statementForCreation = connectionForCreation.createStatement()) {
                statementForCreation.execute("CREATE DATABASE IF NOT EXISTS airplane");
            }

            // Connect to the "airplane" database
            try (Connection connection = DriverManager.getConnection(url, user, password)) {
                String sql = "SELECT * FROM airplane;";
                try (PreparedStatement statement = connection.prepareStatement(sql);
                     ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        // Process the result set
                        int id = resultSet.getInt("airplane_uid"); // Adjust column name
                        String type = resultSet.getString("TypeOfAirplane"); // Adjust column name
                        System.out.println("ID: " + id + ", Type of Airplane: " + type);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

