import java.util.Scanner;

public class a6of10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ex_a = 3;
        int ex_b = 7;
        int ex_c = 12;
        System.out.println("Пример функции:");
        System.out.println("Fibonacci(" + ex_a + ") ➞ " + profit6(ex_a));
        System.out.println("Fibonacci(" + ex_b + ") ➞ " + profit6(ex_b));
        System.out.println("Fibonacci(" + ex_c + ") ➞ " + profit6(ex_c));
        while (true) {
            System.out.println("Введите число. Введите Exit - для выхода из программы");
            String a = scan.next();
            if (a.equalsIgnoreCase("Exit")) {
                break;
            }
            String[] num = a.split("\\.");
            if (isNumeric(num[0])) {
                System.out.println("Fibonacci(" + a + ") ➞ " + profit6(Integer.parseInt(a)));
            }
        }
    }
    public static int profit6(int a) {
        int prev = 0, next = 1;
        int i = 1;
        while (i<= a){
            int sum = prev + next;
            prev = next;
            next = sum;
            i++;
        }
        return next;
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
