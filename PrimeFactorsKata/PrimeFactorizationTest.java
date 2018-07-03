package PrimeFactorsKata;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeFactorizationTest {

    private PrimeFactorization pf = new PrimeFactorization();

    @Test
    public void primeFactorsOne(){
        List<Integer> expectedOutput = new ArrayList();
        assertEquals(expectedOutput, pf.calculate(1));
    }

    @Test
    public void primeFactorsTwo(){
        List<Integer> expectedOutput = new ArrayList(Arrays.asList(2));
        assertEquals(expectedOutput, pf.calculate(2));
    }
    @Test
    public void primeFactorsThree(){
        List<Integer> expectedOutput = new ArrayList(Arrays.asList(3));
        assertEquals(expectedOutput, pf.calculate(3));
    }

    @Test
    public void primeFactorsFour(){
        List<Integer> expectedOutput = new ArrayList(Arrays.asList(2,2));
        assertEquals(expectedOutput, pf.calculate(4));
    }

    @Test
    public void primeFactorsFive(){
        List<Integer> expectedOutput = new ArrayList(Arrays.asList(5));
        assertEquals(expectedOutput, pf.calculate(5));
    }

    @Test
    public void primeFactorsSix(){
        List<Integer> expectedOutput = new ArrayList(Arrays.asList(2,3));
        assertEquals(expectedOutput, pf.calculate(6));
    }

    @Test
    public void primeFactorsSeven(){
        List<Integer> expectedOutput = new ArrayList(Arrays.asList(7));
        assertEquals(expectedOutput, pf.calculate(7));
    }

    @Test
    public void primeFactorsEight(){
        List<Integer> expectedOutput = new ArrayList(Arrays.asList(2,2,2));
        assertEquals(expectedOutput, pf.calculate(8));
    }
    @Test
    public void primeFactorsNine(){
        List<Integer> expectedOutput = new ArrayList(Arrays.asList(3,3));
        assertEquals(expectedOutput, pf.calculate(9));
    }

    @Test
    public void primeFactorsEleven(){
        List<Integer> expectedOutput = new ArrayList(Arrays.asList(11));
        assertEquals(expectedOutput, pf.calculate(11));
    }
    @Test
    public void primeFactors27(){
        List<Integer> expectedOutput = new ArrayList(Arrays.asList(3,3,3));
        assertEquals(expectedOutput, pf.calculate(27));
    }

}
