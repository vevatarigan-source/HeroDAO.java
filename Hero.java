public class Hero {

    private int id;
    private String nama;
    private int level;

    public Hero(int id, String nama, int level) {
        this.id = id;
        this.nama = nama;
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}

