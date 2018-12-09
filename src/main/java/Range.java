public class Range {

    public boolean startWithInclude(String input) {
        return input.startsWith("[");
    }

    public int getStartNumber(String input) {
        if(startWithInclude(input)) {
            return input.charAt(1) - 48;
        }
        return input.charAt(1) - 47;
    }

    public boolean endWithInclude(String input) {
        return input.endsWith("]");
    }

    public int getEndNumber(String input) {
        if(endWithInclude(input)) {
            return input.charAt(3) - 48;
        }
        return input.charAt(3) - 49;
    }

    public String memberOf(String input) {
        int start = getStartNumber(input);
        int end = getEndNumber(input);
        StringBuilder resultBuilder = new StringBuilder();
        for (int i = start; i <= end ; i++) {
            resultBuilder.append(i).append(",");
        }
        String result = resultBuilder.toString();
        return result.substring(0, result.length()-1);
    }
}
