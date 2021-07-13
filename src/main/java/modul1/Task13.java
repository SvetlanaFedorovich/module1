////Вычислить значения функции на отрезке [а,b] c шагом h:
package modul1;

public class Task13 {
    public static void main(String[] args) {
        int a = -8;
        int b = 2;
        int h = 2;
        int x = 1;
        int y;

        for (int i = a; i <= b; i += h) {
            if (i <= 2) {
                y = -i;
            } else {
                y = i;
            }
            System.out.println("При х = " + i + " у = " + y);
        }
    }
}