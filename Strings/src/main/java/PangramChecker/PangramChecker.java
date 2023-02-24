package PangramChecker;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class PangramChecker {

    public boolean isPangram(String input) {

        boolean b = input.codePoints()
                .filter(Character::isLetter)
                .mapToObj(Character::toLowerCase)
                .distinct().count() == 26;
        return b;


    }


}


