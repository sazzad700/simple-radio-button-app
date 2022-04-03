package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioButton pp;
    RadioGroup radioGroup;

    Button showbutt;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup=findViewById(R.id.radiogroup);
        showbutt=findViewById(R.id.shbutt);
        result=findViewById(R.id.text);

        showbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (radioGroup.getCheckedRadioButtonId()==R.id.butt1){
                    result.setText("you are female");
                }else {
                    result.setText("you are male");
                }



        }
 });
    }
}