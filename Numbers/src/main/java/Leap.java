import java.util.stream.IntStream;

public class Leap {
    boolean isLeapYear(int year) {
        if(year % 4 == 0 && year % 100 != 0  || year % 400 == 0 ){
            return true;
        }
        else {
            return false;
        }

    }

    public int numberDivisors(int n){
        return (int) IntStream.range(1, n)
                .filter(i -> n % i == 0)
                .count();
    }
}
