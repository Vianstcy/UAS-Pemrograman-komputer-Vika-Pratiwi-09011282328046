import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class PelangganTokOnlineUAS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah barang yang dibeli oleh pelanggan: ");
        int jumlahBarang = scanner.nextInt();

        System.out.print("Masukkan harga per barang (dalam Rupiah): ");
        double hargaPerBarang = scanner.nextDouble();
        double totalHarga = jumlahBarang * hargaPerBarang;
        double diskon = 0.0;
        if (jumlahBarang >= 5 && jumlahBarang <= 10) {
            diskon = 0.05;
        } else if (jumlahBarang >= 11 && jumlahBarang <= 20) {
            diskon = 0.1;
        } else if (jumlahBarang > 20) {
            diskon = 0.2;
        }
        double totalHargaSetelahDiskon = totalHarga - (totalHarga * diskon);

        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("id-ID"));
        System.out.println("Total harga sebelum diskon: " + formatRupiah.format(totalHarga));
        System.out.println("Berikan diskon: " + (diskon * 100) + "%");
        System.out.println("Total harga setelah diskon: " + formatRupiah.format(totalHargaSetelahDiskon));

        scanner.close();
    }
}