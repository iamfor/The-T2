import java.util.Arrays;
import java.util.Scanner;

public class a3of10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] ex_a = {1, 3};
        int[] ex_b = {1, 2, 3, 4};
        int[] ex_c = {1, 5, 6};
        int[] ex_d = {1, 1, 1};
        int[] ex_e = {9, 2, 2, 5};
        System.out.println("Пример функции:");
        System.out.println("isAvgWhole(" + Arrays.toString(ex_a) + ") ➞ " + profit3(ex_a));
        System.out.println("isAvgWhole(" + Arrays.toString(ex_b) + ") ➞ " + profit3(ex_b));
        System.out.println("isAvgWhole(" + Arrays.toString(ex_c) + ") ➞ " + profit3(ex_c));
        System.out.println("isAvgWhole(" + Arrays.toString(ex_d) + ") ➞ " + profit3(ex_d));
        System.out.println("isAvgWhole(" + Arrays.toString(ex_e) + ") ➞ " + profit3(ex_e));
        while (true) {
            System.out.println("Введите числа через пробел. Введите Exit - для выхода из программы");
            String a = scan.nextLine();
            if (a.equalsIgnoreCase("Exit")) {
                break;
            }
            String[] num = a.split(" ");
            int[] b = new int[num.length];
            if (num[0].isEmpty()) {
                b[0] = 0;
            }
            else {
                if (isNumeric(num[0])) {
                    for (int i = 0; i < num.length; i++) {
                        b[i] = Integer.parseInt(num[i]);
                    }
                }
            }
            if (isNumeric(num[0])) {
                System.out.println("isAvgWhole(" + Arrays.toString(b) + ") ➞ " + profit3(b));
            }
        }
    }
    public static boolean profit3(int[] a) {
        int s = 0;
        for (int i=0; i<a.length; i++) {
            s = s + a[i];
        }
        return s % a.length == 0;
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
