package Chapter_01_Syntax_Basics._02_Control_Flow_Conditionals;

public class ConditionalsDemo {
    public static void main(String[] args) {
        int day = 6;

        // Ternary Operator (Shorthand if-else)
        String result = (day > 5) ? "Weekend" : "Weekday";
        System.out.println("Today is a: " + result);

        // Switch Statement (Cleaner for multiple fixed values)
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 3: System.out.println("Wednesday"); break;
            default: System.out.println("Other day");
        }
    }
}
