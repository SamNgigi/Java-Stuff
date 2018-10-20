import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<Object> runFizzBuzz(int count_up_to){
        /* Without return statement we get --> error: missing return statement */
        List<Object> result = new ArrayList<Object>();
        /* Adding a loop th count up to any given number */
        for (int i = 1; i <= count_up_to; i++){
            /* For every
            * i divisible by 3 we want to return Fizz,
            * i divisible by 5 we want to return Buzz,
            * i divisible by 3 we want to return FizzBuzz.
            *
            * Note here that the order matters. We have to run i % 15 first so that our test
            * pass. Otherwise multiples of 15 will default to "Fizz" first.*/
            if (i % 15 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0){
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(i);
            }
        }
//      Returning our new array.
        return result;
    }
}