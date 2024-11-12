// Main.java
public class main {
    public static void main(String[] args) {

        // Create a Calculator object using the default constructor
        calculator calc1 = new calculator();
        System.out.println("Using default constructor:");
        calc1.displayValues();
        System.out.println("Addition: " + calc1.add());
        System.out.println("Subtraction: " + calc1.subtract());
        System.out.println("Multiplication: " + calc1.multiply());
        System.out.println("Division: " + calc1.divide());

        System.out.println("\n-------------------------------\n");

        // Create a Calculator object using the parameterized constructor
        calculator calc2 = new calculator(10.0, 5.0);
        System.out.println("Using parameterized constructor:");
        calc2.displayValues();
        System.out.println("Addition: " + calc2.add());
        System.out.println("Subtraction: " + calc2.subtract());
        System.out.println("Multiplication: " + calc2.multiply());
        System.out.println("Division: " + calc2.divide());

        System.out.println("\n-------------------------------\n");

        // Testing division by zero
        calculator calc3 = new calculator(10.0, 0.0);
        System.out.println("Testing division by zero:");
        calc3.displayValues();
        System.out.println("Division: " + calc3.divide());
    }
}
