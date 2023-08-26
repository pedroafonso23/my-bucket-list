package br.com.pa.mybucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ThingsToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bucket_list);

        RecyclerView list = findViewById(R.id.recycler_view_bucket_list);

        BucketListItem[] thingsToDo = {
                new BucketListItem("Became a Senior Android Dev", R.drawable.android),
                new BucketListItem("Fly", R.drawable.fly),
                new BucketListItem("Ride a rhinoceros", R.drawable.rhinoceros)
        };

        BucketListAdapter adapter = new BucketListAdapter(thingsToDo);
        list.setAdapter(adapter);
    }
}