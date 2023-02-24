package squeaky.clean;


import java.util.regex.Pattern;

class SqueakyClean {
    static String clean(String identifier) {
        String s = Pattern
                .compile("-(\\p{all})")
                .matcher(identifier)
                .replaceAll(e -> e.group().toUpperCase())
                .replace(" ", "_")
                .replace("-", "")
                .replaceAll("\\p{Cntrl}", "CTRL")
                .replaceAll("[0-9]", "")
                .replaceAll("[α-ω]", "")
                .replaceAll("[^\\u0000-\\uFFFF]", "");
        return s;

    }

}