
public class Ecercise_2 {
    public static void main(String[] args) {
        String str =" You only live once, but if you do it right, once is enough";
        String[] count = str.split(" ");
        for (int i=1;i<count.length;i++){
        }
        System.out.println("số từ trong chuỗi =" +count.length);
        char a = 'o';
        int newcount = 0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==a){
                newcount++;
            }
        }
        System.out.println("số lần xuất hiện ký tự o =" +newcount);
        for (int i=1;i<str.length();i++){
            if (str.charAt(i)==a){
                System.out.println("vị trí của o =" +i);
            }
        }

    }

}
