package RomanNumeralKata;

public class RomanNumeral {

    public String convertNumber(int n) {

        String romanNumeralOutput = "";

        romanNumeralOutput = calculateThousandNumeral(n,romanNumeralOutput);
        romanNumeralOutput = calculateHundredNumeral(n,romanNumeralOutput);
        romanNumeralOutput = calculateFiftyNumeral(n, romanNumeralOutput);
        romanNumeralOutput = calculateOnesNumeral(n, romanNumeralOutput);


        return romanNumeralOutput;
    }

    private String calculateThousandNumeral(int n, String romanNumeralOutput) {
        String temp = "";
        int hundredsNeeded = (n / 1000) % 5;
        if (hundredsNeeded < 4) {
            for (int i = 0; i < hundredsNeeded; i++) {
                temp += "M";
            }
        }
        return romanNumeralOutput+temp;
    }

    private String calculateHundredNumeral(int n, String romanNumeralOutput) {
        String temp = "";
        int fiveHundredCount = (n / 100) % 10;
        int hundredsNeeded = (n / 100) % 5;
        if (hundredsNeeded < 4) {
            for (int i = 0; i < hundredsNeeded; i++) {
                temp += "C";
            }
        }

        if (fiveHundredCount > 4 && fiveHundredCount < 9) {
            temp = "D" + temp;
        }
        if (fiveHundredCount == 4) {
            temp += "XD";
        }
        if (fiveHundredCount == 9) {
            temp += "CM";
        }
        return romanNumeralOutput+temp;
    }

    private String calculateFiftyNumeral(int n, String romanNumeralOutput) {
        String temp = "";
        int fiftyCount = (n / 10) % 10;
        int tensNeeded = (n / 10) % 5;
        if (tensNeeded < 4) {
            for (int i = 0; i < tensNeeded; i++) {
                temp += "X";
            }
        }
        if (fiftyCount > 4 && fiftyCount < 9) {
            temp = "L" + temp;
        }
        if (fiftyCount == 4) {
            temp += "XL";
        }
        if (fiftyCount == 9) {
            temp += "XC";
        }
        return romanNumeralOutput+temp;
    }

    private String calculateOnesNumeral(int n, String romanNumeralOutput) {
        String temp = "";
        int singleDigit = n % 5;
        int fiveNeeded = n % 10;
        if (singleDigit < 4) {
            for (int i = 0; i < singleDigit; i++) {
                temp += "I";
            }
        }
        if (fiveNeeded > 4 && fiveNeeded < 9 && singleDigit != 4) {
            temp = "V" + temp;
        }

        if (fiveNeeded == 4) {
            temp += "IV";
        }

        if (fiveNeeded == 9) {
            temp = temp + "IX";
        }
        return romanNumeralOutput+temp;
    }

    public static void main(String[] args) {
        RomanNumeral test = new RomanNumeral();
        for (int i = 0; i < 3000; i++) {
            System.out.println(test.convertNumber(i));
        }
    }
}
