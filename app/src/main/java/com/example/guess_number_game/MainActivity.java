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

public class MainActivity extends AppCompatActivity {
    Button btnYes;
    Button btnNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btnYes = findViewById(R.id.btnYes);
        btnNo = findViewById(R.id.btnNo);
    }

    public void buttonAccept(View v) {
        Intent it = new Intent(getApplicationContext(), Activity2.class);
        it.putExtra("total", 8);
        startActivity(it);
    }

    public void buttonReject(View v) {
        Intent it = new Intent(getApplicationContext(), Activity2.class);
        it.putExtra("total", 0);
        startActivity(it);
    }
}