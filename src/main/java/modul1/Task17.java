// Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
package modul1;

public class Task17 {
    public static void main(String[] args) {
        for (int i = 32; i <= 126; i++) {
            System.out.println(i + " " + (char) i);
        }

        System.out.println();
    }
}
