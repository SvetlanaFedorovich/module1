//Составить программу нахождения произведения квадратов первых двухсот чисел.
package modul1;
import java.math.BigInteger;
public class Task15 {
    public static void main(String[] args) {
        int n = 200;
        int s = 0;
        for (int i = 2; i <= n; i++) {
           s *= i;
        }
        System.out.printf("Произведение квадратов первых двухсот чисел равна " + s);
    }
}
