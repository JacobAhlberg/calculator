package com.example.jacob.acalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, clearBtn;
    ImageButton addBtn, subtractBtn, equalBtn, divideBtn, timeBtn;
    TextView resultView;
    String txtAnswer;
    double currentAnswer = 0;
    int temp1 = 0, temp2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialising buttons and textView
        resultView = (TextView)findViewById(R.id.resultView);
        btn0 = (Button)findViewById(R.id.btn0);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);
        clearBtn = (Button)findViewById(R.id.clearBtn);
        addBtn = (ImageButton)findViewById(R.id.addBtn);
        subtractBtn = (ImageButton)findViewById(R.id.subtractBtn);
        divideBtn = (ImageButton)findViewById(R.id.divideBtn);
        timeBtn = (ImageButton)findViewById(R.id.timesBtn);
        equalBtn = (ImageButton)findViewById(R.id.equalBtn);

        resultView.setText("0");

        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentAnswer = 0;
                int convertToInt = (int)currentAnswer;
                txtAnswer = String.valueOf(convertToInt);
                resultView.setText(txtAnswer);
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp1 = 1;
                currentAnswer = temp1;
                showAnswer(currentAnswer);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });

    }
     private void showAnswer(Double answer){
         txtAnswer = String.valueOf(answer);
         resultView.setText(txtAnswer);
     }

}
