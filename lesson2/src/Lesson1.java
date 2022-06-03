import java.util.Random;
import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        //chương trìnhnumber được nhập vào từ bàn phím
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số");
        int nunber = sc.nextInt();
        System.out.println("số nhập vào từ bàn phím là :" + nunber);

        //chương trình sinh số ngẫu nhiên từ 1-100
        Random td = new Random();
                int rdNumber = td.nextInt(1,100);
        System.out.println("số ngẫu nhiên =" + rdNumber);

        // so sánh 2 số sửu dụng toán tử 3 ngôi

        int a = 6;
        int b = 7;
        String s = (a < 7) ? "a nhỏ hơn b" : "a lớn hơn b";
        System.out.println("kết quả :" + s);






    }
}
