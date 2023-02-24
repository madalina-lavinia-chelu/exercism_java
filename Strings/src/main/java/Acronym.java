import java.sql.Array;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Acronym {
    public String acronym;

    Acronym(String phrase) {

        acronym= Arrays.stream(phrase.split("[^a-zA-Z0-9']+"))

                .map(e -> e.substring(0,1))
                .map(String::toUpperCase)
                .collect(Collectors.joining());

    }

    String get() {
         return acronym;
    }

}
