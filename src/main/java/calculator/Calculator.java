package calculator;

import java.util.Arrays;

public class Calculator {
    static class arabicNumbers {
        static String[] arabic = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        static boolean isInputValueIsNumber(String value) {
            return Arrays.asList(arabic).contains(value);
        }

        public static int calculateArabicNumber(String value1, String value2, String operator) {
            int number1 = Integer.parseInt(value1);
            char operation = operator.charAt(0);
            int number2 = Integer.parseInt(value2);
            int result = 0;

            switch (operation) {
                case '+':
                    result = number1 + number2;
                    break;
                case '-':
                    result = number1 - number2;
                    break;
                case '*':
                    result = number1 * number2;
                    break;
                case '/':
                    result = number1 / number2;
            }
            return result;
        }
    }

    static class romanNumbers extends arabicNumbers {
        static String[] roman = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        static String[] romanDec = new String[]{"","II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C"};
        static int lenNums = roman.length;
        static int lenDec = romanDec.length;
        static int lenAll = lenDec * lenNums;
        static String[] romanAll = new String[lenAll];

        static boolean isInputValueIsNumber(String value) {
            return Arrays.asList(roman).contains(value);
        }

        static String calculateRomanNumbers(String value1, String value2, String operator) {
            for (int j = 0; j < lenDec - 1; j++) {
                for (int i = 0; i < lenNums; i++) {
                    if (i == 9) romanAll[j * 10 + i] = romanDec[j + 1];
                    else romanAll[j * 10 + i] = romanDec[j] + roman[i];
                }
            }

            String value1toArabic = Integer.toString(Arrays.binarySearch(roman, value1) + 1);
            String value2toArabic = Integer.toString(Arrays.binarySearch(roman, value2) + 1);


            int resultatArabic = arabicNumbers.calculateArabicNumber(value1toArabic, value2toArabic, operator);

            String resultat = null;

            try {
                resultat = romanAll[resultatArabic - 1];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Римское число не может быть меньше единицы.");
            }
            return resultat;
        }
    }

    static class operations {
        public static String[] op = {"+", "-", "*", "/"};

        public static boolean isInputOperationIsCorrect(String value) {
            return Arrays.asList(op).contains(value);
        }
    }
}