//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа
package modul1;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[10];
        while (a != 0) {
            arr[a % 10]++;
            a /= 10;
        }
        while (b != 0) {
            if (arr[b % 10] != 0)
                System.out.println(b % 10);
            b /= 10;
        }
    }
}
