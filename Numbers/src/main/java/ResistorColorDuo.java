import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ResistorColorDuo {
    int value(String[] colors) {
        Map <String,Integer> map  = new HashMap <>();
        map.put("black", 0);
        map.put("brown", 1);
        map.put("red", 2);
        map.put("orange", 3);
        map.put("yellow", 4);
        map.put("green", 5);
        map.put("blue", 6);
        map.put("violet", 7);
        map.put("grey", 8);
        map.put("white", 9);
        List <Integer> collect = Arrays.stream(colors)
                .map(map::get)
                .collect(Collectors.toList());
        int i = collect.stream()
                .mapToInt(Integer::intValue)
                .limit(2)
                .reduce((a, b) -> a * 10 + b)
                .orElse(0);
        return i;
    }


}
