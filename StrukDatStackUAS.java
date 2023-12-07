import java.util.Stack;
import java.util.Scanner;
public class StrukDatStackUAS {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        System.out.print("Ekspresi matematika: ");
        String ekspresi = scanner.nextLine();

        if (cekKeseimbanganKurung(ekspresi)) {
            System.out.println("Urutan kurung pada ekspresi matematika sudah benar.");
        } else {
            System.out.println("Urutan kurung pada ekspresi matematika salah.");
        }
        scanner.close();
    }
    public static boolean cekKeseimbanganKurung(String ekspresi) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < ekspresi.length(); i++) {
            char karakter = ekspresi.charAt(i);

            if (karakter == '(' || karakter == '[' || karakter == '{') {
                stack.push(karakter);
            } else if (karakter == ')' || karakter == ']' || karakter == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char bukaKurung = stack.pop();
                if (!pasanganKurung(bukaKurung, karakter)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static boolean pasanganKurung(char buka, char tutup) {
        return (buka == '(' && tutup == ')') ||
               (buka == '[' && tutup == ']') ||
               (buka == '{' && tutup == '}');
    }
}