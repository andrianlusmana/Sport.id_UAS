package com.example.sportid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class barang_ortus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barang_ortus);
    }

    public void kembali_home(View view){
        Intent kembali_kehome = new Intent(this, Home.class);
        startActivity(kembali_kehome);
    }
}