import java.util.Scanner;

public class a5of10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ex_a = "43.20";
        String ex_b = "400";
        String ex_c = "3.1";
        System.out.println("Пример функции:");
        System.out.println("getDecimalPlaces(" + ex_a + ") ➞ " + profit5(ex_a));
        System.out.println("getDecimalPlaces(" + ex_b + ") ➞ " + profit5(ex_b));
        System.out.println("getDecimalPlaces(" + ex_c + ") ➞ " + profit5(ex_c));
        while (true) {
            System.out.println("Введите число. Введите Exit - для выхода из программы");
            String a = scan.next();
            if (a.equalsIgnoreCase("Exit")) {
                break;
            }
            String[] num = a.split("\\.");
            if (isNumeric(num[0])) {
                System.out.println("getDecimalPlaces(" + a + ") ➞ " + profit5(a));
            }
        }
    }
    public static int profit5(String a) {
        String[] x = a.split("\\.");
        if (x.length > 1 && x[1] != null) {
            String s = x[1];
            int count = 0;
            for (int i=0; i<s.length(); i++){
                count++;
            }
            return count;
        }
        else {
            return 0;
        }
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
