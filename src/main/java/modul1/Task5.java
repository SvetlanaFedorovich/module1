//Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
//данное значение длительности в часах, минутах и секундах в следующей форме:
//ННч ММмин SSc.
package modul1;

public class Task5 {
    public static void main(String[] args) {
        int x = 57235;
        int y = x / 3600;
        int z = (x % 3600) / 60;
        int s = (x % 3600) % 60;
        System.out.println(y + " часов " + z + " минут " + s + " секунд");
    }

}
