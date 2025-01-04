package com.example.sportid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

        public void bukahome(View view){
            Intent bukalogin = new Intent(this, Home.class);
            startActivity(bukalogin);
        }

    public void bukasignup(View view){
        Intent buka_signup = new Intent(this, signup_Activity.class);
        startActivity(buka_signup);
    }

}