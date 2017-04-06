package com.example.administrator.test1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class test1 extends AppCompatActivity {
    RadioButton r1=null;
    RadioButton r2=null;
    RadioButton r3=null;
    RadioButton r4=null;
    RadioGroup radioGroup=null;
    RadioButton nowRadioButton=null;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);
        radioGroup=(RadioGroup) findViewById(R.id.radioGroup);

        r1=(RadioButton) findViewById(R.id.a);
        r2=(RadioButton) findViewById(R.id.b);
        r3=(RadioButton) findViewById(R.id.c);
        r4=(RadioButton) findViewById(R.id.d);
        r1.setClickable(true);
        radioGroup.setOnCheckedChangeListener(myChangeRadio);
        Button button1 =(Button) findViewById(R.id.button1);
        Button button2 =(Button) findViewById(R.id.button2);
        button1.setOnClickListener(new button1());
        button2.setOnClickListener(new button2());
    }
    class button1 implements View.OnClickListener{
        public void onClick(View v){
            if (nowRadioButton.getText().equals("in")){
                setTitle("你选择的答案是：是正确的！");
            } else {
                setTitle("你选择的答案是：是错误的！");
            }
        }
    }

    class button2 implements View.OnClickListener{
        public void onClick(View v){
            radioGroup.clearCheck();
            setTitle("美滋滋！");
        }
    }

    private RadioGroup.OnCheckedChangeListener myChangeRadio=new RadioGroup.OnCheckedChangeListener(){
        public void onCheckedChange(RadioGroup group,int checkedId){
            if(checkedId=r1.getId()){
                nowRadioButton=r1;
            }else if(checkedId=r2.getId()){
                nowRadioButton=r2;
            }else if(checkedId=r3.getId()){
                nowRadioButton=r3;
            }else if(checkedId=r4.getId()){
                nowRadioButton=r4;
            }
        }
    };
}

