 public class MainApp {

    public static void main(String[] args) {

        HeroDAO dao = new HeroDAO();

        System.out.println("===== DATA AWAL =====");
        dao.ambilSemuaHero();

        System.out.println("\n===== UPDATE =====");
        dao.updateLevel(1, 100);

        System.out.println("\n===== DELETE =====");
        dao.hapusHero(2);

        System.out.println("\n===== DATA TERBARU =====");
        dao.ambilSemuaHero();

    }

}
