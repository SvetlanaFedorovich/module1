//Вычислить значение выражения по формуле (все переменные принимают действительные значения):
package modul1;

public class Task3 {
    public static void main(String[] args) {
        double x = 6.2;
        double y = 2.3;
        double z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        System.out.println("Значение выражения = " + z);
    }
}

