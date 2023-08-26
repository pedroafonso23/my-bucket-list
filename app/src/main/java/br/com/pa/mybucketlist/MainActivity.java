package br.com.pa.mybucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView thingsToDoCardView = findViewById(R.id.card_view_things_to_do);
        CardView placesToGoCardView = findViewById(R.id.card_view_places_to_go);

        thingsToDoCardView.setOnClickListener(v -> {
            Intent thingsToDoIntent = new Intent(MainActivity.this, ThingsToDoActivity.class);
            startActivity(thingsToDoIntent);
        });

        placesToGoCardView.setOnClickListener(v -> {
            Intent placesToGoIntent = new Intent(MainActivity.this, PlacesToGoActivity.class);
            startActivity(placesToGoIntent);
        });
    }
}