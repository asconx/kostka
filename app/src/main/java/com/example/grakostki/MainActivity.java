package com.example.grakostki;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import  java.util.Random;

public class MainActivity extends AppCompatActivity {

    int wynikGry;

    private int losujNumer() {
        Random rn = new Random();
        return rn.nextInt(6);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        TextView wynikText = findViewById(R.id.wynikText);
        TextView wynikGryText = findViewById(R.id.wynikGry);
        wynikGry = 0;

        Button losuj = findViewById(R.id.losuj);

        Button resetuj = findViewById(R.id.resetuj);

        ImagineView[] kostki = {
                findViewById(R.id.kostka1),
                findViewById(R.id.kostka2),
                findViewById(R.id.kostka3),
                findViewById(R.id.kostka4),
                findViewById(R.id.kostka5)
        };

        int[] sciany ={
                R.drawable.a,
                R.drawable.b,
                R.drawable.c,
                R.drawable.d,
                R.drawable.e,
                R.drawable.f
        };
        losuj.setOnClickListener(v ->{
            int wynik = 0;
            for(int i = 0; i < 6; i++){
                int wylosowanyNumer = losujNumer();
                Drawable img = ContextCompat.getDrawable(MainActivity.this, sciany[wylosowanyNumer]);
                kostki[i].setImageDrawable(img);
                wynik += wylosowanyNumer + 1;
            }
            wynikGry += wynik;
            wynikText.setText("Wynik losowania: " + wynik);
            wynikGryText.setText("Wynik gry: " + wynikGry);
        });

        resetuj.setOnClickListener(v -> { // Ustawienie listenera na przycisku resetowania.
            for(int i = 0; i < 6; i++) { // Pętla iterująca przez wszystkie kostki.
                Drawable img = ContextCompat.getDrawable(MainActivity.this, R.drawable.z); // Ustawienie obrazka pustej kostki.
                kostki[i].setImageDrawable(img); // Ustawienie obrazka na kostkach.
            }
            wynikText.setText("Wynik losowania: 0"); // Resetowanie wyświetlanego wyniku losowania.
            wynikGryText.setText("Wynik gry: 0"); // Resetowanie wyświetlanego wyniku gry.
            wynikGry = 0; // Resetowanie całkowitego wyniku gry na 0.
        });
    }
}
