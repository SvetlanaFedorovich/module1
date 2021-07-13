//Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
//*Точки 1, 2, 3 - лежат на одной прямой */
package modul1;

public class Task9 {
    public static void main(String[] args) {
        int x_1 = 1;
        int y_1 = 1;
        int x_2 = 3;
        int y_2 = 3;
        int x_3 = 5;
        int y_3 = 5;
        if ((x_1 - x_2) * (y_3 - y_2) == (x_3 - x_2) * (y_1 - y_2))
        System.out.println("Точки 1, 2, 3 - лежат на одной прямой.");
        else
        System.out.println("Точки 1, 2, 3 - не лежат на одной прямой.");
    }
}
