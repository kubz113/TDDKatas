package PrimeFactorsKata;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorization {

    public List<Integer> calculate(int n) {
        List<Integer> currentPrimeFactors = new ArrayList<>();

        if (n == 1) {
            return currentPrimeFactors;
        }
        int nonPrimeFactor = n;
        while(nonPrimeFactor%2==0){
            nonPrimeFactor=nonPrimeFactor/2;
            currentPrimeFactors.add(2);
        }

        for(int i = 3; i<Math.sqrt(n)+1; i+=2){
            while(nonPrimeFactor%i==0){
                nonPrimeFactor=nonPrimeFactor/i;
                currentPrimeFactors.add(i);
            }
        }

        if(currentPrimeFactors.isEmpty()){
            currentPrimeFactors.add(n);
        }

        return currentPrimeFactors;
    }
}
