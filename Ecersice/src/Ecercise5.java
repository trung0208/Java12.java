import java.util.Scanner;

public class Ecercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số dòng của mảng ");
        int n = sc.nextInt();
        System.out.println("nhập số cột của mảng");
        int m = sc.nextInt();
        int [][] array = new int[n][m];
        for ( int i =0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.println("nhập phần tử thứ [" +i+","+j+"]");
                array[i][j]= sc.nextInt();
            }
        }


    }
}
