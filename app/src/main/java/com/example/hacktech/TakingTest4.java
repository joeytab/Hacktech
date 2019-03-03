package com.example.hacktech;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class TakingTest4 extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taking_test);
        radioGroup = findViewById(R.id.radioGroup);
        Button buttonApply = findViewById(R.id.button_apply);
        buttonApply.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int radioId = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(radioId);
                //textView.
            }

        });
    }
    public void checkButton(View v){
        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
        //Toast.makeText(this, "Selected Radio Button: " + radioButton.getText(),)
    }
}


