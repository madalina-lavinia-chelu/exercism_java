package resistor.color;

import java.util.HashMap;
import java.util.Map;

public class ResistorColor {



    int colorCode(String color) {
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
        return map.get(color);
    }

    String[] colors() {
        String[] allColors ={"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        return allColors;

    }
}
