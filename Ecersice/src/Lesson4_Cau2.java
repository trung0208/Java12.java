import java.util.Scanner;

public class Lesson4_Cau2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập kích thước của mảng ");
            int n = sc.nextInt();
        int[] number = new int[n];
        for (int i=0;i < n;i++){
            System.out.printf("nhập phần tử number [%d]: ", i);
            number[i] = sc.nextInt();
        }
        System.out.println("phần tử trong mảng là :");
        for (int i=0;i<n;i++){
            System.out.println(number[i]);
        }
        for (int i=0;i<n;i++){
            if (number[i] % 2 ==0){
                int a = number[i] + 1;
                System.out.println("giá trị số chẵn cộng thêm 1 =" + a);
            }

        }



    }
}
