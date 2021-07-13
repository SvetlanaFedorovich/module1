// Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
//отверстие.
package modul1;

public class Task10 {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        int x = 5;
        int y = 8;
        int z = 8;
        if (a < x | b < y & a < y | b < x)
            System.out.println("Кирпич не пройдет через отверстие.");
        else
            System.out.println("Кирпич через отверстие пройдет.");
    }
}
