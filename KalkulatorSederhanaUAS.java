import java.util.Scanner;
public class KalkulatorSederhanaUAS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bilangan pertama: ");
        double bilangan1 = scanner.nextDouble();
        System.out.print("Bilangan kedua: ");
        double bilangan2 = scanner.nextDouble();

        System.out.println("Pilih operasi:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("Masukkan nomor operasi (1-4): ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                penjumlahan(bilangan1, bilangan2);
                break;
            case 2:
                pengurangan(bilangan1, bilangan2);
                break;
            case 3:
                perkalian(bilangan1, bilangan2);
                break;
            case 4:
                pembagian(bilangan1, bilangan2);
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
        scanner.close();
    }
    public static void penjumlahan(double a, double b) {
        double hasil = a + b;
        System.out.println("Hasil penjumlahan: " + hasil);
    }
    public static void pengurangan(double a, double b) {
        double hasil = a - b;
        System.out.println("Hasil pengurangan: " + hasil);
    }
    public static void perkalian(double a, double b) {
        double hasil = a * b;
        System.out.println("Hasil perkalian: " + hasil);
    }
    public static void pembagian(double a, double b) {
        if (b != 0) {
            double hasil = a / b;
            System.out.println("Hasil pembagian: " + hasil);
        } else {
            System.out.println("Error: Pembagian dengan nol tidak dapat dilakukan");
        }
    }
}