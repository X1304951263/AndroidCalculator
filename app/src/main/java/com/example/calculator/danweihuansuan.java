package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class danweihuansuan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final float[] flag=new float[2];
        flag[0]=0;flag[1]=0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.danwei);
        Spinner spinner = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.item, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    flag[0]= (float) 0.00001;
                }else if(position==1){
                    flag[0]= (float) 0.001;
                }else if(position==2){
                    flag[0]= (float) 0.01;
                }else if(position==3){
                    flag[0]= (float) 0.1;
                }else if(position==4){
                    flag[0]= (float) 1;
                }else{
                    flag[0]= (float) 10;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        Spinner spinner1 = (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.item1, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    flag[1]= (float) 0.00001;
                }else if(position==1){
                    flag[1]= (float) 0.001;
                }else if(position==2){
                    flag[1]= (float) 0.01;
                }else if(position==3){
                    flag[1]= (float) 0.1;
                }else if(position==4){
                    flag[1]= (float) 1;
                }else{
                    flag[1]= (float) 10;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        final   TextView text=(TextView)findViewById(R.id.textv1);
        final   TextView text2=(TextView)findViewById(R.id.textv2);
        Button btn0=(Button)findViewById(R.id.btn0);
        Button btn1=(Button)findViewById(R.id.btn1);
        Button btn2=(Button)findViewById(R.id.btn2);
        Button btn3=(Button)findViewById(R.id.btn3);
        Button btn4=(Button)findViewById(R.id.btn4);
        Button btn5=(Button)findViewById(R.id.btn5);
        Button btn6=(Button)findViewById(R.id.btn6);
        Button btn7=(Button)findViewById(R.id.btn7);
        Button btn8=(Button)findViewById(R.id.btn8);
        Button btn9=(Button)findViewById(R.id.btn9);
        Button dian=(Button)findViewById(R.id.point);
        Button deng=(Button)findViewById(R.id.equal);
        Button clean=(Button)findViewById(R.id.cl);
        Button del=(Button)findViewById(R.id.de);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=text.getText()+"0";
                text.setText(str);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=text.getText()+"1";
                text.setText(str);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=text.getText()+"2";
                text.setText(str);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=text.getText()+"3";
                text.setText(str);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=text.getText()+"4";
                text.setText(str);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=text.getText()+"5";
                text.setText(str);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=text.getText()+"6";
                text.setText(str);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=text.getText()+"7";
                text.setText(str);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=text.getText()+"8";
                text.setText(str);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=text.getText()+"9";
                text.setText(str);
            }
        });

        dian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=text.getText()+".";
                text.setText(str);
            }
        });
        
        clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("");
                text2.setText("");
            }
        });
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=text.getText().toString();
                if(str.length()>=1) {
                    str = str.substring(0, str.length() - 1);
                    text.setText(str);
                }
            }
        });
        deng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=text.getText().toString();
                double a= Double.parseDouble(str);
                str= String.valueOf(a*(flag[0]/flag[1]));
                text2.setText(str);
                flag[0]=0;flag[1]=0;
            }
        });
       
    }
}