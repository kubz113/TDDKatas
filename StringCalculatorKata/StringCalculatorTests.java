package StringCalculatorKata;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTests {

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    private StringCalculator stringCalculator = new StringCalculator();

    @Test
    public void emptyStringReturnZero() {
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    public void singleNumberStringReturnNumber() {
        assertEquals(5, stringCalculator.add("5"));
    }

    @Test
    public void twoNumberStringReturnSum() {
        assertEquals(10, stringCalculator.add("5,5"));
    }

    @Test
    public void threeNumberStringReturnSum() {
        assertEquals(15, stringCalculator.add("5,5,5"));
    }

    @Test
    public void twoNumberNewLineDelimStringReturnSum() {
        assertEquals(10, stringCalculator.add("5\n5"));
    }

    @Test
    public void customDelimStringReturnSum() {
        assertEquals(3, stringCalculator.add("//;\n1;2"));
    }

    @Test
    public void negativeNumStringReturnError() {
        exception.expect(IllegalArgumentException.class);
        stringCalculator.add("5,-3,2");
    }

    @Test
    public void numLargerThanOneThousandIgnored() {

        assertEquals(7, stringCalculator.add("1001,5,2"));
    }

    @Test
    public void customLengthDelimeterReturnSum() {

        assertEquals(6, stringCalculator.add("//[***]\n1***2***3"));
    }


}
