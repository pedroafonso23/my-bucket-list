package br.com.pa.mybucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class PlacesToGoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bucket_list);

        RecyclerView list = findViewById(R.id.recycler_view_bucket_list);

        BucketListItem hog = new BucketListItem("Hogwarts", R.drawable.hogwarts);
        BucketListItem moon = new BucketListItem("The Moon", R.drawable.moon);
        BucketListItem flor = new BucketListItem("Florence", R.drawable.florence);

        BucketListItem[] thingsToDo = {
                hog,
                moon,
                flor,
                hog,
                moon,
                flor,
                hog,
                moon,
                flor,
                hog,
                moon,
                flor,
                hog,
                moon,
                flor,
        };

        BucketListAdapter adapter = new BucketListAdapter(thingsToDo);
        list.setAdapter(adapter);
    }
}