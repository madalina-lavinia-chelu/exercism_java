package ReverseString;
import java.lang.*;

public class ReverseStringClass {
    String reverse(String inputString) {
        StringBuffer stringBuffer = new StringBuffer(inputString);
        stringBuffer.reverse();
        return stringBuffer.toString();


    }
}
