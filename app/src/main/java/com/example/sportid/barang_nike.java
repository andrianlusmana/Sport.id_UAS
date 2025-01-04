package com.example.sportid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class barang_nike extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barang_nike);
    }
    public void kembali_homennike(View view){
        Intent kembali_kehome = new Intent(this, Home.class);
        startActivity(kembali_kehome);
    }
}