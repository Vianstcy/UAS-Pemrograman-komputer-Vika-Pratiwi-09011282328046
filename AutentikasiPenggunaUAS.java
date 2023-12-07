import java.util.Scanner;
public class AutentikasiPenggunaUAS {
    public static void main(String[] args) {
        String username1 = "Vika127";
        String password1 = "127127127";
        String username2 = "Pratiwi17";
        String password2 = "17711177";
        String username3 = "VP143";
        String password3 = "143341143";
        String username4 = "V12";
        String password4 = "12121212";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String inputPassword = scanner.nextLine();

        if ((inputUsername.equals(username1) && inputPassword.equals(password1)) ||
            (inputUsername.equals(username2) && inputPassword.equals(password2)) ||
            (inputUsername.equals(username3) && inputPassword.equals(password3)) ||
            (inputUsername.equals(username4) && inputPassword.equals(password4))) {
            System.out.println("Autentikasi Berhasil");
        } else {
            System.out.println("Autentikasi Gagal");
        }
        scanner.close();
    }
}