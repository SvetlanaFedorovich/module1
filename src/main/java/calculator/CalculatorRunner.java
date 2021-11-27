package calculator;
/*
Задача: программа “Арабо-римский калькулятор”
 */

import java.util.Scanner;

public class CalculatorRunner {

    public static void main(String[] args) {
        System.out.println("Введите выражение:");
        Scanner in = new Scanner(System.in);
        String calculator = in.nextLine();
        calculator = calculator.trim();

        String[] blocks = calculator.split(" ");

        try {
            if (Calculator.arabicNumbers.isInputValueIsNumber(blocks[0]) && Calculator.arabicNumbers.isInputValueIsNumber(blocks[2]) && Calculator.operations.isInputOperationIsCorrect(blocks[1])) {
                System.out.println(Calculator.arabicNumbers.calculateArabicNumber(blocks[0], blocks[2], blocks[1]));
            } else if (Calculator.romanNumbers.isInputValueIsNumber(blocks[0]) && Calculator.romanNumbers.isInputValueIsNumber(blocks[2]) && Calculator.operations.isInputOperationIsCorrect(blocks[1])) {
                if (Calculator.romanNumbers.calculateRomanNumbers(blocks[0], blocks[2], blocks[1]) != null)
                    System.out.println(Calculator.romanNumbers.calculateRomanNumbers(blocks[0], blocks[2], blocks[1]));
            } else throw new Exception();
        } catch (Exception e) {
            System.out.println("Ошибка! Проверьте правильность введенных данных");
        }
        in.close();
    }
}
