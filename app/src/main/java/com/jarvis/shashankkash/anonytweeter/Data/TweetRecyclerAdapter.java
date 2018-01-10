package com.jarvis.shashankkash.anonytweeter.Data;

import android.app.DownloadManager;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.jarvis.shashankkash.anonytweeter.Model.Tweet;
import com.jarvis.shashankkash.anonytweeter.R;
import com.squareup.picasso.Picasso;

import java.util.Date;
import java.util.List;

/**
 * Created by Shashank Kashyap on 09-01-2018.
 */

public class TweetRecyclerAdapter extends RecyclerView.Adapter<TweetRecyclerAdapter.ViewHolder> {

    private Context context;
    private List<Tweet> tweetList;

    public TweetRecyclerAdapter(Context context, List<Tweet> tweetList) {
        this.context = context;
        this.tweetList = tweetList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.post_row, parent, false);
        return new ViewHolder(view,context);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Tweet tweet = tweetList.get(position);
        String imageURL = null;

        holder.title.setText(tweet.getTitle());
        holder.desc.setText(tweet.getDesc());


        java.text.DateFormat dateFormat = java.text.DateFormat.getInstance();
        String formattedDate = dateFormat.format(new Date(Long.valueOf(tweet.getTimestamp())).getTime());

        holder.timestamp.setText(formattedDate);

        imageURL = tweet.getImage();

        Picasso.with(context)
                .load(imageURL)
                .into(holder.image);

    }

    @Override
    public int getItemCount() {
        return tweetList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView title;
        public TextView desc;
        public TextView timestamp;
        public ImageView image;
        String userid;

        public ViewHolder(View view, Context ctx) {
            super(view);
            context = ctx;

            title = (TextView) view.findViewById(R.id.postTitleList);
            desc = (TextView) view.findViewById(R.id.postTextList);
            timestamp = (TextView) view.findViewById(R.id.timestampList);
            image = (ImageView) view.findViewById(R.id.postImageList);

            userid = null;

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //next Activity
                }
            });

        }
    }

}

