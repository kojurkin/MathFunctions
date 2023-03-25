package org.example;

public class Integrator <T extends RealArgumentFunction> implements Functional<T>{
    private final double a;
    private final double b;
    public Integrator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double calculate(T function) throws IllegalArgumentException {
        double result = 0.0;
        int counter = 100;
        double d = (b - a) / counter;
        for (int i = 0; i < counter ; i ++) {
            result += function.getResult(a + d/2 + i * d);
        }
        result *= d;
        if (result < 0) {
            return -1 * result;
        }
        return result;
    }
}
