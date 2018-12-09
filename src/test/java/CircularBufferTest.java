import org.junit.Test;

import static org.junit.Assert.*;

public class CircularBufferTest {

    CircularBuffer buffer
            = new CircularBuffer();

    @Test(expected = ReadEmptyBufferException.class)
    public void
    read_after_create_buffer_should_throw_ReadEmptyBufferException() {
        buffer.setCapacity(6);
        buffer.read();
    }


    @Test public void
    write_AB_read_AB_should_be_empty() {
        buffer.setCapacity(6);
        buffer.write("A");
        buffer.write("B");
        buffer.read();
        buffer.read();
        assertTrue("ต้องว่างนะ", buffer.isEmpty());
    }

    @Test public void
    create_new_buffer_should_be_empty() {
        buffer.setCapacity(6);
        assertTrue("ต้องว่างนะ", buffer.isEmpty());
    }

    @Test public void
    write_AB_to_buffer_should_read_AB() {
        buffer.setCapacity(6);
        buffer.write("A");
        buffer.write("B");
        assertEquals("A", buffer.read());
        assertEquals("B", buffer.read());
    }

    @Test public void
    write_A_to_buffer_should_read_A() {
        buffer.setCapacity(6);
        buffer.write("A");
        assertEquals("A", buffer.read());
    }

    @Test public void
    create_new_buffer_with_capacity_6_should_be_6() {
        buffer.setCapacity(6);

        int capacity = buffer.getCapacity();

        assertEquals(6, capacity);
    }

}