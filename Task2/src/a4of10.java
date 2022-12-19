import java.util.Arrays;
import java.util.Scanner;

public class a4of10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] ex_a = {1, 2, 3};
        int[] ex_b = {1, -2, 3};
        int[] ex_c = {3, 3, -2, 408, 3, 3};
        System.out.println("Пример функции:");
        System.out.println("cumulativeSum(" + Arrays.toString(ex_a) + ") ➞ " + Arrays.toString(profit4(ex_a)));
        System.out.println("cumulativeSum(" + Arrays.toString(ex_b) + ") ➞ " + Arrays.toString(profit4(ex_b)));
        System.out.println("cumulativeSum(" + Arrays.toString(ex_c) + ") ➞ " + Arrays.toString(profit4(ex_c)));
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
                System.out.println("cumulativeSum(" + Arrays.toString(b) + ") ➞ " + Arrays.toString(profit4(b)));
            }
        }
    }
    public static int[] profit4(int[] a) {
        int[] x = new int[a.length];
        x[0] = a[0];
        for (int i=1; i<a.length; i++) {
            x[i] = x[i-1]+a[i];
        }
        return x;
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
