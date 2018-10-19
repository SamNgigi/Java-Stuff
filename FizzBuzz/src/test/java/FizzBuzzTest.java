/*
* Importing the main JUnit library that instructs Java how to run all the testing procdures
* */
import org.junit.*;
/*
* We import the JUnit assertion library. We use the methods within this library  to confirm if
* expected values match returned values
* */
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzTest {
    /*
    * @Test
    * Every test method must begin with the @Test annotation. Annotations are marked with the
    * @ symbol and they provide extra information to the Java compiler. In this case, the @Test
    * annotation informs the compiler that JUnit is responsible for running our tests.
    *
    * Next we declare our FizzBuzzTest test method. The method always starts with public void
    *
    * The test method naming conventions are:
    *
    *  ** public void nameOfMethodToTest_behaviourDescription_expectedReturnValue() **
    *
    *  Our expected return value is an ArrayList because we will store all the numbers until our
    *  countTo value
    *
    * */
    @Test
    public void runFizzBuzz_countUpTo_ArrayList(){
        /*
        * Defining our sample_fizz_buzz object of type FizzBuzz which is an instance of the FizzBuzz
        * class
        * */
        FizzBuzz sample_fizz_buzz = new FizzBuzz();
        // We define a list/array which is an instance of the ArrayList class
        List<Object> expected_output_array = new ArrayList<Object>();
        // We add 1 to our expected_output_array
        expected_output_array.add(1);
        /*
        * We compare if our expected_output_array is the same */
        assertEquals(expected_output_array, sample_fizz_buzz.runFizzBuzz(1));
    }
}