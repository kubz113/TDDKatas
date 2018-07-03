package StringCalculatorKata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    public int add(String inputNums) {

        List<String> newLineList = Arrays.asList(inputNums.split("\n"));

        String delim = null;
        List<String> customDelimList;
        if (!newLineList.get(0).isEmpty()) {
            String tempDelim = newLineList.get(0);
            if (tempDelim.length() > 2 && tempDelim.substring(0, 2).equals("//")) {
                if (tempDelim.substring(2, 3).equals("[")) {
                    String customLengthDelim = tempDelim.substring(2, tempDelim.length());
                    List<String> delimList = Arrays.asList(customLengthDelim.split("\\["));

                    String unformattedDelim = delimList.get(1);
                    delim = unformattedDelim.substring(0, unformattedDelim.length() - 1);
                } else {
                    delim = tempDelim.substring(2, tempDelim.length());
                }
            }
        }

        List<String> listOfNums = null;

        if (delim == null) {
            listOfNums = Arrays.asList(inputNums.split("(,)|(\n)"));
        } else {
            inputNums = inputNums.split("\n")[1];
            listOfNums = new ArrayList<String>(Arrays.asList(inputNums.split(Pattern.quote(delim))));

        }
        int sum = 0;
        if (inputNums.isEmpty()) {
            return 0;
        } else {
            for (String num : listOfNums) {
                int numVal = Integer.valueOf(num);
                if (numVal < 0) {
                    throw new IllegalArgumentException("Negative Not Allowed");
                }
                if (numVal < 1000) {
                    sum += numVal;
                }
            }
        }
        return sum;
    }
}