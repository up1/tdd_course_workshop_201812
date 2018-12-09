public class RuleFactory {

    private RuleFactory() {}

    public static XRule[] build() {
        return new XRule[]{
                new BuzzRule(),
                new FizzRule(),
                new HelloRule()
        };
    }
}
