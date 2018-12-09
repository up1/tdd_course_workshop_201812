public class FizzRule implements XRule {
    public boolean check(int input) {
        return input % 3 == 0;
    }

    public String say() {
        return "Fizz";
    }
}
