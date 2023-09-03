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

        BucketListItem dev = new BucketListItem("Became a Senior Android Dev", R.drawable.android);
        BucketListItem fly = new BucketListItem("Fly", R.drawable.fly);
        BucketListItem rino = new BucketListItem("Ride a rhinoceros", R.drawable.rhinoceros);


        BucketListItem[] thingsToDo = {
                dev,
                fly,
                rino,
                dev,
                fly,
                rino,
                dev,
                fly,
                rino,
                dev,
                fly,
                rino,
        };

        BucketListAdapter adapter = new BucketListAdapter(thingsToDo);
        list.setAdapter(adapter);
    }
}