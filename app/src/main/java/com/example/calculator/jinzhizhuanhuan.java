package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class jinzhizhuanhuan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jinzhi);
        final int[] flag=new int[2];
        flag[0]=0;flag[1]=0;

        Spinner spinner = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.items, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    flag[0]=2;
                }else if(position==1){
                    flag[0]=8;
                }else if(position==2){
                    flag[0]=10;
                }else{
                    flag[0]=16;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        Spinner spinner1 = (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.items1, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    flag[1]=2;
                }else if(position==1){
                    flag[1]=8;
                }else if(position==2){
                    flag[1]=10;
                }else{
                    flag[1]=16;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        final TextView text1 = (TextView) findViewById(R.id.text1);
        final TextView text2 = (TextView) findViewById(R.id.text2);
        Button bt0=(Button)findViewById(R.id.b0);
        Button bt1=(Button)findViewById(R.id.b1);
        Button bt2=(Button)findViewById(R.id.b2);
        Button bt3=(Button)findViewById(R.id.b3);
        Button bt4=(Button)findViewById(R.id.b4);
        Button bt5=(Button)findViewById(R.id.b5);
        Button bt6=(Button)findViewById(R.id.b6);
        Button bt7=(Button)findViewById(R.id.b7);
        Button bt8=(Button)findViewById(R.id.b8);
        Button bt9=(Button)findViewById(R.id.b9);
        Button a=(Button)findViewById(R.id.a);
        Button b=(Button)findViewById(R.id.b);
        Button c=(Button)findViewById(R.id.btn_c);
        Button d=(Button)findViewById(R.id.btn_d);
        Button e=(Button)findViewById(R.id.btn_e);
        Button f=(Button)findViewById(R.id.btn_f);
        Button clea=(Button)findViewById(R.id.c);
        Button de=(Button)findViewById(R.id.bd);
        Button point=(Button)findViewById(R.id.dian);
        Button den=(Button)findViewById(R.id.deng);
        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str= text1.getText()+"0";
                text1.setText(str);
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str= text1.getText()+"1";
                text1.setText(str);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str= text1.getText()+"2";
                text1.setText(str);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str= text1.getText()+"3";
                text1.setText(str);
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str= text1.getText()+"4";
                text1.setText(str);
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str= text1.getText()+"5";
                text1.setText(str);
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str= text1.getText()+"6";
                text1.setText(str);
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str= text1.getText()+"7";
                text1.setText(str);
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str= text1.getText()+"8";
                text1.setText(str);
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str= text1.getText()+"9";
                text1.setText(str);
            }
        });
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str= text1.getText()+"A";
                text1.setText(str);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str= text1.getText()+"B";
                text1.setText(str);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str= text1.getText()+"C";
                text1.setText(str);
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str= text1.getText()+"D";
                text1.setText(str);
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str= text1.getText()+"E";
                text1.setText(str);
            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str= text1.getText()+"F";
                text1.setText(str);
            }
        });

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str= text1.getText()+"÷";
                text1.setText(str);
            }
        });
        clea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setText("");
                text2.setText("");
            }
        });
        de.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=text1.getText().toString();
                if(str.length()>=1) {
                    str = str.substring(0, str.length() - 1);
                    text1.setText(str);
                }
            }
        });
        den.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=text1.getText().toString();
                if(flag[0]==10){
                    str=Integer.toString(Integer.parseInt(str),flag[1]);
                }else{
                    if(flag[1]==10){
                        str= String.valueOf(Integer.parseInt(str,flag[0]));
                    }else{
                        str= String.valueOf(Integer.parseInt(str,flag[0]));
                        str=Integer.toString(Integer.parseInt(str),flag[1]);
                    }
                }
                text2.setText(str);
                flag[0]=0;flag[1]=0;
            }
        });

    }
}