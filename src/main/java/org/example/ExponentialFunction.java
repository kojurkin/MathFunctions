package org.example;

public class ExponentialFunction implements RealArgumentFunction{
    private double coefficientA;
    private double coefficientB;
    private double leftBound;
    private double rightBound;
    public ExponentialFunction(double A, double B, double left, double right) {
        this.coefficientA = A;
        this.coefficientB = B;
        if(right > left) {
            this.leftBound = left;
            this. rightBound = right;
        } else {
            this.rightBound = left;
            this.leftBound = right;
        }
    }
    @Override
    public double getResult(double x) {
        if(x >= leftBound && x <= rightBound) {
            return coefficientA * Math.exp(x) + coefficientB;
        } else {
            throw new IllegalArgumentException("x isn`t belongs to the segment");
        }
    }

    @Override
    public double getLeft() {
        return leftBound;
    }

    @Override
    public double getRight() {
        return rightBound;
    }
}
