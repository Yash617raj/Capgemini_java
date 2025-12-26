class calculator2 {
        // Subtraction methods
    int subtract(int a, int b) {
        return a - b;
    }

    int subtract(int a, int b, int c) {
        return a - b - c;
    }

    int subtract(int a, int b, int c, int d) {
        return a - b - c - d;
    }

    int subtract(int a, int b, int c, int d, int e) {
        return a - b - c - d - e;
    }

    // Multiplication methods
    int multiply(int a, int b) {
        return a * b;
    }

    int multiply(int a, int b, int c) {
        return a * b * c;
    }

    int multiply(int a, int b, int c, int d) {
        return a * b * c * d;
    }

    int multiply(int a, int b, int c, int d, int e) {
        return a * b * c * d * e;
    }

    // Division method
    double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero not allowed");
            return 0;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        calculator2 calc = new calculator2();

        System.out.println("Subtract 2 numbers: " + calc.subtract(20, 5));
        System.out.println("Subtract 3 numbers: " + calc.subtract(20, 5, 3));
        System.out.println("Subtract 4 numbers: " + calc.subtract(20, 5, 3, 2));
        System.out.println("Subtract 5 numbers: " + calc.subtract(20, 5, 3, 2, 1));

        System.out.println("Multiply 2 numbers: " + calc.multiply(2, 3));
        System.out.println("Multiply 3 numbers: " + calc.multiply(2, 3, 4));
        System.out.println("Multiply 4 numbers: " + calc.multiply(2, 3, 4, 5));
        System.out.println("Multiply 5 numbers: " + calc.multiply(2, 3, 4, 5, 6));

        System.out.println("Divide 2 numbers: " + calc.divide(10, 2));
    }
}
