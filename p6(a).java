class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public double add(double a, double b) {
        return a + b;
    }
    public String add(String a, String b) {
        return a + b;
    }
}
class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of two integers: " + calc.add(5, 10)); // Calls add(int, int)
        System.out.println("Sum of three integers: " + calc.add(1, 2, 3)); // Calls add(int, int, int)
        System.out.println("Sum of two doubles: " + calc.add(2.5, 3.5)); // Calls add(double, double)
        System.out.println("Concatenation of strings: " + calc.add("Hello, ", "World!")); // Calls add(String, String)
    }
}