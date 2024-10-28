package com.example.kosteczka;
import android.graphics.drawable.Drawable;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int wynikGry;
    private int losujNumer() {
        Random rn = new Random();
        return rn.nextInt(6);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        TextView wynikText = findViewById(R.id.textView3);
        TextView wynikGryText = findViewById(R.id.textView5);
        wynikGry = 0;

        Button losuj = findViewById(R.id.button);
        Button resetuj = findViewById(R.id.button2);

        ImageView[] kostki = {
                findViewById(R.id.kostka1),
                findViewById(R.id.kostka2),
                findViewById(R.id.kostka3),
                findViewById(R.id.kostka4),
                findViewById(R.id.kostka5),
                findViewById(R.id.kostka6)
        };
        int[] sciany = {
                R.drawable.kostka1,
                R.drawable.kostka2,
                R.drawable.kostka3,
                R.drawable.kostka4,
                R.drawable.kostka5,
                R.drawable.kostka6
        };

        losuj.setOnClickListener(v -> {
            int wynik = 0;
            for(int i = 0; i < 6; i++) {
                int wylosowanyNumer = losujNumer();
                Drawable img = ContextCompat.getDrawable(MainActivity.this, sciany[wylosowanyNumer]);
                kostki[i].setImageDrawable(img);
                wynik += wylosowanyNumer + 1;
            }
            wynikGry += wynik;
            wynikText.setText("Wynik losowania " + wynik);
            wynikGryText.setText("Wynik gry " + wynikGry);
        });

        resetuj.setOnClickListener(v -> {
            for(int i = 0; i < 6; i++) {
                Drawable img = ContextCompat.getDrawable(MainActivity.this, R.drawable.kostka_x);
                kostki[i].setImageDrawable(img);
            }
            wynikText.setText("Wynik losowania: 0");
            wynikGryText.setText("Wynik gry: 0");
            wynikGry = 0;
        });
    }

}