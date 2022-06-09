import java.util.Scanner;

public class Cau2 {
    public static void main(String[] args) {
        String str;
        char character;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào chuỗi bất kỳ: ");
        str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            character = str.charAt(str.length() - i - 1);
            if (str.charAt(i) == character) {
                System.out.println("Chuỗi này là chuỗi Panlyndrome.");
                break;
            } else {
                System.out.println("Chuỗi này không là chuỗi Panlyndrome.");
                break;
            }
        }
    }
}
