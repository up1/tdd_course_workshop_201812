public class CircularBuffer {

    private String[] buffer;
    private int writePointer;
    private int readPointer;

    public int getCapacity() {
        return this.buffer.length;
    }

    public void setCapacity(int capacity) {
        this.buffer = new String[capacity];
    }

    public void write(String input) {
        this.buffer[this.writePointer++] = input;
    }

    public String read() {
        if(isEmpty()){
            throw new ReadEmptyBufferException();
        }
        return this.buffer[this.readPointer++];
    }

    public boolean isEmpty() {
        return writePointer == readPointer;
    }
}
