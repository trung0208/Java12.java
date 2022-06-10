import java.util.Random;
import java.util.Scanner;

public class Excersice3 {
    public static  void main(String[] args) {
        Random rd = new Random();
        int n = rd.nextInt();
        System.out.println(n);
        boolean check = isPrimeNumber(n);
        System.out.println("số có đúng là số nguyên tố không :" +check);
    }
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}




