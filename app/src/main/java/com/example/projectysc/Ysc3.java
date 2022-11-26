package com.example.projectysc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

import androidx.appcompat.app.AlertDialog;

public class Ysc3 extends Activity {

    Button button1, button2;
    RadioButton bugger1,bugger2,bugger3,bugger4,bugger5;
    ImageView image1;
    View dialogView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ysc3);

        button1=(Button) findViewById(R.id.button5);
        button2=(Button) findViewById(R.id.button6);
        bugger1=(RadioButton) findViewById(R.id.bugger11);
        bugger2=(RadioButton) findViewById(R.id.bugger12);
        bugger3=(RadioButton) findViewById(R.id.bugger13);
        bugger4=(RadioButton) findViewById(R.id.bugger14);
        bugger5=(RadioButton) findViewById(R.id.bugger15);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogView=View.inflate(Ysc3.this, R.layout.dialog1, null);
                AlertDialog.Builder dlg=new AlertDialog.Builder(Ysc3.this);
                image1=dialogView.findViewById(R.id.image3);
                dlg.setView(dialogView);

                if(bugger1.isChecked()) {
                    image1.setImageResource(R.drawable.deri);
                    dlg.setTitle("데리버거");
                } else if(bugger2.isChecked()) {
                    image1.setImageResource(R.drawable.bullgogi);
                    dlg.setTitle("불고기버거");
                } else if(bugger3.isChecked()) {
                    image1.setImageResource(R.drawable.hanwoo);
                    dlg.setTitle("한우불고기버거");
                } else if(bugger4.isChecked()) {
                    image1.setImageResource(R.drawable.rice);
                    dlg.setTitle("라이스버거");
                } else if(bugger5.isChecked()) {
                    image1.setImageResource(R.drawable.classic);
                    dlg.setTitle("클래식치즈버거");
                }
                dlg.setNegativeButton("닫기",null);
                dlg.show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }


}