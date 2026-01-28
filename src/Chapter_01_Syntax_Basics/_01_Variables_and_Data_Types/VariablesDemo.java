package Chapter_01_Syntax_Basics._01_Variables_and_Data_Types;

public class VariablesDemo {
    public static void main(String[] args) {
        // 1. Declaration and Initialization
        int speed; // Declaration
        speed = 100; // Initialization

        // 2. Primitives (Fixed size in memory)
        byte smallNum = 127;          // 8-bit
        long largeNum = 15000000000L; // 64-bit (Note the 'L' suffix)
        float pi = 3.14f;             // 32-bit (Note the 'f' suffix)

        // 3. Constant (Final)
        final double GRAVITY = 9.8;
        // GRAVITY = 10.0; // This would cause a compilation error

        System.out.println("Speed is: " + speed);
    }
}
