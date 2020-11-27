package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.function.Function;

public class MainActivity extends AppCompatActivity {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8,
            btn9, btnPunto, btnIgual, btnSuma, btnResta, btnMulti, btnDiv, btnLimpiar;
    TextView tvRes;
    double op1=0, op2=0;
    String operacion;
    boolean nueva=true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLimpiar = (Button)findViewById(R.id.bLimpiar);
        btn0 = (Button)findViewById(R.id.b0);
        btn1 = (Button)findViewById(R.id.b1);
        btn2 = (Button)findViewById(R.id.b2);
        btn3 = (Button)findViewById(R.id.b3);
        btn4 = (Button)findViewById(R.id.b4);
        btn5 = (Button)findViewById(R.id.b5);
        btn6 = (Button)findViewById(R.id.b6);
        btn7 = (Button)findViewById(R.id.b7);
        btn8 = (Button)findViewById(R.id.b8);
        btn9 = (Button)findViewById(R.id.b9);
        btnPunto = (Button)findViewById(R.id.bPunto);
        btnIgual = (Button)findViewById(R.id.bIgual);
        btnSuma = (Button)findViewById(R.id.bSuma);
        btnResta = (Button)findViewById(R.id.bResta);
        btnMulti = (Button)findViewById(R.id.bMulti);
        btnDiv = (Button)findViewById(R.id.bDiv);
        tvRes = (TextView)findViewById(R.id.tvResultado);

        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    if(op1!=0)
                        op1=op1+Double.parseDouble(tvRes.getText().toString());
                    else
                        op1=Double.parseDouble(tvRes.getText().toString());
                    operacion="suma";
                    tvRes.setText("");
                }catch(Exception err){};
            }
        });

        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    if(op1!=0)
                        op1=op1-Double.parseDouble(tvRes.getText().toString());
                    else
                        op1=Double.parseDouble(tvRes.getText().toString());
                    operacion="resta";
                    tvRes.setText("");
                }catch(Exception err){};
            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    if(op1!=0)
                        op1=op1*Double.parseDouble(tvRes.getText().toString());
                    else
                        op1=Double.parseDouble(tvRes.getText().toString());
                    operacion="multiplicacion";
                    tvRes.setText("");
                }catch(Exception err){};
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    if(op1!=0)
                        op1=op1/Double.parseDouble(tvRes.getText().toString());
                    else
                        op1=Double.parseDouble(tvRes.getText().toString());
                    operacion="division";
                    tvRes.setText("");
                }catch(Exception err){};
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nueva){tvRes.setText("");nueva=false;}
                tvRes.setText(tvRes.getText()+"7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nueva){tvRes.setText("");nueva=false;}
                tvRes.setText(tvRes.getText()+"8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nueva){tvRes.setText("");nueva=false;}
                tvRes.setText(tvRes.getText()+"9");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nueva){tvRes.setText("");nueva=false;}
                tvRes.setText(tvRes.getText()+"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nueva){tvRes.setText("");nueva=false;}
                tvRes.setText(tvRes.getText()+"5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nueva){tvRes.setText("");nueva=false;}
                tvRes.setText(tvRes.getText()+"6");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nueva){tvRes.setText("");nueva=false;}
                tvRes.setText(tvRes.getText()+"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nueva){tvRes.setText("");nueva=false;}
                tvRes.setText(tvRes.getText()+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nueva){tvRes.setText("");nueva=false;}
                tvRes.setText(tvRes.getText()+"3");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nueva){tvRes.setText("");nueva=false;}
                tvRes.setText(tvRes.getText()+"0");
            }
        });

        btnPunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nueva){tvRes.setText("");nueva=false;}
                tvRes.setText(tvRes.getText()+".");
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    op2=Double.parseDouble(tvRes.getText().toString());
                }catch(Exception err){}
                if(operacion.equals("suma")){
                    double res=op1+op2;
                    tvRes.setText(String.valueOf(res));
                    op1=op2=0;
                    operacion="";
                }else if(operacion.equals("resta")){
                    double res=op1-op2;
                    tvRes.setText(String.valueOf(res));
                    op1=op2=0;
                    operacion="";
                }else if(operacion.equals("multiplicacion")){
                    double res=op1*op2;
                    tvRes.setText(String.valueOf(res));
                    op1=op2=0;
                    operacion="";
                }else if(operacion.equals("division")){
                    double res=op1/op2;
                    tvRes.setText(String.valueOf(res));
                    op1=op2=0;
                    operacion="";
                }
                nueva=true;
            }
        });

        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op1 = 0;
                op2 = 0;
                tvRes.setText("");
            }
        });



    }




}