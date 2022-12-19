import java.util.Scanner;

public class a9of10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] ex_a = {"automation", "auto-"};
        String[] ex_b = {"arachnophobia", "-phobia"};
        String[] ex_c = {"retrospect", "sub-"};
        String[] ex_d = {"vocation", "-logy"};
        System.out.println("Пример функции:");
        System.out.println("isPrefix(\"" + ex_a[0] + "\", \"" + ex_a[1] + "\") ➞ " + prefix(ex_a));
        System.out.println("isSuffix(\"" + ex_b[0] + "\", \"" + ex_b[1] + "\") ➞ " + suffix(ex_b));
        System.out.println("isPrefix(\"" + ex_c[0] + "\", \"" + ex_c[1] + "\") ➞ " + prefix(ex_c));
        System.out.println("isSuffix(\"" + ex_d[0] + "\", \"" + ex_d[1] + "\") ➞ " + suffix(ex_d));
        while (true) {
            System.out.println("Введите P - если нужен префикс или S - если нужен суффикс. Введите Exit - для выхода из программы");
            String a = scan.nextLine();
            if (a.equalsIgnoreCase("Exit")) {
                break;
            }
            if (a.equalsIgnoreCase("S")) {
                System.out.println("Введите слово и суффикс через пробел с использованием тире. Введите Exit - для выхода из программы");
                String s = scan.nextLine();
                String[] ss = s.split(" ");
                if (ss.length == 2) {
                    System.out.println("isStrangePair(\"" + ss[0] + "\", \"" + ss[1] + "\") ➞ " + suffix(ss));
                }
            }
            if (a.equalsIgnoreCase("P")) {
                System.out.println("Введите слово и префикс через пробел с использованием тире. Введите Exit - для выхода из программы");
                String p = scan.nextLine();
                String[] pp = p.split(" ");
                if (pp.length == 2) {
                    System.out.println("isStrangePair(\"" + pp[0] + "\", \"" + pp[1] + "\") ➞ " + prefix(pp));
                }
            }
        }
    }
    public static boolean prefix(String[] pp) {
        return pp[0].startsWith(pp[1].substring(0, pp[1].length() - 1));
    }
    public static boolean suffix(String[] ss) {
        return ss[0].endsWith(ss[1].substring(1));
    }
}
