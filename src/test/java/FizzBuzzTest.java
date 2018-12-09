import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test public void
    should_say_HELLO() {
        assertEquals("HELLO", fizzBuzz.say(7));
    }

    @Test public void
    should_say_original() {
        assertEquals("1", fizzBuzz.say(1));
        assertEquals("2", fizzBuzz.say(2));
    }

    @Test public void
    should_say_Fizz() {
        assertEquals("Fizz", fizzBuzz.say(3));
        assertEquals("Fizz", fizzBuzz.say(6));
        assertEquals("Fizz", fizzBuzz.say(9));
    }

    @Test public void
    should_say_Buzz() {
        assertEquals("Buzz", fizzBuzz.say(5));
        assertEquals("Buzz", fizzBuzz.say(10));
    }

    @Test public void
    should_say_FizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzz.say(15));
    }

}