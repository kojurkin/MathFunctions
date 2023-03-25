package org.example;

public class Sum <T extends RealArgumentFunction> implements Functional<T>{

    private final double right;
    private final double left;

    public Sum(double left, double right) {
        if(right > left) {
            this.right = right;
            this.left = left;
        } else {
            this.right = left;
            this.left = right;
        }
    }
    @Override
    public double calculate(T function) {
        return (function.getResult(function.getRight()) + function.getResult(function.getLeft()) + function.getResult(((function.getLeft() + function.getRight()) / 2)));
    }
}
