package com.example.guess_number_game;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity5 extends AppCompatActivity {

    int total;
    Button btnYes;
    Button btnNo;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_5);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        total = getIntent().getIntExtra("total4", 0);
        btnYes=findViewById(R.id.btnYes5);
        btnNo=findViewById(R.id.btnNo5);
    }
    public void buttonAccept(View v) {
        Intent it = new Intent(getApplicationContext(), Activity6.class);
        it.putExtra("total5", total+16);
        startActivity(it);
    }

    public void buttonReject(View v) {
        Intent it = new Intent(getApplicationContext(), Activity6.class);
        it.putExtra("total5", total);

        startActivity(it);
    }
}