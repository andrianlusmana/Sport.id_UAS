package com.example.sportid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }



//  BAGIAN NAVBAR

    public void bukacart(View view){
        Intent bukakeranjang = new Intent(this, keranjang_Activity.class);
        startActivity(bukakeranjang);
    }
    public void bukaprofil(View view){
        Intent bukaprofil = new Intent(this, profil_Activity.class);
        startActivity(bukaprofil);
    }


    public void bukaortus3(View view){
        Intent bukabarang = new Intent(this, barang_ortus.class);
        startActivity(bukabarang);
    }

    public void bukanike1(View view){
        Intent buka_barang_nike = new Intent(this, barang_nike.class);
        startActivity(buka_barang_nike);
    }

    public void bukaarmour1(View view){
        Intent buka_barang_armour = new Intent(this, barang_armour.class);
        startActivity(buka_barang_armour);
    }

}