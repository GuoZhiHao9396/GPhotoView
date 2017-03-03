package com.gzh.gphotoview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_01).setOnClickListener(this);
        findViewById(R.id.btn_02).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent in = null;
        switch (view.getId()) {
            case R.id.btn_01:
                in = new Intent(MainActivity.this, SingleActivity.class);
                break;
            case R.id.btn_02:
                in = new Intent(MainActivity.this, MuchActivity.class);
                break;
        }
        startActivity(in);
    }
}
