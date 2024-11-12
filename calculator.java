// Calculator.java
public class calculator {

    // Step 1: Private fields to hold the numbers
    private double num1;
    private double num2;

    // Step 2: Default constructor (initializes to default values)
    public calculator() {
        this.num1 = 0.0;
        this.num2 = 0.0;
    }

    // Step 3: Parameterized constructor (allows initializing with specific values)
    public calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Step 4: Getter methods for controlled access to the fields
    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    // Step 5: Setter methods to modify the numbers if necessary
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    // Step 6: Arithmetic operations

    // Addition
    public double add() {
        return num1 + num2;
    }

    // Subtraction
    public double subtract() {
        return num1 - num2;
    }

    // Multiplication
    public double multiply() {
        return num1 * num2;
    }

    // Division with error checking (division by zero)
    public double divide() {
        if (num2 == 0) {
            System.out.println("Error: Division by zero");
            return Double.NaN; // Return NaN (Not a Number) to indicate an error
        }
        return num1 / num2;
    }

    // Step 7: Display current values of num1 and num2
    public void displayValues() {
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
    }
}
