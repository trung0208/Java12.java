public class Lesson3 {
    public static void main(String[] args) {
        String str = "Hello every one";
        char a = 'e';
        int count = 0;
       for (int i = 0; i < 15; i++) {
            if (str.charAt(i) == a) {
                count++;
            }

        }
        System.out.println("số lần xuất hiện ký tự e =" + count);
       for (int i = 0; i < str.length() ; i++){
            if (str.charAt(i) == a){
                System.out.println("index e =" + i);
            }
        }

    }
}
