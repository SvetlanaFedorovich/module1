// Вычислить значение выражения по формуле (все переменные принимают действительные значения):
package modul1;

public class Task2 {
    public static void main(String[] args) {
        double  a = 5;
        double  b = 25;
        double  c = 1;
        double  z = ((b + Math.sqrt((Math.pow(b, 2)) + 4 * a * c)) / 2 * a - (Math.pow(a, 3) * c + (Math.pow(b, -2))));
        System.out.println("Значение выражения равно " + z);
}
}
