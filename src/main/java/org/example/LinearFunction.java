package org.example;

public class LinearFunction implements RealArgumentFunction{

    private double coefficientA;
    private double coefficientB;
    private double leftBound;
    private double rightBound;

    public LinearFunction(double A, double B, double left, double right) {
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
    public double getResult(double x) throws IllegalArgumentException{
        if(x < leftBound || x > rightBound) {
            throw new IllegalArgumentException("x isn`t belongs to the segment");
        } else {
            return coefficientA * x + coefficientB;
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
