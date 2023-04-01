package com.example.layout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ClearActivity extends AppCompatActivity {
    EditText et1, et2, et3;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clear);

        et1     = (EditText) findViewById(R.id.editText1);
        et2     = (EditText) findViewById(R.id.editText2);
        et3     = (EditText) findViewById(R.id.editText3);
        btn1    = (Button) findViewById(R.id.button1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("");
                et2.setText("");
                et3.setText("");
            }
        });

    }
}