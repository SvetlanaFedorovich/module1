//Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
//принадлежит закрашенной области, и false — в противном случае:
package modul1;

public class Task6 {
    public static void main(String[] args) {
        double x = 0;
        double y = -2;
        if (x >= -0.5 && x <= 0.5 & y >= -0.5 && y <= -1.5)
            System.out.println("false");
        else if ((x > -2 && x <= 2 ) & (y > 0 && y < 4) || (x >= -4 && x <= 4 & y >= 0 && y <= -0.5) || x >= -4 && x <= 4 & y >= -1.5 && y <=-4) {
            System.out.println("true");
        } else
            System.out.println("false");
    }
}
