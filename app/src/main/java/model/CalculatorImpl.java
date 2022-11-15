package model;

public class CalculatorImpl implements Calculator {
    @Override
    public double calculate(double arg1, double arg2, Operator operator) {

        switch (operator) {
            case ADDITION:
                return arg1 + arg2;

            case SUBTRACTION:
                return arg1 - arg2;

            case MULTIPLICATION:
                return arg1 * arg2;

            case DIVISION:
                return arg1 / arg2;
        }
        return 0.0;
    }
}
