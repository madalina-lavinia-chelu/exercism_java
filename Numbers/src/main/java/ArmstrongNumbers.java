public class ArmstrongNumbers {
    boolean isArmstrongNumber(int numberToCheck) {

        long count = Integer.toString(numberToCheck).length();

        double sum = Integer.toString(numberToCheck)
                .chars()
                .map(Character::getNumericValue)
                .mapToDouble(e -> Math.pow(e,count))
                .sum();
        return (int)sum == numberToCheck;
    }

}
