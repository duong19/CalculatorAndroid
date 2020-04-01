package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView;
    Button btnChange, btnC, btnCE, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnBS, btnAdd, btnSub, btnDiv, btnMul, btnEqual;
    Integer opInt1, opInt2;
    boolean add = false, mul = false, div = false, sub = false;
    boolean op1 = false, op2 = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text);
        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/DS-DIGI.TTF");
        textView.setTypeface(tf);

        this.btnAdd = findViewById(R.id.add);
        this.btnDiv = findViewById(R.id.div);
        this.btnSub = findViewById(R.id.sub);
        this.btnMul = findViewById(R.id.mul);
        this.btnEqual = findViewById(R.id.equal);
        this.btnChange = findViewById(R.id.change);
        this.btnC = findViewById(R.id.c);
        this.btnCE = findViewById(R.id.ce);
        this.btnBS = findViewById(R.id.bs);

        this.btn0 = findViewById(R.id.num0);
        this.btn1 = findViewById(R.id.num1);
        this.btn2 = findViewById(R.id.num2);
        this.btn3 = findViewById(R.id.num3);
        this.btn4 = findViewById(R.id.num4);
        this.btn5 = findViewById(R.id.num5);
        this.btn6 = findViewById(R.id.num6);
        this.btn7 = findViewById(R.id.num7);
        this.btn8 = findViewById(R.id.num8);
        this.btn9 = findViewById(R.id.num9);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btnChange.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnAdd.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnEqual.setOnClickListener(this);
        btnBS.setOnClickListener(this);
        btnCE.setOnClickListener(this);
        btnC.setOnClickListener(this);



    }
    @Override
    public void onClick(View v){
        if(v.getId() == btnChange.getId()){
            System.out.println("l");
            if(textView.getText() != "" ){
                Integer temp = Integer.parseInt(textView.getText().toString());
                System.out.println(temp);
                textView.setText(String.valueOf((0 - temp)));
            }
        }
        if(v.getId() == btn0.getId()){
            textView.setText(textView.getText() + "0");
        }
        if(v.getId() == btn1.getId()) {
            if(textView.getText() == "0"){
            }
            textView.setText(textView.getText() + "1");
        }

        if(v.getId() == btn2.getId()) {
            textView.setText(textView.getText() + "2");
        }

        if(v.getId() == btn3.getId()) {
            textView.setText(textView.getText() + "3");
        }

        if(v.getId() == btn4.getId()) {
            textView.setText(textView.getText() + "4");
        }

        if(v.getId() == btn5.getId()) {
            textView.setText(textView.getText() + "5");
        }

        if(v.getId() == btn6.getId()) {
            textView.setText(textView.getText() + "6");
        }

        if(v.getId() == btn7.getId()) {
            textView.setText(textView.getText() + "7");
        }

        if(v.getId() == btn8.getId()) {
            textView.setText(textView.getText() + "8");
        }

        if(v.getId() == btn9.getId()) {
            textView.setText(textView.getText() + "9");
        }

        if(v.getId() == btnAdd.getId()){
            if(textView.getText() != ""){
                add = true;
                op1 = true;
                this.opInt1 = Integer.parseInt(textView.getText().toString());
                this.textView.setText(null);
            }

        }
        if(v.getId() == btnMul.getId()){
            if(textView.getText() != ""){
                mul = true;
                op1 = true;
                this.opInt1 = Integer.parseInt(textView.getText().toString());
                this.textView.setText(null);
            }
        }
        if(v.getId() == btnSub.getId()){
            if(textView.getText() != ""){
                sub = true;
                op1 = true;
                this.opInt1 = Integer.parseInt(textView.getText().toString());
                this.textView.setText(null);
            }
        }
        if(v.getId() == btnDiv.getId()){
            if(textView.getText() != ""){
                div = true;
                op1 = true;
                this.opInt1 = Integer.parseInt(textView.getText().toString());
                this.textView.setText(null);
            }
        }
        if(v.getId() == btnEqual.getId()){
            if(textView.getText() != ""){
                if(add && op1){
                    op2 = true;
                    opInt2 = Integer.parseInt(textView.getText().toString());
                    Integer res = opInt1 + opInt2;
                    textView.setText(String.valueOf(res));
                    add = false;
                }else if(mul && op1){
                    op2 = true;
                    opInt2 = Integer.parseInt(textView.getText().toString());
                    Integer res = opInt1*opInt2;
                    textView.setText(String.valueOf(res));

                    mul = false;
                }else if(sub && op1){
                    op2 = true;
                    opInt2 = Integer.parseInt(textView.getText().toString());
                    Integer res = opInt1 - opInt2;
                    textView.setText(String.valueOf(res));
                    sub = false;
                }else if(div && op1){
                    op2 = true;
                    opInt2 = Integer.parseInt(textView.getText().toString());
                    System.out.println("h");
                    Integer res = opInt1/opInt2;
                    textView.setText(String.valueOf(res));
                    div = false;
                }
            }else{
                if(op1){
                    textView.setText(String.valueOf(opInt1));
                }
            }
        }
        if(v.getId() == btnC.getId()){
            textView.setText(null);
            add = false;
            mul = false;
            sub = false;
            div = false;
            op1 = op2 = false;
        }

        if(v.getId() == btnBS.getId()){
            if(textView.getText().length() <= 1){
                textView.setText(null);
            }else{
                String temp = textView.getText().toString();
                textView.setText(temp.substring(0, temp.length()-1));
            }
        }

        if(v.getId() == btnCE.getId()){
            if(op2){
                textView.setText(null);
                op2 = false;
            }else{
                textView.setText(null);
                op1 = false;
            }
        }
    }
}
