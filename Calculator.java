package validating;

public class Calculator {

    public int factorial(int num) {
         if(num < 0){
            throw new IllegalArgumentException("You should provide positive values only");
        }

        int answer = 1;
        for (int i = 1; i <= num; i++) {
            answer *= i;
        }

        return answer;
    }

    public int binomialCoefficent(int setSize, int subsetSize) {
        if(subsetSize > setSize){
            throw new IllegalArgumentException("Subset size should not exceed form set Size");
        }

        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

        return numerator / denominator;
    }
}
