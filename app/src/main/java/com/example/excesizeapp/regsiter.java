package com.example.excesizeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class regsiter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regsiter);

        Button button=(Button) findViewById(R.id.regsiter_return);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //创建intent实例
                Intent intent=new Intent(regsiter.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
