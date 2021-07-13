// Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
//заданному е. Общий член ряда имеет вид:
package modul1;

public class Task16 {
    public static void main(String[] args) {
        double sum = 0.0;
        double e = 1.5;
        double an = 0.0;
        int n = 10;

        for (int i = 0; i <= n; i++) {
            an = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
            if (Math.abs(an) >= e ){
                sum += an;
            }
        }

        System.out.println("Сумма равна " + sum);

    }
}
