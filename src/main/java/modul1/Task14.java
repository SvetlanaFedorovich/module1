//Найти сумму квадратов первых ста чисел.
package modul1;

public class Task14 {
    public static void main(String[] args) {
        int n = 100;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i * i;
        }
        System.out.printf("Сумма квадратов чисел равна " + sum);
    }
}
