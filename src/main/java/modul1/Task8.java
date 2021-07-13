
//// Найти max{min(a, b), min(c, d)}.

package modul1;

public class Task8 {
    public static void main(String[] args) {
        int a = 9;
        int b = 1;
        int c = 17;
        int d = 5;
        if (a > b && a > c && a > d)
            System.out.println(a);
        else if (b > a && b > c && b > d) {
            System.out.println(b);
        }
        else if (c > a && c > b && c > d) {
            System.out.println(c);
        }
        else
            System.out.println(d);
    }
}