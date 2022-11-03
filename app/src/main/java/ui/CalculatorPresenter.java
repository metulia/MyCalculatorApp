package ui;

import model.Calculator;
import model.Operator;

public class CalculatorPresenter {

    private CalculatorView view;
    private Calculator calculator;

    public CalculatorPresenter(CalculatorView view, Calculator calculator) {
        this.view = view;
        this.calculator = calculator;
    }

    public void onDigitPressed (int digit) {

    }

    public void onOperatorPressed(Operator operator) {
    }

    public void onDotPressed() {
    }
}
