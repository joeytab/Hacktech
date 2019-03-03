package com.example.hacktech;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MakingTest extends AppCompatActivity {
    public final static String EXTRA_QUESTION = "com.example.hacktech.QUESTION";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_making_test);
    }
    public void saveInput(View view){
        Intent intent = new Intent(this, MakingTest.class);
        EditText question= (EditText) findViewById(R.id.editText);
        String message = question.getText().toString();
        intent.putExtra(EXTRA_QUESTION, message);
        EditText answer1 = (EditText) findViewById(R.id.editText2);
        String first_answer = answer1.getText().toString();
        intent.putExtra(EXTRA_QUESTION, first_answer);
        EditText answer2 = (EditText) findViewById(R.id.editText3);
        String second_answer = answer2.getText().toString();
        intent.putExtra(EXTRA_QUESTION, second_answer);
        EditText answer3 = (EditText) findViewById(R.id.editText2);
        String third_answer = answer3.getText().toString();
        intent.putExtra(EXTRA_QUESTION, third_answer);
        startActivity(intent);
    }
}
