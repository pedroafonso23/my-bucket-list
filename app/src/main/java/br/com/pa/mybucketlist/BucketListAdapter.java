package br.com.pa.mybucketlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BucketListAdapter extends RecyclerView.Adapter<BucketListAdapter.BucketListViewHolder> {
    private final BucketListItem[] bucketListItems;

    public BucketListAdapter(BucketListItem[] bucketListItems) {
        this.bucketListItems = bucketListItems;
    }

    @Override
    public int getItemCount() {
        return bucketListItems.length;
    }

    @NonNull
    @Override
    public BucketListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_bucket_list, parent, false);

        return new BucketListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BucketListViewHolder holder, int position) {
        holder.bind(bucketListItems[position]);
    }

    static class BucketListViewHolder extends RecyclerView.ViewHolder {
        private final TextView itemTitle;
        private final ImageView itemImage;

        public BucketListViewHolder(@NonNull View itemView) {
            super(itemView);

            itemTitle = itemView.findViewById(R.id.text_view_item_title);
            itemImage = itemView.findViewById(R.id.image_view_bucket_list_item);
        }

        public void bind(BucketListItem bucketListItem) {
            itemTitle.setText(bucketListItem.title);
            itemImage.setImageResource(bucketListItem.image);
        }
    }
}
