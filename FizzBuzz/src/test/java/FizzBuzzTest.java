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
import java.util.Collections;
import java.util.List;
import java.util.Objects;

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
    public void runFizzBuzz_countUpTo1_ArrayList(){
        /*
        * Defining our example_fizzbuzz_object of type FizzBuzz which is an instance of the
        * FizzBuzz
        * class
        * */
        FizzBuzz example_fizzbuzz_object = new FizzBuzz();
        // We define a list/array which is an instance of the ArrayList class
        List<Object> expected_result_arrList = new ArrayList<Object>();
        // We add 1 to our expected_result_arrList
        expected_result_arrList.add(1);
        /*
        * We compare if our expected_result_arrList is the same */
        assertEquals(expected_result_arrList, example_fizzbuzz_object.runFizzBuzz(1));
    }
    /* Test to confirm our runFizzBuzz method is count up. In this case to 2. */
    @Test
    public void runFizzBuzz_countUpToGivenNumber_ArrayList(){
        FizzBuzz example_fizzbuzz_object = new FizzBuzz();
        List<Object> expected_result_arrList = new ArrayList<Object>();
        expected_result_arrList.add(1);
        expected_result_arrList.add(2);
        assertEquals(expected_result_arrList, example_fizzbuzz_object.runFizzBuzz(2));
        /*
        * Here when we call the example_fizz_buzz.runFizzBuz(2) method, it will invoke our loop
        * and add all i to our result array*/
    }
    /*
    * Test to confirm that multiples of 3 will return Fizz
    * */
    @Test
    public void runFizzBuzz_replaceMultiplesOf3_ArrayList(){
        FizzBuzz example_fizzbuzz_object = new FizzBuzz();
        List<Object> expected_result_arrList = new ArrayList<Object>();
        expected_result_arrList.add(1);
        expected_result_arrList.add(2);
        expected_result_arrList.add("Fizz");
        assertEquals(expected_result_arrList, example_fizzbuzz_object.runFizzBuzz(3));
    }
    /* Test to confirm that multiples of 5 will return Buzz */
    @Test
    public void runFizzBuzz_replaceMultiplesOf5_ArrayList(){
        FizzBuzz example_fizzbuzz_object = new FizzBuzz();
        List<Object> expected_result_arrList = new ArrayList<Object>();
        /* Adding multiple objects to our ArrayList at once. */
        Collections.addAll(expected_result_arrList,
                    1, 2, "Fizz", 4, "Buzz"
                );
        assertEquals(expected_result_arrList, example_fizzbuzz_object.runFizzBuzz(5));
    }
    /* Test to confirm that multiples of both 3 & 5 will be replaced with FizzBuzz */
    @Test
    public void runFizzBuzz_replaceMultiplesOf3And5_ArrayList(){
        FizzBuzz example_fizzbuzz_object = new FizzBuzz();
        List<Object> expected_result_arrList = new ArrayList<Object>();
        Collections.addAll(expected_result_arrList,
                1, 2, "Fizz", 4, "Buzz",
                "Fizz", 7, 8, "Fizz", "Buzz",
                11, "Fizz", 13, 14, "FizzBuzz"
                );
        assertEquals(expected_result_arrList, example_fizzbuzz_object.runFizzBuzz(15));
    }
}



/*
* Note that we are trying to break our FizzBuzz functionality to the smallest component. That is
* why we are testing to see if it can return an ArrayList with a value of 1 to start
*
* We then se if it can return an ArrayList with both 1,2 even before we get to 3. This is
* because once we get to 3 we have to make a test that return an Array list with "fizz" instead of
* 3 in the ArrayList.
* */