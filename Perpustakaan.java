public class Perpustakaan {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean tersedia;
    public Perpustakaan(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.tersedia = true;
    }

    public void tampilkanInformasi() {
        System.out.println("Informasi Buku:");
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Status: " + (tersedia ? "Tersedia" : "Sedang Dipinjam"));
    }

    public void pinjamBuku() {
        if (tersedia) {
            tersedia = false;
            System.out.println("Buku dengan judul '" + judul + "' sedang dipinjam.");
        } else {
            System.out.println("Buku dengan judul '" + judul + "' sedang tidak tersedia.");
        }
    }

    public static void main(String[] args) {
        Perpustakaan buku1 = new Perpustakaan("It's a small star, but it's shining", "Soyoon", 2021);
        Perpustakaan buku2 = new Perpustakaan("Charlie and the Chocolate Factory", "Roald Dahl", 1964);
        Perpustakaan buku3 = new Perpustakaan("Winter in Tokyo", "Ilana Tan", 2008);
        Perpustakaan buku4 = new Perpustakaan("It Ends with Us", "Colleen Hoover", 2016);

        buku1.tampilkanInformasi();
        buku2.tampilkanInformasi();
        buku3.tampilkanInformasi();
        buku4.tampilkanInformasi();

        buku1.pinjamBuku();
        buku4.pinjamBuku();

        buku1.tampilkanInformasi();
        buku2.tampilkanInformasi();
        buku3.tampilkanInformasi();
        buku4.tampilkanInformasi();
    }
}