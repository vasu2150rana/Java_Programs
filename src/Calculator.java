public class Calculator {
    public double num1;
    public double num2;

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        double sum = num1 + num2;
        return sum;
    }

    public double subtract() {
        double difference = num1 - num2;
        return difference;
    }

    public double multiply() {
        double product = num1 * num2;
        return product;
    }

    public double divide() {
        if (num2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        double quotient = num1 / num2;
        return quotient;
    }
}