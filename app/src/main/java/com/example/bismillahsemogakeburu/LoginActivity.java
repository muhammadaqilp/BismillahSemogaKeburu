package com.example.bismillahsemogakeburu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.bismillahsemogakeburu.Fragment.EducationFragment;
import com.example.bismillahsemogakeburu.Fragment.HomeFragment;
import com.example.bismillahsemogakeburu.Fragment.ShoppingFragment;

public class LoginActivity extends AppCompatActivity {

    Toolbar toolbar;
    TextView daftarsekarang;
    Button masuk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        toolbar = findViewById(R.id.toolbar);
        daftarsekarang = findViewById(R.id.daftarsekarang);
        masuk = findViewById(R.id.masuk);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                FragmentManager fm = getSupportFragmentManager();
//                EducationFragment em = new EducationFragment();
//                fm.beginTransaction().replace(R.id.wlwl, em).commit();
                Intent msk = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(msk);
            }
        });

        daftarsekarang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent daftar = new Intent(LoginActivity.this, DaftarActivity.class);
                startActivity(daftar);
            }
        });
    }
}

