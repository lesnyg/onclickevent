package com.lesnyg.edu.onclickevent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn01,btn02;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn01 = (Button)findViewById(R.id.btn01);
        btn01.setOnClickListener(this);
        btn02 = (Button)findViewById(R.id.btn02);
        btn02.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btn01){
            Toast.makeText(this,((Button)v).getText(),Toast.LENGTH_SHORT).show();
        }else if(v.getId()==R.id.btn02){
            Toast.makeText(this,((Button)v).getText(),Toast.LENGTH_SHORT).show();
        }
    }
}
