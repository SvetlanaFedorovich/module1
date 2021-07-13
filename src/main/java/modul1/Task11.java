//Вычислить значение функции:
package modul1;

public class Task11 {
    public static void main(String[] args) {
        int x = 4;
        if (x <= 3)
            System.out.println(Math.pow(x,2) + 3 * x +9);
        else
            System.out.println(1 / (Math.pow(x,3) + 6));
    }
}
