package app.atti.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import app.atti.R;

import java.util.ArrayList;

public class Recommend_Detail_RecyclerAdapter extends RecyclerView.Adapter<Recommend_Detail_RecyclerAdapter.ViewHolder> {
    ArrayList<String> items;

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;

        public ViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.rec_dt_ac_rv_img);
        }
    }

    public Recommend_Detail_RecyclerAdapter(ArrayList<String> items) {
        this.items = items;
    }


    @NonNull
    @Override
    public Recommend_Detail_RecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_recommend_detail_recyclerview, viewGroup, false);
        Recommend_Detail_RecyclerAdapter.ViewHolder vh = new Recommend_Detail_RecyclerAdapter.ViewHolder(v);

        return vh;
    }
    @Override
    public void onBindViewHolder(final @NonNull Recommend_Detail_RecyclerAdapter.ViewHolder vh, int i) {
        final String str_url = items.get(i);

        Glide.with(vh.itemView.getContext()).setDefaultRequestOptions(new RequestOptions().dontAnimate().override(5000,5000)).load(str_url).into(vh.image);
        Log.e("Extra glide",str_url);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
