package com.example.guess_number_game;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity7 extends AppCompatActivity {
    TextView resultText;
    int finalNumber;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_7);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        resultText = findViewById(R.id.resultText);
        finalNumber = getIntent().getIntExtra("total6", 0);

        resultText.setText("🎉 Tú número es: " + finalNumber + " 🎉");
    }

    public void btnRegresar(View v) {
        Intent it = new Intent(getApplicationContext(), MainActivity.class);
       startActivity(it);
    }

}