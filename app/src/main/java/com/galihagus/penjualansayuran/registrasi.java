package com.galihagus.penjualansayuran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ornach.nobobutton.NoboButton;

public class registrasi extends AppCompatActivity {

    NoboButton btndaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);

        getSupportActionBar().hide();

        btndaftar = (NoboButton) findViewById(R.id.btndaftar);

        btndaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(registrasi.this, Login.class);
                startActivity(i);
                finish();
            }
        });
    }
}
