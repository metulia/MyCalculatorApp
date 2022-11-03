package ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.example.mycalculatorapp.R;

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
    }

    @Override
    public void showResult(String result) {
        resultTxt.setText(result);
    }
}