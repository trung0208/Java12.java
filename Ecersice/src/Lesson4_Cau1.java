import java.util.Locale;
import java.util.Scanner;

public class Lesson4_Cau1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập họ và tên");
       String name = sc.nextLine();
       name = name.trim().toLowerCase();
        String[] temp = name.split(" ");
        name = "";
        for (int i=0 ;i< temp.length;i++){
            name+=String.valueOf(temp[i].charAt(0)).toUpperCase()+ temp[i].substring(1);
            if (i<temp.length);
            name+="";
            System.out.println(temp);
        }



    }
}
