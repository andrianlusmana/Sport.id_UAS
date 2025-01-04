package com.example.sportid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class barang_armour extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barang_armour);
    }
    public void kembali_homenarmour(View view){
        Intent kembali_kehome = new Intent(this, Home.class);
        startActivity(kembali_kehome);
    }
}