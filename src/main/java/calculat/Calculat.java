package calculat;

public class Calculat extends Validator {

    int a;
    int b;
    boolean isRoman;

    public Calculat(String intNum) {
        super(intNum);
    }

    public String operation() {
        int result = 0;
        String finaly = "";
        switch (numbers[1]) {
            case "+":
                result = add();
                break;
            case "-":
                result = substraction();
                break;
            case "*":
                result = multiply();
                break;
            case "/":
                result = division();
                break;
        }
        if (isRoman) {
            finaly += this.toRoman(result);
        } else {
            finaly += result;
        }
        return finaly;
    }

    public int add() {
        return a + b;

    }

    public int division() {
        return a / b;

    }

    public int substraction() {
        if (b >= a) {
            throw new RuntimeException();
        }
        return a - b;
    }

    public int multiply() {
        return a * b;

    }

    public void converter() {
        if (this.romanianNumbers(numbers[0]) != 0) {

            a = this.romanianNumbers(numbers[0]);
            b = this.romanianNumbers(numbers[2]);
            isRoman = true;
        } else if (numbers[0].length() < 3 && super.isDigit(numbers[0])) {
            a = Integer.parseInt(numbers[0]);
            b = Integer.parseInt(numbers[2]);
            isRoman = false;
        }
    }

    public String toRoman(int result) {
        String s = "";
        while (result >= 100) {
            s += "C";
            result -= 100;
        }
        while (result >= 90) {
            s += "XC";
            result -= 90;
        }
        while (result >= 50) {
            s += "L";
            result -= 50;
        }
        while (result >= 40) {
            s += "XL";
            result -= 40;
        }
        while (result >= 10) {
            s += "X";
            result -= 10;
        }
        while (result >= 9) {
            s += "IX";
            result -= 9;
        }
        while (result >= 5) {
            s += "V";
            result -= 5;
        }
        while (result >= 4) {
            s += "IV";
            result -= 4;
        }
        while (result >= 1) {
            s += "I";
            result -= 1;
        }
        return s;
    }
}

