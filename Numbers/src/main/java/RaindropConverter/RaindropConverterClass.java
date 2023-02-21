package RaindropConverter;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class RaindropConverterClass {
    private final Map <Integer, String > mapM = new HashMap <Integer,String>(
            Map.of(3, "Pling", 5, "Plang", 7, "Plong")
    );
    String convert(int number) {
        StringBuilder sb = new StringBuilder();
        mapM.forEach((k, v)->{
            if(number % k == 0 ){
                sb.append(v);
            }
        });
        return sb.length() > 0 ? sb.toString() : String.valueOf(number);

    }
}
