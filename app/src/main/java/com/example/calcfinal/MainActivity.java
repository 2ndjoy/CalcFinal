package com.example.calcfinal;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button btnOne,btnTwo,btnThree,btnFour,btnFive,btnSix,btnSeven,btnEight,btnNine,btnZero,btnAC,btnDEL,
            btnDivide,btnMulti,btnMinus,btnPlus,btnEqual,btnDot;

    private TextView textviewResult,textviewHistory;

    private String number=null;


    double firstNumber=0;
    double lastNumber=0;

    String status=null;
    boolean operator=false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btnZero=findViewById(R.id.btnZero);
        btnOne=findViewById(R.id.btnOne);
        btnTwo=findViewById(R.id.btnTwo);
        btnThree=findViewById(R.id.btnThree);
        btnFour=findViewById(R.id.btnFour);
        btnFive=findViewById(R.id.btnFive);
        btnSix=findViewById(R.id.btnSix);
        btnSeven=findViewById(R.id.btnSeven);
        btnEight=findViewById(R.id.btnEight);
        btnNine=findViewById(R.id.btnNine);


        btnAC=findViewById(R.id.btnAC);
        btnDEL=findViewById(R.id.btnDEL);
        btnEqual=findViewById(R.id.btnEqual);
        btnDot=findViewById(R.id.btnDot);


        btnPlus=findViewById(R.id.btnPlus);
        btnMinus=findViewById(R.id.btnMinus);
        btnMulti=findViewById(R.id.btnMulti);
        btnDivide=findViewById(R.id.btnDivide);

        textviewResult=findViewById(R.id.textviewResult);
        textviewHistory=findViewById(R.id.textviewHistory);

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberClick("0");
            }
        });
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberClick("1");
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberClick("2");
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberClick("3");
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberClick("4");
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberClick("5");
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberClick("6");
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberClick("7");
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberClick("8");
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberClick("9");
            }
        });


        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnDEL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operator){
                    if (status=="multiplication"){
                        multiply();
                    } else if (status=="division") {
                        divide();
                    } else if (status=="subtraction") {
                        minus();
                    }else {
                        plus();
                    }
                }
                status="sum";
                operator=false;
                number=null;
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operator){
                    if (status=="multiplication"){
                        multiply();
                    } else if (status=="division") {
                        divide();
                    } else if (status=="sum") {
                        plus();
                    }else {
                        minus();
                    }
                }
                status="subtraction";
                operator=false;
                number=null;
            }
        });
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operator){
                    if (status=="sum"){
                        plus();
                    } else if (status=="division") {
                        divide();
                    } else if (status=="subtraction") {
                        minus();
                    }else {
                        multiply();
                    }
                }
                status="multiplication";
                operator=false;
                number=null;
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operator){
                    if (status=="sum"){
                        plus();
                    } else if (status=="multiplication") {
                        multiply();
                    } else if (status=="subtraction") {
                        minus();
                    }else {
                        divide();
                    }
                }
                status="division";
                operator=false;
                number=null;
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



    }
    public void numberClick(String view){
        if (number==null){
            number=view;
        }
        else {
            number=number+view;
        }
        textviewResult.setText(number);
        operator=true;
    }

    public void plus(){
        lastNumber=Double.parseDouble(textviewResult.getText().toString());
        firstNumber=firstNumber+lastNumber;
        textviewResult.setText(""+firstNumber);
    }

    public void minus()
    {
      if (firstNumber==0){
          firstNumber=Double.parseDouble(textviewResult.getText().toString());
      }
      else {
          lastNumber=Double.parseDouble(textviewResult.getText().toString());
          firstNumber=firstNumber-lastNumber;
      }
      textviewResult.setText(""+firstNumber);
    }
    public void multiply(){
        if (firstNumber==0){
            firstNumber=1;
            lastNumber=Double.parseDouble(textviewResult.getText().toString());
            firstNumber=firstNumber+lastNumber;

        }
        else {
            lastNumber=Double.parseDouble(textviewResult.getText().toString());
            firstNumber=firstNumber+lastNumber;

        }

        textviewResult.setText(""+firstNumber);
    }
    public void divide(){
        if (firstNumber==0){
            lastNumber=Double.parseDouble(textviewResult.getText().toString());
            firstNumber=lastNumber/1;

        }
        else {
            lastNumber=Double.parseDouble(textviewResult.getText().toString());
            firstNumber=firstNumber/lastNumber;
        }
        textviewResult.setText(""+firstNumber);

    }

}