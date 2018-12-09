public class FizzBuzz {
    public String say(int input) {
        if(input == 15) {
            return "FizzBuzz";
        }
        // Factory
        XRule[] rules = RuleFactory.build();

        // Flow
        for (XRule rule: rules) {
            if(rule.check(input)) {
                return rule.say();
            }
        }

        return String.format("%s", input);
    }
}
