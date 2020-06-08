package com.example.ex062;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    Switch sw;
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sw = (Switch)findViewById(R.id.sw);
        rg = (RadioGroup)findViewById(R.id.rg);
    }

    public void clickBtn(View view) {
        if(!sw.isChecked()) {
            changeColor();
        }
    }

    public void radioButtonClick(View view) {
        if(sw.isChecked()) {
            changeColor();
        }
    }

    public void changeColor()
    {
        int choice = rg.getCheckedRadioButtonId();
        View v = this.getWindow().getDecorView();

        switch (choice) {
            case R.id.rbRed:
                v.setBackgroundColor(Color.RED);
                break;
            case R.id.rbBlue:
                v.setBackgroundColor(Color.BLUE);
                break;
            case R.id.rbYellow:
                v.setBackgroundColor(Color.YELLOW);
                break;
            case R.id.rbGreen:
                v.setBackgroundColor(Color.GREEN);
                break;
        }
    }
}
