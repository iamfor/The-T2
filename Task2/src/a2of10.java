import java.util.Arrays;
import java.util.Scanner;

public class a2of10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] ex_a = {10, 4, 1, 4, -10, -50, 32, 21};
        int[] ex_b = {44, 32, 86, 19};
        System.out.println("Пример функции:");
        System.out.println("differenceMaxMin(" + Arrays.toString(ex_a) + ") ➞ " + profit2(ex_a));
        System.out.println("differenceMaxMin(" + Arrays.toString(ex_b) + ") ➞ " + profit2(ex_b));
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
                System.out.println("differenceMaxMin(" + Arrays.toString(b) + ") ➞ " + profit2(b));
            }
        }
    }
    public static int profit2(int[] a) {
        Arrays.sort(a);
        return a[a.length-1]-a[0];
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
