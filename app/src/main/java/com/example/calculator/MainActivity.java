package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button b1,b2,b3,b4;
TextView t1;
EditText et1,et2;
float a, b,r;
private void init()
{
    b1 = findViewById(R.id.b1);
    b2 = findViewById(R.id.b2);
    b3 = findViewById(R.id.b3);
    b4 = findViewById(R.id.b4);
    t1 = findViewById(R.id.t1);
    et1 = findViewById(R.id.editText);
    et2 = findViewById(R.id.et2);
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       init();

    b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            a=Float.parseFloat(et1.getText().toString());
            b = Float.parseFloat(et2.getText().toString());
            r = a + b;

            t1.setText("ADDITION IS "+r);
            Toast.makeText(MainActivity.this, "Addition of the given Number is "+r, Toast.LENGTH_SHORT).show();
        }

    });
    b2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            a=Float.parseFloat(et1.getText().toString());
            b = Float.parseFloat(et2.getText().toString());
            r = a-b;
            t1.setText("SUBTRACTION IS "+r);
            Toast.makeText(MainActivity.this, "Subtraction of given Number is "+r, Toast.LENGTH_SHORT).show();
        }
    });
    b3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            a=Float.parseFloat(et1.getText().toString());
            b = Float.parseFloat(et2.getText().toString());
            r = a*b;
            t1.setText("MULTIPLICATION IS "+r);
            Toast.makeText(MainActivity.this, "Multiplication of given Number is = "+r, Toast.LENGTH_SHORT).show();
        }
    });
    b4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            a=Float.parseFloat(et1.getText().toString());
            b = Float.parseFloat(et2.getText().toString());
            r = (a/b);
            t1.setText("DIVISION IS "+r);
            Toast.makeText(MainActivity.this, "Division of given Number is "+r, Toast.LENGTH_SHORT).show();
        }
    });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}



