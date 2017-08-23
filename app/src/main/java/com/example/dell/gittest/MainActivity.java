package com.example.dell.gittest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button but1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        //大家好,这是第一次提交

        //张凯雅
    }

    private void initView() {
        but1 = (Button) findViewById(R.id.but1);

        but1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.but1:
        startActivity(new Intent(MainActivity.this,Main2Activity.class));
                break;
        }
    }
}
