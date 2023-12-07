public class AkunPenggunaUAS {
    private String username;
    private boolean aktif;
    public void AkunPengguna(String username, String password) {
        this.username = username;
        this.aktif = true;
    }
    public void tampilkanInformasi() {
        System.out.println("Informasi Akun:");
        System.out.println("Username: " + username);
        System.out.println("Status: " + (aktif ? "Aktif" : "Nonaktif"));
    }
    public void aktifkanAkun() {
        aktif = true;
        System.out.println("Akun dengan username '" + username + "' telah diaktifkan.");
    }
    public void nonaktifkanAkun() {
        aktif = false;
        System.out.println("Akun dengan username '" + username + "' telah dinonaktifkan.");
    }
    public static void main(String[] args) {
        AkunPengguna akun1 = new AkunPengguna("Vika127", "127127127");
        AkunPengguna akun2 = new AkunPengguna("Pratiwi17", "17711177");
        AkunPengguna akun3 = new AkunPengguna("VP143", "143341143");
        AkunPengguna akun4 = new AkunPengguna("V12", "12121212");

        akun1.nonaktifkanAkun();
        akun2.aktifkanAkun();
        akun3.aktifkanAkun();
        akun4.nonaktifkanAkun();

        akun1.tampilkanInformasi();
        akun2.tampilkanInformasi();
        akun3.tampilkanInformasi();
        akun4.tampilkanInformasi();
    }
}