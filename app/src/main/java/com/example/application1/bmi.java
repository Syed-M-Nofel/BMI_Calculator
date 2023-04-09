package com.example.application1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class bmi extends AppCompatActivity {


    TextView age, height, weight, ans;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        age=findViewById(R.id.editTextNumber);
        height=findViewById(R.id.editTextNumber2);
        weight=findViewById(R.id.editTextNumber3);
        ans=findViewById(R.id.textView8);

        submit=findViewById(R.id.button);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int age1=Integer.parseInt(age.getText().toString());
                int height1=Integer.parseInt(height.getText().toString());
                int weight1=Integer.parseInt(weight.getText().toString());

                double bmi;
                bmi= (weight1*10000);
                bmi= bmi/height1;
                bmi= bmi/height1;

                ans.setText(""+bmi);

            }
        });

    }
}