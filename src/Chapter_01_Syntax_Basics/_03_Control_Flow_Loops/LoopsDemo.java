package Chapter_01_Syntax_Basics._03_Control_Flow_Loops;

public class LoopsDemo {
    public static void main(String[] args) {
        // The 'For' Loop (Counter-based)
        for (int i = 0; i < 10; i++) {
            if (i == 5) continue; // Skip the rest of this loop and go to i=6
            if (i == 8) break;    // Stop the loop entirely
            System.out.print(i + " ");
        }

        // The 'Do-While' Loop (Executes at least once)
        int x = 10;
        do {
            System.out.println("\nThis runs even though x > 5");
            x--;
        } while (x < 5);
    }
}
