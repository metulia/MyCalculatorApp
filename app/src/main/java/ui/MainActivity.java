package ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.example.mycalculatorapp.R;

public class MainActivity extends AppCompatActivity implements CalculatorView {

    private Button resultTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTxt = findViewById(R.id.outcome);
    }

    @Override
    public void showResult(String result) {
        resultTxt.setText(result);
    }
}