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

        BucketListItem[] thingsToDo = {
                new BucketListItem("Hogwarts", R.drawable.hogwarts),
                new BucketListItem("The Moon", R.drawable.moon),
                new BucketListItem("Florence", R.drawable.florence)
        };

        BucketListAdapter adapter = new BucketListAdapter(thingsToDo);
        list.setAdapter(adapter);
    }
}