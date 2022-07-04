import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookService service = new BookService();
        Book[] arrBooks =service.arrBook();
        System.out.println("các sách có trong mảng là : ");
        service.Show(arrBooks);

        System.out.println("----------------");
        System.out.println("Nhập tên sách cần tìm");
        Scanner sc = new Scanner(System.in);
        String names = sc.nextLine();
        service.finBookByName(arrBooks, names );

        System.out.println("--------------------");
        System.out.println("Sách xuất bản trong năm nay là");
        int years = LocalDate.now().getYear();
        service.finBookByYear(arrBooks, years);
    }
}
