public class BuzzRule implements XRule {
    public boolean check(int input) {
        return input%5 == 0;
    }

    public String say() {
        return "Buzz";
    }
}
