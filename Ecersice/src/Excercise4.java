import java.util.Scanner;

public class Excercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập 10");
        int n = sc.nextInt();
        System.out.printf("10 số nguyên tố đầu tiên là :");
        int count = 0;
        int i =2;
        while (count<n){
            if (isPrimeNumber(i)){
                System.out.print(i +" ");
                count++;
            }i++;

        }
        System.out.printf("\tcác số nguyên tố nhỏ hơn 10 là :");
       for (int j=0;j<10;j++){
           if (isPrimeNumber(j)){
               System.out.print(j + " ");
           }
        }

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
