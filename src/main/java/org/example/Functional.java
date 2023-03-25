package org.example;

public interface Functional <T extends RealArgumentFunction> {
    double calculate(T function);

}
