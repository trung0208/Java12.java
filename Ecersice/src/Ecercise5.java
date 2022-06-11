import java.util.Scanner;

public class Ecercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số dòng của mảng ");
        int n = sc.nextInt();
        System.out.println("nhập số cột của mảng");
        int m = sc.nextInt();
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("nhập phần tử thứ [" + i + "," + j + "] :");
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("mảng in ra là");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        //liệt kê các phần tử trên đường chéo chính
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    System.out.println("các phần tử nằm trên đường chéo chính là :" + array[i][j]);
                }
            }


        }

    }
}
