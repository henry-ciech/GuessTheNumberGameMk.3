import java.util.*;

public class Guess {
    public boolean checkGuess(String input) {
        Boolean check = true;
        for(int a=0; a<input.length(); a++) {
            if(a==0 && input.charAt(a) == '-')
                continue;
            if( !Character.isDigit(input.charAt(a)))
                check=false;
        }
        return check;
    }
}