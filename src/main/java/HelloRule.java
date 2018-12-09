public class HelloRule implements XRule {
    public boolean check(int input) {
        return input == 7;
    }

    public String say() {
        return "HELLO";
    }
}
