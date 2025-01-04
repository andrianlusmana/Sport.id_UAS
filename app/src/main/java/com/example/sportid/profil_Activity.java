package com.example.sportid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class profil_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
    }


//  BAGIAN NAVBAR
public void bukahome(View view){
    Intent bukahome = new Intent(this, Home.class);
    startActivity(bukahome);
    }

    public void bukacart(View view){
        Intent bukakeranjang = new Intent(this, keranjang_Activity.class);
        startActivity(bukakeranjang);
    }
}