package robotname;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class Robot {
    private String name = randomName();
    private static final Set <String> takenNames = new HashSet <>();

    public Robot() {
        name = generateName();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void reset(){
        takenNames.remove(name);
        name = generateName();
    }
    private char randomUppercase(){
        return (char)ThreadLocalRandom.current().nextInt('A','Z');
    }
    private int randomDigit(){
        return ThreadLocalRandom.current().nextInt(0,9);
    }

    private String randomName(){
        return String.format("%c%c%d%d%d",
                randomUppercase(),
                randomUppercase(),
                randomDigit(),
                randomDigit(),
                randomDigit()
        );
    }
    private String generateName(){
        String name;
        do{
            name = randomName();
        }while(takenNames.contains(name));
        takenNames.add(name);
        return name;
    }
}
