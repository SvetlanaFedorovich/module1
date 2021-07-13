//Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
//m и n вводятся с клавиатуры.

package modul1;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        String res = "";
        for (int i = 2; i <= m & i != m & i != n & i != 1; i++, n++) {
            if (0 == (n % i))
                res += i + " ";

        }
        System.out.println(res);
    }
}