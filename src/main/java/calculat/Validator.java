package calculat;

public class Validator {
    String str;
    String[] numbers = new String[3];

    public Validator(String intNum) {
        str = intNum;
        numbers[0] = str.split(" ")[0];
        numbers[1] = str.split(" ")[1];
        numbers[2] = str.split(" ")[2];
    }

    public boolean isValid() {

        try {
            if (numbers.length < str.split(" ").length) {
                throw new Exception("Too many values");
            }
            switch (numbers[1]) {
                case "+":
                    break;
                case "-":
                    break;
                case "*":
                    break;
                case "/":
                    break;
                default:
                    throw new Exception("Недействительная операция");
            }

            if ((this.romanianNumbers(numbers[0]) != 0) && (this.romanianNumbers(numbers[2]) != 0)) {
            } else if ((numbers[0].length() < 3 && this.isDigit(numbers[0])) && (numbers[2].length() < 3 && this.isDigit(numbers[2]))) {
                if ((Integer.parseInt(numbers[0]) < 11) && (Integer.parseInt(numbers[2]) < 11)) {
                } else {
                    throw new Exception("Введите целое число от 0 до 10");
                }

            } else {
                throw new Exception("Введите целое число от 0 до 10");
            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
            return false;

        }
        return true;
    }

    public int romanianNumbers(String num) {
        String number = num;
        int result = 0;
        switch (number) {
            case "I":
                result = 1;
                break;
            case "II":
                result = 2;
                break;
            case "III":
                result = 3;
                break;
            case "IV":
                result = 4;
                break;
            case "V":
                result = 5;
                break;
            case "VI":
                result = 6;
                break;
            case "VII":
                result = 7;
                break;
            case "VIII":
                result = 8;
                break;
            case "IX":
                result = 9;
                break;
            case "X":
                result = 10;
                break;

        }
        return result;
    }

    public boolean isDigit(String num) throws NumberFormatException {
        try {
            Integer.parseInt(num);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }

}

