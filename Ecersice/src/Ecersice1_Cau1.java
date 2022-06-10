public class Ecersice1_Cau1 {
    public static void main(String[] args) {
        System.out.println("Ý 1");
        int hight = 4;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("\t *");
            }
            System.out.println();
        }
        System.out.println("Ý 2");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("\t *");
            }
            System.out.println();
        }
    }
}

