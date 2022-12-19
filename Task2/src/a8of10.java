import java.util.Arrays;
import java.util.Scanner;

public class a8of10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] ex_a = {"ratio", "orator"};
        String[] ex_b = {"sparkling", "groups"};
        String[] ex_c = {"bush", "hubris"};
        String[] ex_d = {"\"\"", "\"\""};
        System.out.println("Пример функции:");
        System.out.println("isStrangePair(" + ex_a[0] + ", " + ex_a[1] + ") ➞ " + profit8(ex_a));
        System.out.println("isStrangePair(" + ex_b[0] + ", " + ex_b[1] + ") ➞ " + profit8(ex_b));
        System.out.println("isStrangePair(" + ex_c[0] + ", " + ex_c[1] + ") ➞ " + profit8(ex_c));
        System.out.println("isStrangePair(" + ex_d[0] + ", " + ex_d[1] + ") ➞ " + profit8(ex_d));
        while (true) {
            System.out.println("Введите два числа через пробел. Введите Exit - для выхода из программы");
            String a = scan.nextLine();
            if (a.equalsIgnoreCase("Exit")) {
                break;
            }
            String[] num = a.split(" ");
            if (num.length == 2) {
                System.out.println("isStrangePair(" + Arrays.toString(num) + ") ➞ " + profit8(num));
            }
        }
    }
    public static boolean profit8(String[] as) {
        return as[0].charAt(0) == as[1].charAt(as[1].length() - 1) && as[1].charAt(0) == as[0].charAt(as[0].length() - 1);
    }
}
