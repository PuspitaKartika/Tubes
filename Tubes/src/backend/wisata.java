package backend;

import database.Database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class wisata {
    public static void createWisata(String name, String description, int harga, int stock) {
        try {
            Database.openDb();

            String sql = "INSERT INTO wisata (name, description, harga, stock) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = Database.c.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, description);
            preparedStatement.setInt(3, harga);
            preparedStatement.setInt(4, stock);
            preparedStatement.executeUpdate();

            Database.closeDb();
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void getWisata() {
        try {
            Database.openDb();

            String sql = "SELECT * FROM wisata";
            ResultSet rs = Database.s.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                int harga = rs.getInt("harga");
                int stock = rs.getInt("stock");

                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Description: " + description);
                System.out.println("Harga: " + harga);
                System.out.println("Stock: " + stock);
                System.out.println("---------------------------");
            }

            Database.closeDb();
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void updateWisata(int id, String name, String description, int harga, int stock) {
        try {
            Database.openDb();

            String sql = "UPDATE wisata SET name = ?, description = ?, harga = ?, stock = ? WHERE id = ?";
            PreparedStatement preparedStatement = Database.c.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, description);
            preparedStatement.setInt(3, harga);
            preparedStatement.setInt(4, stock);
            preparedStatement.setInt(5, id);
            preparedStatement.executeUpdate();

            Database.closeDb();
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void deleteWisata(int id) {
        try {
            Database.openDb();

            String sql = "DELETE FROM wisata WHERE id = ?";
            PreparedStatement preparedStatement = Database.c.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();

            Database.closeDb();
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
