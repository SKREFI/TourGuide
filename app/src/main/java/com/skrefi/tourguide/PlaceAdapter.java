package com.skrefi.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place>{

    public PlaceAdapter(Context context, ArrayList<Place> places){
        super(context,0,places);
    }

    public static class ViewHolder{
        ImageView ivMainImage;
        TextView tvName;
        TextView tvLink;
        TextView tvDescription;
        ViewHolder(View v){
            ivMainImage = v.findViewById(R.id.image);
            tvName = v.findViewById(R.id.name);
            tvLink = v.findViewById(R.id.link);
            tvDescription = v.findViewById(R.id.description);
        }
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder;

        if(convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Place place = getItem(position);
        if(place != null){
            viewHolder.ivMainImage.setImageResource(place.getImageRes());
            viewHolder.tvName.setText(place.getName());
            viewHolder.tvLink.setText(place.getLink());
            viewHolder.tvDescription.setText(place.getDescription());
        }

        return convertView;
    }
}
