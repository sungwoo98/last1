package com.example.projectysc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

import androidx.appcompat.app.AlertDialog;

public class Ysc1 extends Activity {

    Button button1, button2;
    RadioButton bugger1,bugger2,bugger3,bugger4,bugger5;
    ImageView image1;
    View dialogView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ysc1);
        setTitle("햄버거 알아보기");

        button1=(Button) findViewById(R.id.button1);
        button2=(Button) findViewById(R.id.button2);
        bugger1=(RadioButton) findViewById(R.id.bugger1);
        bugger2=(RadioButton) findViewById(R.id.bugger2);
        bugger3=(RadioButton) findViewById(R.id.bugger3);
        bugger4=(RadioButton) findViewById(R.id.bugger4);
        bugger5=(RadioButton) findViewById(R.id.bugger5);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogView=View.inflate(Ysc1.this, R.layout.dialog1, null);
                AlertDialog.Builder dlg=new AlertDialog.Builder(Ysc1.this);
                image1=dialogView.findViewById(R.id.image1);
                dlg.setView(dialogView);

                if(bugger1.isChecked()) {
                    image1.setImageResource(R.drawable.sanghai);
                    dlg.setTitle("상하이버거");
                } else if(bugger2.isChecked()) {
                    image1.setImageResource(R.drawable.bigmac);
                    dlg.setTitle("빅맥");
                } else if(bugger3.isChecked()) {
                    image1.setImageResource(R.drawable.oneninefive);
                    dlg.setTitle("1955버거");
                } else if(bugger4.isChecked()) {
                    image1.setImageResource(R.drawable.betodi);
                    dlg.setTitle("베이컨토마토디럭스");
                } else if(bugger5.isChecked()) {
                    image1.setImageResource(R.drawable.shushu);
                    dlg.setTitle("슈슈버거");
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
