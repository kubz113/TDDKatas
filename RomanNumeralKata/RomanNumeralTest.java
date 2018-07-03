package RomanNumeralKata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanNumeralTest {
    private RomanNumeral romanNumeral = new RomanNumeral();

    @Test
    public void oneToRomanNumeral() {
        assertEquals("I", romanNumeral.convertNumber(1));
    }

    @Test
    public void twoToRomanNumeral() {
        assertEquals("II", romanNumeral.convertNumber(2));
    }

    @Test
    public void threeToRomanNumeral() {
        assertEquals("III", romanNumeral.convertNumber(3));
    }

    @Test
    public void fourToRomanNumeral() {
        assertEquals("IV", romanNumeral.convertNumber(4));
    }

    @Test
    public void fiveToRomanNumeral() {
        assertEquals("V", romanNumeral.convertNumber(5));
    }

    @Test
    public void sixToRomanNumeral() {
        assertEquals("VI", romanNumeral.convertNumber(6));
    }

    @Test
    public void sevenToRomanNumeral() {
        assertEquals("VII", romanNumeral.convertNumber(7));
    }

    @Test
    public void eightToRomanNumeral() {
        assertEquals("VIII", romanNumeral.convertNumber(8));
    }

    @Test
    public void nineToRomanNumeral() {
        assertEquals("IX", romanNumeral.convertNumber(9));
    }

    @Test
    public void tenToRomanNumeral() {
        assertEquals("X", romanNumeral.convertNumber(10));
    }

    @Test
    public void fourteenToRomanNumeral() {
        assertEquals("XIV", romanNumeral.convertNumber(14));
    }

    @Test
    public void nineteenToRomanNumeral() {
        assertEquals("XIX", romanNumeral.convertNumber(19));
    }

    @Test
    public void twentyToRomanNumeral() {
        assertEquals("XX", romanNumeral.convertNumber(20));
    }

    @Test
    public void fourtyToRomanNumeral() {
        assertEquals("XL", romanNumeral.convertNumber(40));
    }

    @Test
    public void fiftyToRomanNumeral() {
        assertEquals("L", romanNumeral.convertNumber(50));
    }

    @Test
    public void sixtyToRomanNumeral() {
        assertEquals("LX", romanNumeral.convertNumber(60));
    }

    @Test
    public void ninetyToRomanNumeral() {
        assertEquals("XC", romanNumeral.convertNumber(90));
    }

    @Test
    public void hundredToRomanNumeral() {
        assertEquals("C", romanNumeral.convertNumber(100));
    }

    @Test
    public void thousandToRomanNumeral() {
        assertEquals("M", romanNumeral.convertNumber(1000));
    }

    @Test
    public void twoThousandToRomanNumeral() {
        assertEquals("M", romanNumeral.convertNumber(1000));
    }
}
