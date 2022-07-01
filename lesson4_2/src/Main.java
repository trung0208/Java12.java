import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử mảng : ");
        int [] arrays = newArray();
        System.out.println("các phần tử của mảng :");
        show(arrays);
        System.out.println();
        System.out.println("Các phần tử là số chẵn tăng lên 1");
        number(arrays);

    }
    // tạo mảng số nguyên với n phần tử, n nhập vào từ bàn phím
    public static  int[] newArray () {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập phần tử tại vị trí [%d] :", i);
            array[i] = sc.nextInt();
        }
        return array;
    }

    // in mảng ra màn hình
    public static void show(int [] arr){
        for (int i =0 ; i < arr.length; i++){
            System.out.print("\t" + arr[i]);
        }
    }

    // thay đổi phần tử mảng là số chẵn tăng lên 1
    public static void number(int[] arr){
        for (int i = 0; i < arr.length ;i++){
            if (arr[i] % 2 ==0){
                 arr[i]++;
            }
            System.out.print(arr[i] + "\t");
        }
    }
}
