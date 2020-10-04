package com.example.mycaluclator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button15, button16,button17,button12,button13,button14,button3,button4,button11,button9,button8,button7,button6,button10,button19,button18,button2,button5;
    Button button;
    EditText ed1;
    float Res1,Res2;
    boolean Add,Sub,Div,Mul,Mod;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button15 = (Button)findViewById(R.id.button15);
        button16 = (Button)findViewById(R.id.button16);
        button17 = (Button)findViewById(R.id.button17);
        button12 = (Button)findViewById(R.id.button12);
        button13 = (Button)findViewById(R.id.button13);
        button14 = (Button)findViewById(R.id.button14);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button11 = (Button)findViewById(R.id.button11);
        button19 = (Button)findViewById(R.id.button19);
        button9 = (Button)findViewById(R.id.button9);
        button8 = (Button)findViewById(R.id.button8);
        button7 = (Button)findViewById(R.id.button7);
        button6 = (Button)findViewById(R.id.button6);
        button10 = (Button)findViewById(R.id.button10);
        button18 = (Button)findViewById(R.id.button18);
        button = (Button)findViewById(R.id.button);
        button5 = (Button)findViewById(R.id.button5);
        button2 = (Button)findViewById(R.id.button2);
        ed1 = (EditText)findViewById(R.id.editTextTextPersonName);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"1");
            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"2");
            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"3");
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"4");
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"5");
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"6");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"7");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"8");
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"9");
            }
        });
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"0");
            }
        });
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+".");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1==null){
                    ed1.setText("");
                }else{
                    Res1=Float.parseFloat(ed1.getText()+"");
                    Add = true;
                    ed1.setText(null);
                }
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1==null){
                    ed1.setText("");
                }else{
                    Res1=Float.parseFloat(ed1.getText()+"");
                    Sub = true;
                    ed1.setText(null);
                }
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1==null){
                    ed1.setText("");
                }else{
                    Res1=Float.parseFloat(ed1.getText()+"");
                    Mul = true;
                    ed1.setText(null);
                }
            }
        });button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1==null){
                    ed1.setText("");
                }else{
                    Res1=Float.parseFloat(ed1.getText()+"");
                    Div = true;
                    ed1.setText(null);
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1==null){
                    ed1.setText("");
                }else{
                    Res1=Float.parseFloat(ed1.getText()+"");
                    Mod = true;
                    ed1.setText(null);
                }
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Res2=Float.parseFloat(ed1.getText()+"");
                if (Add==true){
                    ed1.setText(Res1 + Res2 +"");
                    Add= false;
                }
                if (Sub==true){
                    ed1.setText(Res1 - Res2 +"");
                    Sub= false;
                }
                if (Mul==true){
                    ed1.setText(Res1 * Res2 +"");
                    Mul= false;
                }
                if (Div==true){
                    ed1.setText(Res1 / Res2 +"");
                    Div= false;
                }
                if (Mod==true){
                    ed1.setText(Res1 % Res2 +"");
                    Mod= false;
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("");
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("");
            }

        });
    }
}