package ui;

import model.Calculator;
import model.Operator;

public class CalculatorPresenter {

    private CalculatorView view;
    private Calculator calculator;
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
            view.showResult(String.valueOf(argOne));
        } else {
            argTwo = argTwo * 10 + digit;
            view.showResult(String.valueOf(argTwo));
        }

    }

    public void onOperatorPressed(Operator operator) {
        if (selectedOperator != null) {
            argOne = calculator.calculate(argOne, argTwo, selectedOperator);
            view.showResult(String.valueOf(argOne));
        }
        argTwo = 0.0;
        selectedOperator = operator;
    }

    public void onDotPressed() {
    }
}
