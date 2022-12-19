import java.util.Scanner;

public class a10of10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ex_a = 0;
        int ex_b = 1;
        int ex_c = 2;
        System.out.println("Пример функции:");
        System.out.println("boxSeq(" + ex_a + ") ➞ " + profit10(ex_a));
        System.out.println("boxSeq(" + ex_b + ") ➞ " + profit10(ex_b));
        System.out.println("boxSeq(" + ex_c + ") ➞ " + profit10(ex_c));
        while (true) {
            System.out.println("Введите шаг. Введите Exit - для выхода из программы");
            String a = scan.nextLine();
            if (a.equalsIgnoreCase("Exit")) {
                break;
            }
            System.out.println("boxSeq(" + a + ") ➞ " + profit10(Integer.parseInt(a)));
        }
    }
    public static int profit10(int a) {
        if (a == 0) {
            return 0;
        }
        int box = 3;
        for (int i=2; i<=a; i++) {
            if (i % 2 == 0) {
                box = box - 1;
            }
            else {
                box = box + 3;
            }
        }
        return box;
    }
}
