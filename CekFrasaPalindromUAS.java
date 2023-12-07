import java.util.Scanner;
public class CekFrasaPalindromUAS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kata/frasa: ");
        String input = scanner.nextLine();
        String cleanedInput = input.replaceAll("\\s", "").toLowerCase();

        if (isPalindrom(cleanedInput)) {
            System.out.println("'" + input + "' termasuk palindrom.");
        } else {
            System.out.println("'" + input + "' bukan palindrom.");
        }
        scanner.close();
    }
    public static boolean isPalindrom(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}