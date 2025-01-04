package com.example.sportid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class keranjang_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keranjang);
    }



//  BAGIAN NAVBAR

    public void bukahome(View view){
        Intent bukahome = new Intent(this, Home.class);
        startActivity(bukahome);
    }
    public void bukaprofil(View view){
        Intent bukaprofil = new Intent(this, profil_Activity.class);
        startActivity(bukaprofil);
    }
    public void kembalihome(View view){
        Intent kembalihome = new Intent(this, Home.class);
        startActivity(kembalihome);
    }
}