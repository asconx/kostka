package com.example.grakostki;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView[] diceImages;
    private TextView resultTextView;
    private int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = findViewById(R.id.button);
        Button resetButton = findViewById(R.id.button4);
        resultTextView = findViewById(R.id.textView4);

        diceImages = new ImageView[]{
                findViewById(R.id.imageView),
                findViewById(R.id.imageView2),
                findViewById(R.id.imageView3),
                findViewById(R.id.imageView4),
                findViewById(R.id.imageView5)
        };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetScore();
            }
        });
    }

    private void rollDice() {
        score = 0;
        Random random = new Random();
        for (ImageView diceImage : diceImages) {
            int diceValue = random.nextInt(6) + 1; // Losuj wartość od 1 do 6
            int drawableId;

            switch (diceValue) {
                case 1:
                    drawableId = R.drawable.k1; // Zmiana na odpowiednie zasoby
                    break;
                case 2:
                    drawableId = R.drawable.k2;
                    break;
                case 3:
                    drawableId = R.drawable.k3;
                    break;
                case 4:
                    drawableId = R.drawable.k4;
                    break;
                case 5:
                    drawableId = R.drawable.k5;
                    break;
                case 6:
                    drawableId = R.drawable.k6;
                    break;
                default:
                    drawableId = R.drawable.k1; // Domyślny przypadek
            }

            diceImage.setImageResource(drawableId);
            score += diceValue;
        }
        resultTextView.setText(score); // Wyświetlanie wyniku
    }

    private void resetScore() {
        score = 0;
        resultTextView.setText(score); // Resetowanie wyniku
        for (ImageView diceImage : diceImages) {
            diceImage.setImageResource(R.drawable.x); // Ustaw domyślny obrazek
        }
    }
}
