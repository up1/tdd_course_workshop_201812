import java.util.Random;

public class MyNumber {


    private IRandom random;

    public int get() {
        return random.nextInt();
    }

    public void setRandom(IRandom random) {
        this.random = random;
    }

}
