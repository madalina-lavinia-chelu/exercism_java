import java.util.stream.IntStream;

public class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int sum = IntStream.rangeClosed(0,input)
                .sum();
        return sum * sum;

    }

    int computeSumOfSquaresTo(int input) {
        int sum = IntStream.rangeClosed(0,input)
                .map(i -> (int) Math.pow(i,2))
                .sum();
        return sum;
    }

    int computeDifferenceOfSquares(int input) {
        return Math.abs(computeSumOfSquaresTo(input) - computeSquareOfSumTo(input));
    }
}
