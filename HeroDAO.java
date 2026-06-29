   import java.sql.*;

public class HeroDAO {

    // READ
    public void ambilSemuaHero() {

        String sql = "SELECT * FROM hero";

        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("nama") + " | " +
                        rs.getInt("level"));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    // UPDATE
    public void updateLevel(int id_target, int level_baru) {

        String sql = "UPDATE hero SET level = ? WHERE id = ?";

        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {

            pst.setInt(1, level_baru);
            pst.setInt(2, id_target);

            int hasil = pst.executeUpdate();

            if (hasil > 0) {
                System.out.println("Update berhasil.");
            } else {
                System.out.println("Hero tidak ditemukan.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    // DELETE
    public void hapusHero(int id_target) {

        String sql = "DELETE FROM hero WHERE id = ?";

        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {

            pst.setInt(1, id_target);

            int hasil = pst.executeUpdate();

            if (hasil > 0) {
                System.out.println("Hero berhasil dihapus.");
            } else {
                System.out.println("Hero tidak ditemukan.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}

