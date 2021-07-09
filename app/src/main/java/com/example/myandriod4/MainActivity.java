package com.example.myandriod4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindColor;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.tv_hello) TextView hello;
    @BindView(R.id.tv_bye) TextView bye;
    @BindString(R.string.app_name) String appName;
    @BindColor(R.color.black) int color;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        hello.setOnClickListener(this);
        bye.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.tv_hello){
            Toast.makeText(this,"Hello Click", Toast.LENGTH_LONG).show();
        }else if (v.getId() == R.id.tv_bye){
            Toast.makeText(this,"Hello Bye", Toast.LENGTH_LONG).show();
        }
    }
}