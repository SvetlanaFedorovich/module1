//Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
//все числа от 1 до введенного пользователем числа.
package modul1;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++){
            sum = sum +i;
    }
        System.out.println ("Сумма чисел равна " + sum);
    }
}
