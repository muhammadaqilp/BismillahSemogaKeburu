package com.example.bismillahsemogakeburu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AkunActivity extends AppCompatActivity {

    Toolbar toolbar;
    Button editProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akun);

        toolbar = findViewById(R.id.toolbar);
        editProfile = findViewById(R.id.btn_edit_profile);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        editProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent edit = new Intent(AkunActivity.this, AkunEditActivity.class);
                startActivity(edit);
            }
        });

    }
}
