import java.util.*;

public class Main {
    public static void main(String[] args) {
        Guess guess = new Guess();
        Printer print = new Printer();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            print.print("min value: ");
            String min = scanner.nextLine();
            if(!guess.checkGuess(min) || min.isEmpty()) {
                print.print("Wrong");
                continue;
            }
            print.print("max value: ");
            String max = scanner.nextLine();
            if(!guess.checkGuess(max) || max.isEmpty() || Integer.valueOf(max) < Integer.valueOf(min)) {
                print.print("Wrong");
                continue;
            }
            new MinMaxValue(Integer.valueOf(min), Integer.valueOf(max));
            break;
        }
        MinMaxValue minMaxValue = new MinMaxValue(MinMaxValue.getMin(), MinMaxValue.getMax());
        RandomNumber random = new RandomNumber(minMaxValue.getMin(), minMaxValue.getMax());
        int numOfTries = 0;
        while (true) {
            print.print("Enter your guess: ");
            String input = scanner.nextLine();
            if (guess.checkGuess(input) && Integer.valueOf(input) > random.getRandomNumber()) {
                print.print("Number is less than " + input);
                numOfTries++;
            } else if(guess.checkGuess(input) && Integer.valueOf(input) < random.getRandomNumber()) {
                print.print("Number is greater than " + input);
                numOfTries++;
            } else if(guess.checkGuess(input) && Integer.valueOf(input) == random.getRandomNumber()) {
                print.print("Well done");
                print.print("tries: " + numOfTries);
                break;
            } else {
                print.print("Wrong input");
            }
        }
    }
}