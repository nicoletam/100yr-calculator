package com.example.nicole.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickCalc(View v){
        EditText user_age = (EditText) findViewById(R.id.userage);
        String user_input = user_age.getText().toString();
        int value = Integer.parseInt(user_input);

        int yrs_left = 100 - value;
        Toast.makeText(this, "You have "+ yrs_left+ " years left until you are 100!",
                Toast.LENGTH_SHORT).show();
        Log.i("info","The user clicked the button");
    }


}
