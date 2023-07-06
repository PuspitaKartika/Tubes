package backend;
import database.Database;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class transaksi {
    public static void createTransaksi(int idUser, int idWisata, int idStatus, String namaPembeli, int qty, int totalHarga, String noHp) {
        try {
            Database.openDb();

            String sql = "INSERT INTO transaksi (id_user, id_wisata, id_status, nama_pembeli, qty, total_harga, no_hp) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = Database.c.prepareStatement(sql);
            preparedStatement.setInt(1, idUser);
            preparedStatement.setInt(2, idWisata);
            preparedStatement.setInt(3, idStatus);
            preparedStatement.setString(4, namaPembeli);
            preparedStatement.setInt(5, qty);
            preparedStatement.setInt(6, totalHarga);
            preparedStatement.setString(7, noHp);
            preparedStatement.executeUpdate();

            Database.closeDb();
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void getTransaksi() {
        try {
            Database.openDb();

            String sql = "SELECT * FROM transaksi";
            ResultSet rs = Database.s.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id");
                int idUser = rs.getInt("id_user");
                int idWisata = rs.getInt("id_wisata");
                int idStatus = rs.getInt("id_status");
                String namaPembeli = rs.getString("nama_pembeli");
                int qty = rs.getInt("qty");
                int totalHarga = rs.getInt("total_harga");
                String noHp = rs.getString("no_hp");

                System.out.println("ID: " + id);
                System.out.println("ID User: " + idUser);
                System.out.println("ID Wisata: " + idWisata);
                System.out.println("ID Status: " + idStatus);
                System.out.println("Nama Pembeli: " + namaPembeli);
                System.out.println("Qty: " + qty);
                System.out.println("Total Harga: " + totalHarga);
                System.out.println("No HP: " + noHp);
                System.out.println("---------------------------");
            }

            Database.closeDb();
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void updateTransaksi(int id, int idStatus) {
        try {
            Database.openDb();

            String sql = "UPDATE transaksi SET id_status = ? WHERE id = ?";
            PreparedStatement preparedStatement = Database.c.prepareStatement(sql);
            preparedStatement.setInt(1, idStatus);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();

            Database.closeDb();
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void deleteTransaksi(int id) {
        try {
            Database.openDb();

            String sql = "DELETE FROM transaksi WHERE id = ?";
            PreparedStatement preparedStatement = Database.c.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();

            Database.closeDb();
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
