//Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
//он прямоугольным.
package modul1;

public class Task7 {
    public static void main(String[] args) {
        int x = 45;
        int y = 45;
        int s = 180 - (x + y);
        if(s == 90)
            System.out.println("Треугольник является прямоугольным.");
        else if (s >= 0 & s <=90)
            System.out.println(" Такого треугольника не существует.");
        else
            System.out.println("Такой треугольник не является прямоугольным.");
    }
}