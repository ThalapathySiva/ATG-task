package com.example.sivaram.atg_task;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.koushikdutta.ion.Ion;

import java.util.ArrayList;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    private ArrayList mArrayList;
    LayoutInflater layoutInflater;

    public ImageAdapter(Context imageActivity, ArrayList imageArrayList) {
        mContext = imageActivity;
        mArrayList = imageArrayList;


    }

    @Override
    public int getCount() {
        return mArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater) mContext.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View v;
        ImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            v = layoutInflater.inflate(R.layout.grid_view_image_layout, null, false);
        } else {
            v = convertView;
        }
        v.findViewById(R.id.front).setVisibility(View.VISIBLE);
        v.findViewById(R.id.back).setVisibility(View.GONE);

        ImageModel imageObject = (ImageModel) mArrayList.get(position);
        ImageView imageViewCell = (ImageView) v.findViewById(R.id.imageView);
        TextView imageOwnerNameTextView = (TextView) v.findViewById(R.id.imageOwnerTextView);
        TextView imageTitleTextView = (TextView) v.findViewById(R.id.imageTitleTextView);

        Ion.with(imageViewCell)
                .load(imageObject.gettImageUrl());
        imageOwnerNameTextView.setText(imageObject.getOwner());
        imageTitleTextView.setText(imageObject.getTitle());


        return v;
    }

}
