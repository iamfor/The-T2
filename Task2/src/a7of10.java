import java.util.Scanner;

public class a7of10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ex_a = "59001";
        String ex_b = "853a7";
        String ex_c = "732 32";
        String ex_d = "393939";
        System.out.println("Пример функции:");
        System.out.println("getDecimalPlaces(" + ex_a + ") ➞ " + profit7(ex_a));
        System.out.println("getDecimalPlaces(" + ex_b + ") ➞ " + profit7(ex_b));
        System.out.println("getDecimalPlaces(" + ex_c + ") ➞ " + profit7(ex_c));
        System.out.println("getDecimalPlaces(" + ex_d + ") ➞ " + profit7(ex_d));
        while (true) {
            System.out.println("Введите индекс. Введите Exit - для выхода из программы");
            String a = scan.nextLine();
            if (a.equalsIgnoreCase("Exit")) {
                break;
            }
                System.out.println("getDecimalPlaces(" + a + ") ➞ " + profit7(a));
        }
    }
    public static boolean profit7(String a) {
        if (isNumeric(a)) {
            int b = Integer.parseInt(a);
            String c = Integer.toString(b);
            return c.length() == 5;
        }
        else {
            return false;
        }
    }
    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}
