package com.example.jacob.acalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String txtAnswer, calculationTxt, runningNumberTxt = "";
    double currentAnswer = 0, temp1 = 0, temp2 = 0;
    TextView resultView, calculationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialising buttons and textView
        resultView = (TextView)findViewById(R.id.resultView);
        calculationView = (TextView)findViewById(R.id.calculationsView);

        Button btn0 = (Button)findViewById(R.id.btn0);
        Button btn1 = (Button)findViewById(R.id.btn1);
        Button btn2 = (Button)findViewById(R.id.btn2);
        Button btn3 = (Button)findViewById(R.id.btn3);
        Button btn4 = (Button)findViewById(R.id.btn4);
        Button btn5 = (Button)findViewById(R.id.btn5);
        Button btn6 = (Button)findViewById(R.id.btn6);
        Button btn7 = (Button)findViewById(R.id.btn7);
        Button btn8 = (Button)findViewById(R.id.btn8);
        Button btn9 = (Button)findViewById(R.id.btn9);
        Button clearBtn = (Button)findViewById(R.id.clearBtn);

        ImageButton addBtn = (ImageButton)findViewById(R.id.addBtn);
        ImageButton subtractBtn = (ImageButton)findViewById(R.id.subtractBtn);
        ImageButton divideBtn = (ImageButton)findViewById(R.id.divideBtn);
        ImageButton timesBtn = (ImageButton)findViewById(R.id.timesBtn);
        ImageButton equalBtn = (ImageButton)findViewById(R.id.equalBtn);

        resultView.setText("");
        calculationView.setText("0");

        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentAnswer = 0;
//                int convertToInt = currentAnswer;
//                txtAnswer = String.valueOf(convertToInt);
                calculationView.setText(txtAnswer);
                resultView.setText("");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(0);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(2);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(3);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(4);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(5);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(6);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(7);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(8);
            }
        });
        
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(9);
            }
        });
        
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorPressed("+");
            }
        });
        
        subtractBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorPressed("-");
            }
        });
        
        timesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorPressed("*");
            }
        });

        divideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorPressed("/");
            }
        });

    }
     private void showAnswer(int answer){
         txtAnswer = String.valueOf(answer);
         resultView.setText(txtAnswer);
     }

    private void showCalculation(String calculationTxt){
        calculationView.setText(calculationTxt);
    }

    private void numberPressed(int number){
        runningNumberTxt += String.valueOf(number);
        calculationView.setText(runningNumberTxt);
    }

    private void operatorPressed(String operator){
        runningNumberTxt += operator;
        calculationView.setText(runningNumberTxt);
    }

}
