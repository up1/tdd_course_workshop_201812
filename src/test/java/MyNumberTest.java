import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

class SpyRandom implements IRandom {
    private boolean called;
    public int nextInt() {
        this.called = true;
        return 0;
    }
    public boolean verify() {
        return this.called;
    }
}
public class MyNumberTest {
    @Test public void should_call_nextInt() {
        SpyRandom spyRandom = new SpyRandom();
        MyNumber myNumber = new MyNumber();
        myNumber.setRandom(spyRandom);
        myNumber.get();
        assertTrue("ไม่เรียกนะ", spyRandom.verify());
    }

    @Test public void
    should_random_number_5() {
        IRandom stubRandom = new StubRandom5();
        MyNumber myNumber = new MyNumber();
        myNumber.setRandom(stubRandom);
        assertEquals(5, myNumber.get());
    }

}

class StubRandom5 implements IRandom {
    public int nextInt() {
        return 5;
    }
}