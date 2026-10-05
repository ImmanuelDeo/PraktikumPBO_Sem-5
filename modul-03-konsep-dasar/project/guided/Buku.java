package guided;

public class Buku {
    private String pengarang;
    private String judul;

    private Buku() {
        this("Rumah Kita", "GoodBles");
    }

    private Buku(String judul, String pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }

    private void cetakKeLayar() {
        System.out.println("Judul : " + judul + " Pengarang : " + pengarang);
    }

    public static void main(String[] args) {
        Buku a = new Buku("Jurassic Park", "Michael Chricton");
        Buku b = new Buku();
        a.cetakKeLayar();
        b.cetakKeLayar();
    }
}
