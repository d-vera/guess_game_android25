package com.example.guess_number_game;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity3 extends AppCompatActivity {
    int total;
    Button btnYes;
    Button btnNo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        total = getIntent().getIntExtra("total2", 0);
        btnYes = findViewById(R.id.btnYes3);
        btnNo = findViewById(R.id.btnNo3);
    }

    public void buttonAccept(View v) {
        Intent it = new Intent(getApplicationContext(), Activity4.class);
        it.putExtra("total3", total+2);
        startActivity(it);
    }

    public void buttonReject(View v) {
        Intent it = new Intent(getApplicationContext(), Activity4.class);
        it.putExtra("total3", total);
        startActivity(it);
    }
}