import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // nhập vào bàn phím họ và tên
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào bàn phím họ và tên bạn :");
        String name = sc.nextLine();
        System.out.println("tên của bạn là :" + name);

        // chuẩn hóa chuỗi vừa nhập
        String names;
         names = name.trim().toLowerCase(Locale.ROOT);
            String [] arrName = names.split(" ");
            names ="";
            for (int i = 0 ; i < arrName.length ; i++){
                names += String.valueOf(arrName[i].charAt(0)).toUpperCase() + arrName[i].substring(1);
                if (i<arrName.length-1)
                    names+= "";
        }
        System.out.println(names);

    }
}
