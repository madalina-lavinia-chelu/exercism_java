package phone.number;

import java.util.regex.Pattern;

public class PhoneNumber {
    String number;
    public PhoneNumber(String number) {
        this.number = number.replace(" ","")
                .replace("(","")
                .replace(")","")
                .replace("+","")
                .replace("-","")
                .replace(".","")
                .trim();

        for(char ch : this.number.toCharArray()){
            if(ch >='a' && ch <='z')
                throw new IllegalArgumentException("letters not permitted");
            if(!(ch >= '0' && ch <= '9'))
                throw new IllegalArgumentException("punctuations not permitted");

        }

        if(this.number.length() <= 9)
            throw new IllegalArgumentException("incorrect number of digits");
        if (this.number.charAt(0) == '0')
            throw new IllegalArgumentException("area code cannot start with zero");
        if (this.number.charAt(0) == '1' && this.number.length() == 10)
            throw new IllegalArgumentException("area code cannot start with one");
        if(this.number.length() >= 12)
            throw new IllegalArgumentException("more than 11 digits");





        if(this.number.length() == 11) {
            if (this.number.charAt(0) == '1' && this.number.charAt(1) == '0')
                throw new IllegalArgumentException("area code cannot start with zero");
            else if (this.number.charAt(0) == '1')
                this.number = this.number.substring(1);
            else throw new IllegalArgumentException("11 digits must start with 1");
        }

        if(this.number.charAt(0) == '0') throw new IllegalArgumentException("area code cannot start with zero");
        if(this.number.charAt(0) == '1') throw new IllegalArgumentException("area code cannot start with one");
        if(this.number.charAt(3) == '0') throw new IllegalArgumentException("exchange code cannot start with zero");
        if(this.number.charAt(3) == '1') throw new IllegalArgumentException("exchange code cannot start with one");





    }

    public String getNumber() {
        return number;
    }
}
