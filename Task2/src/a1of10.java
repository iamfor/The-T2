import java.util.Arrays;
import java.util.Scanner;

public class a1of10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] ex_a = {"Nice", "5"};
        String[] ex_b = {"hello", "3"};
        String[] ex_c = {"stop", "1"};
        System.out.println("Пример функции:");
        System.out.println("abcmath(" + Arrays.toString(ex_a) + ") ➞ " + profit(ex_a[0], Integer.parseInt(ex_a[1])));
        System.out.println("abcmath(" + Arrays.toString(ex_b) + ") ➞ " + profit(ex_b[0], Integer.parseInt(ex_b[1])));
        System.out.println("abcmath(" + Arrays.toString(ex_c) + ") ➞ " + profit(ex_c[0], Integer.parseInt(ex_c[1])));
        while (true) {
            System.out.println("Введите слово");
            String a = scan.next();
            String[] num = new String[2];
            num[0] = a;
            System.out.println("Введите количество повторений число. Введите Exit - для выхода из программы");
            num[1] = scan.next();
            if (num[1].equalsIgnoreCase("Exit")) {
                break;
            }
            if (isNumeric(num[1]))
                System.out.println("operation(" + Arrays.toString(ex_b) + ") ➞ " + profit(num[0], Integer.parseInt(num[1])));
        }
    }
    public static String profit(String a, int b) {
        char[] c = a.toCharArray();
        String word = "";
        for (char letter:c){
            for (int i=1; i<=b; i++) {
                word = word + letter;
            }
        }
        return word;
    }
    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}
