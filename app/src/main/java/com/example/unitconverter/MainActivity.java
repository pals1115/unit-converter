package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.text);
        editText = findViewById(R.id.number);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)  {
                String s = editText.getText().toString();
                if (!s.isEmpty()) {
                    // Handle the case where the input is not empty
                    try {
                        int kg = Integer.parseInt(s);
                        double pound = 2.205 * kg;
                        textView.setText("The value in pounds: " + pound);
                    } catch (NumberFormatException e) {
                        // Handle the case where the input is not a valid integer
                        textView.setText("Please enter a valid number");
                    }
                } else {
                    // Handle the case where the input is empty
                    textView.setText("Please enter a number");
                }
            }
        });
    }
}
