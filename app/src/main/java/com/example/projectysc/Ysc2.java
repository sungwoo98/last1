package com.example.projectysc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

import androidx.appcompat.app.AlertDialog;

public class Ysc2 extends Activity {
    Button button1, button2;
    RadioButton bugger1,bugger2,bugger3,bugger4,bugger5;
    ImageView image1;
    View dialogView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ysc2);

        button1=(Button) findViewById(R.id.button3);
        button2=(Button) findViewById(R.id.button4);
        bugger1=(RadioButton) findViewById(R.id.bugger6);
        bugger2=(RadioButton) findViewById(R.id.bugger7);
        bugger3=(RadioButton) findViewById(R.id.bugger8);
        bugger4=(RadioButton) findViewById(R.id.bugger9);
        bugger5=(RadioButton) findViewById(R.id.bugger10);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogView=View.inflate(Ysc2.this, R.layout.dialog1, null);
                AlertDialog.Builder dlg=new AlertDialog.Builder(Ysc2.this);
                image1=dialogView.findViewById(R.id.image2);
                dlg.setView(dialogView);

                if(bugger1.isChecked()) {
                    image1.setImageResource(R.drawable.cheezewho);
                    dlg.setTitle("콰트로치즈와퍼");
                } else if(bugger2.isChecked()) {
                    image1.setImageResource(R.drawable.tongshrimp);
                    dlg.setTitle("통새우와퍼");
                } else if(bugger3.isChecked()) {
                    image1.setImageResource(R.drawable.longchick);
                    dlg.setTitle("롱치킨디럭스");
                } else if(bugger4.isChecked()) {
                    image1.setImageResource(R.drawable.monsterwho);
                    dlg.setTitle("몬스터와퍼");
                } else if(bugger5.isChecked()) {
                    image1.setImageResource(R.drawable.blackwho);
                    dlg.setTitle("기네스와퍼");
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