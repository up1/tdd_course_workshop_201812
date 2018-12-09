import org.junit.Test;

import static org.junit.Assert.*;

public class HelloTest {

    @Test
    public void success_with_sayHi_should_return_Hello_Java() {
        Hello hello = new Hello();
        String actualMessage = hello.sayHi();
        assertEquals("Hello Java", actualMessage);
    }

}