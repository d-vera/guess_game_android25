package com.example.guess_number_game;

import android.animation.Animator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.airbnb.lottie.LottieAnimationView;


public class Activity6 extends AppCompatActivity {
    int finalNumber;  // Stores the guessed number from Activity5
    LottieAnimationView lottieView;  // Refers to the Lottie animation view

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_6);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        // Get number
        finalNumber = getIntent().getIntExtra("total5", 0);

        // Get Lottie view
        lottieView = findViewById(R.id.lottieAnimation);
        lottieView.setSpeed(1.0f);
        lottieView.playAnimation();

        // Wait 3 seconds, go to Activity7
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(getApplicationContext(), Activity7.class);
            intent.putExtra("total6", finalNumber);
            startActivity(intent);
            finish();
        }, 3000); // 3 seconds
    }
}
