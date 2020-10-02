package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getResources().getConfiguration().orientation==Configuration.ORIENTATION_LANDSCAPE){
            //如果是横屏了，在这里设置横屏的UI
            setContentView(R.layout.main_land);
            final cal rs=new cal();
            final int[] flag=new int[1];
            flag[0]=0;
            final int[] k = {0};
            final TextView text=(TextView)findViewById(R.id.textView);
            Button btn0=(Button)findViewById(R.id.btn_0);
            Button btn1=(Button)findViewById(R.id.btn_1);
            Button btn2=(Button)findViewById(R.id.btn_2);
            Button btn3=(Button)findViewById(R.id.btn_3);
            Button btn4=(Button)findViewById(R.id.btn_4);
            Button btn5=(Button)findViewById(R.id.btn_5);
            Button btn6=(Button)findViewById(R.id.btn_6);
            Button btn7=(Button)findViewById(R.id.btn_7);
            Button btn8=(Button)findViewById(R.id.btn_8);
            Button btn9=(Button)findViewById(R.id.btn_9);
            Button zuo=(Button)findViewById(R.id.zuo);
            Button you=(Button)findViewById(R.id.you);
            Button jia=(Button)findViewById(R.id.btn_jia);
            Button jian=(Button)findViewById(R.id.btn_jian);
            Button cheng=(Button)findViewById(R.id.btn_cheng);
            Button chu=(Button)findViewById(R.id.btn_chu);
            Button dian=(Button)findViewById(R.id.btn_point);
            Button deng=(Button)findViewById(R.id.btn_equal);
            Button jinzhi=(Button)findViewById(R.id.btn_jin);
            Button dan=(Button)findViewById(R.id.btn_danwei);
            Button caidan=(Button)findViewById(R.id.btn_menu);
            Button clean=(Button)findViewById(R.id.btn_clean);
            Button del=(Button)findViewById(R.id.btn_del);
            Button sin=(Button)findViewById(R.id.btn_sin);
            Button cos=(Button)findViewById(R.id.btn_cos);
            Button cifang=(Button)findViewById(R.id.btn_cifang);
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
            jia.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String str=text.getText()+"+";
                    text.setText(str);
                }
            });
            jian.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String str=text.getText()+"-";
                    text.setText(str);
                }
            });
            cheng.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String str=text.getText()+"*";
                    text.setText(str);
                }
            });
            chu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String str=text.getText()+"÷";
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
            deng.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(flag[0]==0){
                        String str=text.getText().toString();
                        text.setText(rs.run(str));
                    }else{
                        if(flag[0]==1){
                            String str=text.getText().toString();
                            str=str.substring(3,str.length());
                            double du=Math.toRadians(Double.parseDouble(str));
                            double a= Math.sin(du);
                            String b;
                            b = ""+a;
                            text.setText(b);
                        }else if(flag[0]==2){
                            String str=text.getText().toString();
                            str=str.substring(3,str.length());
                            double du=Math.toRadians(Double.parseDouble(str));
                            double a= Math.cos(du);
                            String b;
                            b = ""+a;
                            text.setText(b);
                        }else{
                            String str=text.getText().toString();
                            String str1="",str2="";
                            for(int i=0;i<str.length();i++){
                                if(str.charAt(i)=='^'){
                                    k[0] =i;
                                }
                            }
                            for(int i = 0; i< k[0]; i++){
                                str1=str1+str.charAt(i);
                            }
                            for(int i = k[0]+1; i<str.length(); i++){
                                str2=str2+str.charAt(i);
                            }
                            double a= Double.parseDouble(str1);
                            double b= Double.parseDouble(str2);
                            double rs=Math.pow(a,b);
                            String c;
                            c = ""+rs;
                            text.setText(c);
                        }
                    }
                    flag[0]=0;
                    k[0]=0;
                }

            });
            zuo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String str=text.getText()+"(";
                    text.setText(str);
                }
            });
            you.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String str=text.getText()+")";
                    text.setText(str);
                }
            });
            caidan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    PopupMenu popupMenu = new PopupMenu(MainActivity.this,v);
                    popupMenu.getMenuInflater().inflate(R.menu.main,popupMenu.getMenu());

                    //弹出式菜单的菜单项点击事件
                    popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {

                        @Override
                        public boolean onMenuItemClick(MenuItem item) {
                            switch (item.getItemId()) {
                                case R.id.help:
                                    break;
                                case R.id.exit:
                                    android.os.Process.killProcess(android.os.Process.myPid());
                                    break;
                            }
                            return false;
                        }
                    });
                    popupMenu.show();


                }
            });
            jinzhi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(MainActivity.this,jinzhizhuanhuan.class);
                    startActivity(intent);
                }
            });
            dan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(MainActivity.this,danweihuansuan.class);
                    startActivity(intent);
                }
            });
            clean.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    text.setText("");
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
            sin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    flag[0]=1;
                    text.setText("sin");
                }
            });
            cos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    flag[0]=2;
                    text.setText("cos");
                }
            });
            cifang.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String str=text.getText().toString();
                    flag[0]=3;
                    text.setText(str+"^");
                }
            });
        }else{
            //否则，在这里设置竖屏的UI
            setContentView(R.layout.activity_main);
            final cal rs=new cal();
            final TextView text=(TextView)findViewById(R.id.textView);
            Button btn0=(Button)findViewById(R.id.btn_0);
            Button btn1=(Button)findViewById(R.id.btn_1);
            Button btn2=(Button)findViewById(R.id.btn_2);
            Button btn3=(Button)findViewById(R.id.btn_3);
            Button btn4=(Button)findViewById(R.id.btn_4);
            Button btn5=(Button)findViewById(R.id.btn_5);
            Button btn6=(Button)findViewById(R.id.btn_6);
            Button btn7=(Button)findViewById(R.id.btn_7);
            Button btn8=(Button)findViewById(R.id.btn_8);
            Button btn9=(Button)findViewById(R.id.btn_9);
            Button zuo=(Button)findViewById(R.id.zuo);
            Button you=(Button)findViewById(R.id.you);
            Button jia=(Button)findViewById(R.id.btn_jia);
            Button jian=(Button)findViewById(R.id.btn_jian);
            Button cheng=(Button)findViewById(R.id.btn_cheng);
            Button chu=(Button)findViewById(R.id.btn_chu);
            Button dian=(Button)findViewById(R.id.btn_point);
            Button deng=(Button)findViewById(R.id.btn_equal);
            Button jinzhi=(Button)findViewById(R.id.btn_jin);
            Button dan=(Button)findViewById(R.id.btn_danwei);
            Button caidan=(Button)findViewById(R.id.btn_menu);
            Button clean=(Button)findViewById(R.id.btn_clean);
            Button del=(Button)findViewById(R.id.btn_del);
            Button sin=(Button)findViewById(R.id.btn_sin);
            Button cos=(Button)findViewById(R.id.btn_cos);
            Button cifang=(Button)findViewById(R.id.btn_cifang);
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
            jia.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String str=text.getText()+"+";
                    text.setText(str);
                }
            });
            jian.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String str=text.getText()+"-";
                    text.setText(str);
                }
            });
            cheng.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String str=text.getText()+"*";
                    text.setText(str);
                }
            });
            chu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String str=text.getText()+"÷";
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
            deng.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                        String str=text.getText().toString();
                        text.setText(rs.run(str));

                    }
            });
            zuo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String str=text.getText()+"(";
                    text.setText(str);
                }
            });
            you.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String str=text.getText()+")";
                    text.setText(str);
                }
            });
            caidan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    PopupMenu popupMenu = new PopupMenu(MainActivity.this,v);
                    popupMenu.getMenuInflater().inflate(R.menu.main,popupMenu.getMenu());

                    //弹出式菜单的菜单项点击事件
                    popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {

                        @Override
                        public boolean onMenuItemClick(MenuItem item) {
                            switch (item.getItemId()) {
                                case R.id.help:
                                    break;
                                case R.id.exit:
                                    android.os.Process.killProcess(android.os.Process.myPid());
                                    break;
                            }
                            return false;
                        }
                    });
                    popupMenu.show();


                }
            });
            jinzhi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(MainActivity.this,jinzhizhuanhuan.class);
                    startActivity(intent);
                }
            });
            dan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(MainActivity.this,danweihuansuan.class);
                    startActivity(intent);
                }
            });
            clean.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    text.setText("");
                }
            });
            del.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String str=text.getText().toString();
                    if(str.length()>1) {
                        str = str.substring(0, str.length() - 1);
                        text.setText(str);
                    }
                }
            });


        }


    }

}