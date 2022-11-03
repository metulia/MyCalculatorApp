package ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mycalculatorapp.R;

import java.util.HashMap;
import java.util.Map;

import model.CalculatorImpl;

public class MainActivity extends AppCompatActivity implements CalculatorView {

    private Button resultTxt;

    private CalculatorPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTxt = findViewById(R.id.outcome);

        presenter = new CalculatorPresenter(this, new CalculatorImpl());

        Map<Integer, Integer> digits = new HashMap<>();
        digits.put(R.id.one, 1);
        digits.put(R.id.two, 2);
        digits.put(R.id.three, 3);
        digits.put(R.id.four, 4);
        digits.put(R.id.five, 5);
        digits.put(R.id.six, 6);
        digits.put(R.id.seven, 7);
        digits.put(R.id.eight, 8);
        digits.put(R.id.nine, 9);
        digits.put(R.id.zero, 0);

        View.OnClickListener digitClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.onDigitPressed(digits.get(view.getId()));
            }
        };

        findViewById(R.id.one).setOnClickListener(digitClickListener);
        findViewById(R.id.two).setOnClickListener(digitClickListener);
        findViewById(R.id.three).setOnClickListener(digitClickListener);
        findViewById(R.id.four).setOnClickListener(digitClickListener);
        findViewById(R.id.five).setOnClickListener(digitClickListener);
        findViewById(R.id.six).setOnClickListener(digitClickListener);
        findViewById(R.id.seven).setOnClickListener(digitClickListener);
        findViewById(R.id.eight).setOnClickListener(digitClickListener);
        findViewById(R.id.nine).setOnClickListener(digitClickListener);
        findViewById(R.id.zero).setOnClickListener(digitClickListener);

    }

    @Override
    public void showResult(String result) {
        resultTxt.setText(result);
    }
}