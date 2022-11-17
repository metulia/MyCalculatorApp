package ui;

import java.text.DecimalFormat;

import model.Calculator;
import model.Operator;

public class CalculatorPresenter {

    private final CalculatorView view;
    private final Calculator calculator;
    private DecimalFormat decimalFormat = new DecimalFormat();
    private double argOne;
    private Double argTwo;
    private Operator selectedOperator;

    public CalculatorPresenter(CalculatorView view, Calculator calculator) {
        this.view = view;
        this.calculator = calculator;
    }

    public void onDigitPressed(int digit) {

        if (argTwo == null) {
            argOne = argOne * 10 + digit;
            showFormatted(argOne);
        } else {
            argTwo = argTwo * 10 + digit;
            showFormatted(argTwo);
        }
    }

    public void onOperatorPressed(Operator operator) {
        if (selectedOperator != null) {
            argOne = calculator.calculate(argOne, argTwo, selectedOperator);
            showFormatted(argOne);
        }
        argTwo = 0.0;
        selectedOperator = operator;
    }

    public void onDotPressed() {
    }

    public void onResultPressed() {
        if (selectedOperator != null) {
            argOne = calculator.calculate(argOne, argTwo, selectedOperator);
            showFormatted(argOne);
        }
        argTwo = 0.0;
    }

    private void showFormatted(double value) {
        view.showResult(decimalFormat.format(value));
    }

    public void onDelPressed() {
        argOne = 0.0;
    }
}
