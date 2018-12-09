import org.junit.Test;

import static org.junit.Assert.*;

public class RangeTest {

    @Test public void
    member_of_range() {
        Range range = new Range();
        assertEquals("1,2,3,4,5", range.memberOf("[1,5]"));
        assertEquals("1,2,3,4", range.memberOf("[1,5)"));
        assertEquals("2,3,4,5", range.memberOf("(1,5]"));
        assertEquals("2,3,4", range.memberOf("(1,5)"));
    }

    @Test public void
    get_end_number_with_exclude() {
        Range range = new Range();
        int actualNumber
                = range.getEndNumber("[1,5)");
        assertEquals(4, actualNumber);
    }

    @Test public void
    get_end_number_with_include() {
        Range range = new Range();
        int actualNumber
                = range.getEndNumber("[1,5]");
        assertEquals(5, actualNumber);
    }

    @Test public void
    end_with_exclude() {
        Range range = new Range();
        assertFalse(range.endWithInclude("[1,5)"));
    }

    @Test public void
    end_with_include() {
        Range range = new Range();
        assertTrue(range.endWithInclude("[1,5]"));
    }

    @Test public void
    get_start_number_with_exclude() {
        Range range = new Range();
        int actualNumber
                = range.getStartNumber("(1,5]");
        assertEquals(2, actualNumber);
    }

    @Test public void
    get_start_number_with_include() {
        Range range = new Range();
        int actualNumber
                = range.getStartNumber("[1,5]");
        assertEquals(1, actualNumber);
    }

    @Test public void
    start_with_include() {
        Range range = new Range();
        assertTrue(range.startWithInclude("[1,5]"));
    }

    @Test public void
    start_with_exclude() {
        Range range = new Range();
        assertFalse(range.startWithInclude("(1,5]"));
    }

}