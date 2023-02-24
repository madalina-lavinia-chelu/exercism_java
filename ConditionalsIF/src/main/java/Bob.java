public class Bob {



    public String hey(String s) {

        if(s.toUpperCase().equals(s) && s.contains("?"))
            return "Calm down, I know what I'm doing!";
        else if(s.toUpperCase().equals(s))
            return "Whoa, chill out!";
        else if(s.contains("?"))
            return "Sure.";
        else if(! s.contains("?") && !s.toUpperCase().equals(s) )
        else return "Whatever.";
    }
}
