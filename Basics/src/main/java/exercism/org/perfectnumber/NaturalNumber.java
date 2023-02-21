
package exercism.org.perfectnumber;
public class NaturalNumber {
    public int n;

    public NaturalNumber(int n){
        if (n <= 0) {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");

        }
        this.n = n;

    }

    public Classification getClassification() {
        Integer sum = 0;
        for(int i = 1; i <= n/2; i++){
            if(n % i == 0)
                sum = sum + i;
        }
        if(sum > n)
        {
            return Classification.ABUNDANT;
        }
        else if(sum == n)
            {
                return Classification.PERFECT;
            }
            else
                {
                    return Classification.DEFICIENT;
                }

    }
}

