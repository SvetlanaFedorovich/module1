package calculat;

import java.util.Scanner;

public class RunnerCalculat {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            for (int i = 0; i == 0; ) {
                System.out.println("Пожалуйста, введите выражение для расчета: (используйте пробелы между числами)");
                String userInput = in.nextLine();
                Validator call = new Validator(userInput);
                boolean check = call.isValid();
                if (!check) {
                    break;
                }
                Calculat calculator = new Calculat(userInput);
                calculator.converter();
                System.out.println(calculator.operation());
                return;
            }
        } catch (Exception e) {
            System.err.println("Неверные данные");
        }
    }
}
