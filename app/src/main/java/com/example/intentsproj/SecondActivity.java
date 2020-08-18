package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    EditText e1,e2;
    private TextView txtAns;
    private Button add;
    private Button sub;
    private Button multi;
    private Button dev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        String number1 = getIntent().getStringExtra("Value1");
        String number2 = getIntent().getStringExtra("Value2");

        e1 = (EditText)findViewById(R.id.num1);
        e2 = (EditText)findViewById(R.id.num2);

        e1.setText(number1);
        e2.setText(number2);

        txtAns= findViewById(R.id.textView_result);
        add = findViewById(R.id.addition);
        sub = findViewById(R.id.sub);
        multi = findViewById(R.id.multiplication);
        dev = findViewById(R.id.devision);



        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int n1 = Integer.parseInt(e1.getText().toString());
                int n2 = Integer.parseInt(e2.getText().toString());

                int sum = n1 + n2;

                txtAns.setText(String.valueOf(n1)+" + "+String.valueOf(n2)+" = "+String.valueOf(sum));
            }
        });
                sub.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {


                        int n1 = Integer.parseInt(e1.getText().toString());
                        int n2 = Integer.parseInt(e2.getText().toString());

                        int subtraction = n1 - n2;

                        txtAns.setText(String.valueOf(n1)+" - "+String.valueOf(n2)+" = "+String.valueOf(subtraction));
                    }
                });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int n1 = Integer.parseInt(e1.getText().toString());
                int n2 = Integer.parseInt(e2.getText().toString());

                int multiplication = n1 * n2;

                txtAns.setText(String.valueOf(n1)+" * "+String.valueOf(n2)+" = "+String.valueOf(multiplication));
            }
        });
        dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int n1 = Integer.parseInt(e1.getText().toString());
                int n2 = Integer.parseInt(e2.getText().toString());

                int devi = n1 / n2; //devision

                txtAns.setText(String.valueOf(n1)+" / "+String.valueOf(n2)+" = "+String.valueOf(devi));
            }
        });
    }
}