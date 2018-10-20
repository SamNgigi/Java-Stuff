import java.io.Console;
import java.util.List;

public class App {
    public static void main(String[] args) {
        /* Printing welcome message */
        System.out.println("Welcome to FizzBuzz! Enter a number:");
        /* Capturing user input from the terminal*/
        Console my_terminal = System.console();
        String user_number = my_terminal.readLine();
        /* Converting default String input into int */
        int user_int = Integer.parseInt(user_number);
        /* Instantiating a fizzbuzz object */
        FizzBuzz fizzbuzz_object = new FizzBuzz();
        /*
        * Calling the runFizzBuzz method on our instance and assigning result value to
        * fizzbuzz_result.
        * */
        List<Object> fizzbuzz_result = fizzbuzz_object.runFizzBuzz(user_int);
        /* Printing out the result to the terminal */
        System.out.println("\nYour output:");
        /* For loop without index. Pre java8 for-each loop */
        for (Object i: fizzbuzz_result){
            System.out.println(i);
        }
    }
}